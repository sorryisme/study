package java100;

public class Problem184 {
    public static void main(String[] args) {
        MemberPrint mr1 = new MemberPrint();
        Thread t1 = new Thread(mr1, "a");
        Thread t2 = new Thread(mr1, "b");
        Thread t3 = new Thread(mr1, "c");
        
        t1.start();
        t2.start();
        t3.start();
    }
}


class MemberPrint implements Runnable {

    private int i = 0;
    
    @Override
    public void run() {
        show();
    }
    
    public void show() {
        for(; i < 100; i ++) {
            if(Thread.currentThread().getName().equals("a")) {
                System.out.println("[A " + i + "]");
            } else if (Thread.currentThread().getName().equals("b")) {
                System.out.println("[B " + i + "]");
            } else if (Thread.currentThread().getName().equals("c")) {
                System.out.println("[C" + i + "]");
            }
        }
    }
}