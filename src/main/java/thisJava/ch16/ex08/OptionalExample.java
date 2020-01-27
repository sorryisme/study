package thisJava.ch16.ex08;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        
//        
//        double avg = list.stream()
//                        .mapToInt(Integer :: intValue)
//                        .average()
//                        .getAsDouble();

        // 1.
        
        OptionalDouble optional = list.stream()
                                        .mapToInt(Integer :: intValue)
                                        .average();
        if(optional.isPresent()) {
            System.out.println("방법1 : "+ optional.getAsDouble() );
        } else {
            System.out.println("방법 1 디폴트");
        }

        //2.
        double avg = list.stream()
                            .mapToInt(Integer :: intValue)
                            .average()
                            .orElse(0.0);
        System.out.println("방법2_평균" + avg);
        
        //3. 
        list.stream()
            .mapToInt(Integer :: intValue)
            .average()
            .ifPresent( a -> System.out.println("방법3_평균 : " + a));
        
    }
}
