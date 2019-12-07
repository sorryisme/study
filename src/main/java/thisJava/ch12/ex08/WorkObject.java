package thisJava.ch12.ex08;

public class WorkObject {
    public synchronized void methodA() {
        System.out.println("Thread A의 methodA 작업실행");
        notify();
        try { 
            wait();
        } catch (InterruptedException e) {
            
        }
        
    }
    
    public synchronized void methodB() {
        System.out.println("ThreadB의 method B 작업실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {
            
        }
    }
}
