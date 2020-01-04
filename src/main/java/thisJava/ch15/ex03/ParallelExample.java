package thisJava.ch15.ex03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {
    public static void main(String[] args) {
        
        List<String> list = Arrays.asList(
                "홍길동", "임꺽정", "유관순","람다"
                );
        
        Stream<String> stream = list.stream();
        list.forEach(ParallelExample::print);
        System.out.println();
        
        /* Parallel */
        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(ParallelExample::print);
        
        
    }
    
    public static void print(String str) {
        System.out.println(str + " : " +  Thread.currentThread().getName());
    }
}   
