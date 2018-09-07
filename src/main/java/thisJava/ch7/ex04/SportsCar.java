package thisJava.ch7.ex04;

public class SportsCar extends Car{
    
    @Override
    public void speedUp() { speed += 10;}
    
    /* 오버라이딩 할 수 없음, final 메소드
    public void stop() {
        System.out.println("스포츠카를 멈춤");
        speed = 0;
    }
    */

}
