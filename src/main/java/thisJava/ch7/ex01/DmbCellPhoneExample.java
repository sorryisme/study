package thisJava.ch7.ex01;

public class DmbCellPhoneExample {
    public static void main(String[] args) {
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10 );
        
        // cell phone 상속받은 필드
        System.out.println("모델 : " + dmbCellPhone.model);
        System.out.println("색상 : " +dmbCellPhone.color);
        
        // dmbcellphone 필드
        
       System.out.println("채널 :" + dmbCellPhone.channel);
       
       dmbCellPhone.bell();
       dmbCellPhone.powerOff();
       dmbCellPhone.sendVoice("여보세요");
       dmbCellPhone.receiveVoice("안녕하세요 저는 홍길동인데요");
       dmbCellPhone.sendVoice("아예 반갑습니다.");
       dmbCellPhone.hangUp();
       
       
       // dmbCellPhone 메서드 호출
       
       dmbCellPhone.turnOnDmb();
       dmbCellPhone.changeChannelDmb(12);
       dmbCellPhone.turnOffDmb();
       
       
    }
}
