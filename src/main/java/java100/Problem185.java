package java100;

public class Problem185 {
    public static void main(String[] args) {
        StaticPrint mr1 = new StaticPrint();
        StaticPrint mr2 = new StaticPrint();
        StaticPrint mr3 = new StaticPrint();
        StaticLockPrint mr4 = new StaticLockPrint();
        StaticLockPrint mr5 = new StaticLockPrint();
        StaticLockPrint mr6 = new StaticLockPrint();
        
        Thread t1 = new Thread(mr4,"a");
        Thread t2 = new Thread(mr5,"b");
        Thread t3 = new Thread(mr6,"c");
        
        t1.start();
        t2.start();
        t3.start();
        
    }
}




class StaticPrint implements Runnable {
    private static int i = 0;
    public void run() { show(); }
    public void show() {
        for ( ; i < 100; i ++) {
            if (Thread.currentThread().getName().equals("a")) {
                System.out.println("[A"+i+"]");
            } else if (Thread.currentThread().getName().equals("b")) {
                System.out.println("[B"+i+"]");
            } else if(Thread.currentThread().getName().equals("c")) {
                System.out.println("[C"+i+"]");
            }
        }
    }
}

class StaticLockPrint implements Runnable {
    private static int i = 0;
    public void run() { show(); }
    public void show() {
        synchronized (StaticLockPrint.class) {
            for ( ; i < 100 ; i ++) {
                if (Thread.currentThread().getName().equals("a")) {
                    System.out.println("[A"+i+"]");
                } else if (Thread.currentThread().getName().equals("b")) {
                    System.out.println("[B"+i+"]");
                } else if(Thread.currentThread().getName().equals("c")) {
                    System.out.println("[C"+i+"]");
                }
            }
        }
       
    }
}