package java100;

public class Problem182 {
    public static void main(String[] args) {
        MyRun mr1 = new MyRun();
        Thread t1 = new Thread(mr1);
        
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
        for(int i = 0;i < 100; i++) {
            System.out.println("M" + i);
        }
    }
}

class MyRun implements Runnable{
    @Override
    public void run() {
        show();
    }
    
    public void show() {
        for(int i = 0; i < 100; i ++) {
            System.out.println("S" + i );
        }
    }
    
    
}

class MyThread extends Thread {
    public void run() {
        for( int i = 0; i < 100; i ++) {
            System.out.println("T" + i );
        }
    }
    
    
}