//  조상클래스와 자손 클래스에 중복으로 선언된 변수를 사용한 경우
//  부모 변수 사용시 부모변수로 자손 변수 사용시 자손 변수를 사용한다


package ThePrincipleOfJava.ch7;

public class Test01 {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        
        System.out.println("p.x = " + p.x);
        System.out.println("c.x = " + c.x);
    }
}


class Parent {
    
    int  x = 100;
    void mehtod() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent{
    int x = 200;
    void method(){
        System.out.println("Child Method");
    }
}