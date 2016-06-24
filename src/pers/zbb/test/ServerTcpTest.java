package pers.zbb.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

/**
 * Created by Administrator on 2016/6/24.
 */
public class ServerTcpTest extends Thread {
    private ServerSocket serverSocket;

    public ServerTcpTest(int port) throws IOException{
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(10000);
    }

    public void run(){
        while (true){
            try {
                System.out.println("Waiting for client on port" +
                    serverSocket.getLocalPort() + "...");
                Socket server = serverSocket.accept();
                System.out.println("Just connected to " +
                    server.getRemoteSocketAddress());

                DataInputStream in = new DataInputStream(server.getInputStream());
                System.out.println(in.readUTF());

                Thread.sleep(5000);

                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                out.writeUTF("Thank you for connecting to " +
                    server.getLocalSocketAddress() + "\nGoodbye!");

                server.close();
            } catch (SocketTimeoutException s){
                System.out.println("Socket timed out");
            } catch (IOException e){
                e.printStackTrace();
                break;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        int port = 5678;
        try {
            Thread t = new ServerTcpTest(port);
            t.start();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
