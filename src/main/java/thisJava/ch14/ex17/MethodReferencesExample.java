package thisJava.ch14.ex17;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {
    public static void main(String[] args) {
        IntBinaryOperator operator;
        
        operator = (x, y) -> Calculator.staticMethod(x, y);
        System.out.println("결과 1 :" + operator.applyAsInt(1, 2));
        
        operator = Calculator :: staticMethod;
        System.out.println("결과 2 :" +  operator.applyAsInt(1, 2));
        
        Calculator obj = new Calculator();
        operator = (x,y) -> obj.instanceMethod(x, y);
        System.out.println("결과3 :" + operator.applyAsInt(1, 2));
        
        operator = obj :: instanceMethod;
        System.out.println("결과 4 :" + operator.applyAsInt(1, 2));
    }
}
