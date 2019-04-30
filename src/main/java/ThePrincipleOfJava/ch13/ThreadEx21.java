package ThePrincipleOfJava.ch13;

public class ThreadEx21 {
    public static void main(String[] args) {
        Runnable r = new RunnableEx21();
        new Thread(r).start();
        new Thread(r).start();
    }
}   

class Account {
    private int balance = 1000;
    
    public int getBalance() {
        return balance;
    }
    
    // 다른쓰레드가 끼어들어 출금을 방지하기 위해 임계영역 지정
    public synchronized void withdraw(int money) {
        if(balance >= money) {
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            balance -= money;
        }
    } // withdraw
}

class RunnableEx21 implements Runnable {
    Account acc =new Account();
    
    public void run() {
        while(acc.getBalance() > 0) {
            
            int money = (int)(Math.random() * 3 +1 ) * 100;
            acc.withdraw(money);
            System.out.println("balanace" + acc.getBalance());
        }
    } // run
    
    
}