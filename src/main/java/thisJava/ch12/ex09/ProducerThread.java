package thisJava.ch12.ex09;

public class ProducerThread extends Thread{
    private DataBox dataBox;
    
    public ProducerThread(DataBox dataBox) {
        this.dataBox = dataBox;
        // 공유 객체를 필드에 저장
    }

    @Override
    public void run() {
        for(int i=1; i<=3; i++) {
            String data = "Data-" + i;
            dataBox.setData(data);
            //새로운 데이터 저장
        }
    }
    
}
