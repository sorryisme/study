package thisJava.ch12.ex06;

public class ThreadB extends Thread{
    public boolean stop = false;
    public boolean work = true;

    public void run() {
        while(!stop) {
            if(work) {
                System.out.println("Thread B 작업내용");
            } else {
                Thread.yield();
            }
        }
        System.out.println("threadB 종료");
    }
}