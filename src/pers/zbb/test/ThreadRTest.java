package pers.zbb.test;

/**
 * Created by Administrator on 2016/6/24.
 */
public class ThreadRTest {
    public static void main(String[] args){
        new NewTreadR();
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}

class NewTreadR implements Runnable{
    Thread t;
    NewTreadR() {
        t = new Thread(this, "thread r test");
        System.out.println("Child thread:" + t);
        t.start();
    }

    @Override
    public void run() {
        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Child thread: " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Child thread interrupted.");
        }
        System.out.println("Child thread stop.");
    }
}