package thisJava.ch12.ex11;

public class PrintThread2 extends Thread{
    private boolean stop;
    private long count;
    public void setSTop(boolean stop) {
        this.stop = stop;
    }
    
    public void run() {
        try {
            while(!stop) {
                System.out.println("실행 중 : " + count );
                count ++;
                Thread.sleep(1);// interrupt 시에 없으면 Exception이 발생되지 않는다
            }
    
        } catch (Exception e) {
            System.out.println("자원 정리");
            System.out.println("실행 종료");
        }
    }
    
}
