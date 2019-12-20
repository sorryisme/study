package java100;

public class Problem185 {
    public static void main(String[] args) {
        StaticPrint mr1 = new StaticPrint();
        StaticPrint mr2 = new StaticPrint();
        StaticPrint mr3 = new StaticPrint();
        
        Thread t1 = new Thread(mr1);
        Thread t2 = new Thread(mr2);
        Thread t3 = new Thread(mr3);
        
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
