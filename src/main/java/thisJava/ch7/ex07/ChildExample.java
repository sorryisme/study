package thisJava.ch7.ex07;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;
        parent.method1();
        parent.method2();
        //parent.method3(); 호출 불가능. 사용할 거면 object down casting
    }
}
