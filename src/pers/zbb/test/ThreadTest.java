package pers.zbb.test;

/**
 * Created by Administrator on 2016/6/24.
 */
public class ThreadTest{
    public static void main(String[] args){
        new NewThread();
        try {
            for(int i = 5; i > 0; i--){
                System.out.println("Main thread run " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Main thread interrupted");
        }
    }
}

class NewThread extends Thread {
    NewThread(){
        super("My thread test");
        System.out.println("Child thread " + this);
        start();
    }

    public void run(){
        try {
            for(int i = 5; i > 0; i--){
                System.out.println("Child thread run " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Child thread interrupted");
        }
        System.out.println("Exit child thread");
    }
}
