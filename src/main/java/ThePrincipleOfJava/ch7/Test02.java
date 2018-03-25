package ThePrincipleOfJava.ch7;

public class Test02 {
    public static void main(String[] args) {
        Parent1 p = new Parent1();
        Child1 c = new Child1();
        
        System.out.println("p.x = " + p.x);
        System.out.println("c.x = " + c.x);
        c.mehtod();
    }
}


class Parent1 {
    int  x = 100;
    void mehtod() {
        System.out.println("Parent Method");
    }
}

class Child1 extends Parent{
}