package thisJava.ch7;

public class DmbCellPhone extends CellPhone{
    int channel;
    
    //생성자
    DmbCellPhone(String model, String color, int channel){
        this.model = model;
        this.color = color;
        //상속 받은 필드
        this.channel = channel;
        // dmbcell phone 필드
    }
    
    void turnOnDmb() {
        System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
    }
   
    void changeChannelDmb(int channel) {
        this.channel = channel;
        System.out.println("채널 "+ channel + "번으로 바꿉니다.");
    }
    
    void turnOffDmb() {
        System.out.println("Dmb 방송 수신을 멈춥니다");
    }
}
