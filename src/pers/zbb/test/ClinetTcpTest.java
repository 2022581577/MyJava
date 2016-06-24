package pers.zbb.test;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by Administrator on 2016/6/23.
 */
public class ClinetTcpTest {
    public static void main(String[] args)
    {
        String serverName = "127.0.0.1";
        int port = 6789;
        try
        {
            System.out.println("Connecting to " + serverName + "on port " + port);
            Socket client = new Socket(serverName, port);
            System.out.println("Just connected to " + client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);
            out.writeUTF("Hello from " + client.getLocalSocketAddress());
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);
            System.out.println("Server says " + in.readUTF());
            client.close();
        }
        catch (UnknownHostException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
