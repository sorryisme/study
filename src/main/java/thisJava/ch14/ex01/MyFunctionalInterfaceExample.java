package thisJava.ch14.ex01;

public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface fi;
        
        fi = () -> {
            String str = "method call";
            System.out.println(str);
        };
        fi.method();
        
        fi = () -> {
            System.out.println("method call2");
        };
        fi.method();
        
        fi = () -> System.out.println("method call3");
        fi.method();
        
    }
}
