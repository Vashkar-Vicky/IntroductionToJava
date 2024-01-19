package Studying_Threads;

public class Main {
    public static void main(String[] args){
        MyThread my = new MyThread();
        Thread t = new Thread(my);
        t.start();
//        my.run();
    }
}
