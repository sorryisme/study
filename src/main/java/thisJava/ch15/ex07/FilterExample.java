package thisJava.ch15.ex07;

import java.util.Arrays;
import java.util.List;

public class FilterExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("홍길동", "신용권", "김자바", "신용권", "신민철");
       
        //중복제거
        names.stream()
        .distinct()
        .forEach(n -> System.out.println(n));
        System.out.println();
        
        //필터 조건
        names.stream()
        .filter(n -> n.startsWith("신"))
        .forEach(n -> System.out.println(n));
        System.out.println();
        
        //중복 제거 후 필터처리
        names.stream()
             .distinct()
             .filter(n -> n.startsWith("신"))
             .forEach(n-> System.out.println(n));
        
        
    }

}
