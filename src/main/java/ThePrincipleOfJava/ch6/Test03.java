// 생성자와 초기화 블럭을 상속되지 않는다 멤버만 상속 된다
// 자손 클래스의 멤버 개수는 조상클래스와 같거나 더 크다 




package ThePrincipleOfJava.ch6;

public class Test03 {
    boolean power;
    int channel;
    
    void power() {
        power = !power;
    }
    void channelUp() {
        ++channel;
    }
    
    void channelDown() {
        --channel;
    }
    
}

class CaptionTv extends Test03{
    boolean caption;
    void displayCaption(String text) {
        if(caption) {
            System.out.println(text);
        }
    }
}


class CaptionTvTest{
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10; // 조상클래스 상속받음
        ctv.channelUp();// 조상클래스 상속받음
        System.out.println(ctv.channel);
        
        ctv.displayCaption("Hello world");
        ctv.caption =true;
        ctv.displayCaption("hello world");
        
    }
}
