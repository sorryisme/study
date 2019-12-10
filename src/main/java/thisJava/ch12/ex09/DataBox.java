package thisJava.ch12.ex09;

public class DataBox {
    private String data;
    
    public synchronized String getData() {
        if(this.data == null ){
            try {
                wait();
            } catch (InterruptedException e) {}
        }//data 필드가 null이면 소비자 스레드를 일시정지
        
        String returnValue = data;
        System.out.println("conSumerThread가 읽은 데이터" + data);
        
        data = null;
        notify();
        //data 필드를 null 로 만들고 생산자 스레드를 실행 대기 상태로 만듬
        return returnValue;
    }
    
    public synchronized void setData(String data) {
        if(this.data != null ){
            try {
                wait();
            } catch (InterruptedException e) {}
        }//data 필드가 null아니면 생산자 스레드를 일시정지
        
        this.data = data;
        System.out.println("producerThread가 생성한 데이터" + data);
        notify();
    }
}
