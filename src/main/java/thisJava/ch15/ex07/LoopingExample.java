package thisJava.ch15.ex07;

import java.util.Arrays;

public class LoopingExample {
    public static void main(String[] args) {
        int[] intArr = { 1, 2, 3, 4, 5};
        
        System.out.println("peek() 마지막에 호출한 경우");
        Arrays.stream(intArr)
                .filter(a -> a%2 == 0)
                .peek(n-> System.out.print(n));
        //fail Case
        
        System.out.println("peek() 중간 호출한 경우");
        int total = Arrays.stream(intArr)
        .filter(a -> a%2 == 0)
                .peek(n-> System.out.print(n))
                .sum();
        
       System.out.println(total);
        
       System.out.println("forEach 최종 호출 ");
       Arrays.stream(intArr)
           .filter(a-> a%2 == 0)
           .forEach(n-> System.out.print(n));
        
    }
}
