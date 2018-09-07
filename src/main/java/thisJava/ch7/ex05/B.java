package thisJava.ch7.ex05;

public class B {
    public void method() {
        A a = new A(); // 같은 패키지 위치에 있어 객체생성!
        a.field = "value"; // 같은 패키지에 있어 멤버변수 접근 가능!
        a.method(); // 같은 패키지에 있어 메서드도 접근가능
        
    }
}
