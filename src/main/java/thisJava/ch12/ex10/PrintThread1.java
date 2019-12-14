package thisJava.ch12.ex10;

public class PrintThread1 extends Thread{
    private boolean stop;
    private long count;
    public void setSTop(boolean stop) {
        this.stop = stop;
    }
    
    public void run() {
        while(!stop) {
            System.out.println("실행 중 : " + count );
            count ++;
        }
        
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
    
}
