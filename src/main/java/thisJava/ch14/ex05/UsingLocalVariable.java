package thisJava.ch14.ex05;

public class UsingLocalVariable {
    void method (int arg) { //arg는 final 특성을 가짐
        int localVar = 40; // local Var 또한 final
        
        MyfunctionalInterface fi = () -> {
          System.out.println("arg" + arg);
          System.out.println("LocalVar" + localVar + "\n");
        };
        
        fi.method();
        
    }
}
