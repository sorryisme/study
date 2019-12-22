package thisJava.ch14.ex02;

public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface fi;
        
        fi = (int a) -> {
            int result = a * 5 ;
            System.out.println(result);
        };
        fi.method(5);
        
        fi = (a) -> {
            System.out.println(a * 5);
        };
        fi.method(10);
        
        fi = x -> System.out.println(x * 5);
        fi.method(20);
        
    }
}
