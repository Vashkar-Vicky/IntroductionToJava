package Studying_Threads;

public class MyThread implements Runnable {
    public void run(){
        System.out.println("current Threads name : "+Thread.currentThread().getName());

    }
}
