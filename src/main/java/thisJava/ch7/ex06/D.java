package thisJava.ch7.ex06;

import thisJava.ch7.ex05.A;

public class D extends A{
    public D() {
        super();
        this.field = "value";
        this.method();
    }
    
    public static void main(String[] args) {
        //A a = new A(); 생성자의 경우 생성될 때 부모가 생성되니 가능
        
        
    }
}
