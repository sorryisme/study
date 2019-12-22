package thisJava.ch14.ex04;

public class UsingThis {

    public int outterfield = 10;
    
    class Inner {
        int innerField = 20;
        
        void method() {
            MyFunctionalInterface fi = ()->{
                System.out.println("outterField" + outterfield);
                System.out.println("outterfield" + UsingThis.this.outterfield + "\n"); //바깥쪽 참조를 얻기 위해 클래스.this 사용 
                System.out.println("innerField" + innerField+"\n"); 
                System.out.println("innerField" + this.innerField+"\n"); //this는 inner 객체
            };
            
            fi.method ();
        }
    }
}
