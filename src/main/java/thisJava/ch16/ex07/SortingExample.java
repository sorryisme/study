package thisJava.ch16.ex07;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {
    public static void main(String[] args) {
        
        IntStream intStream = Arrays.stream(new int[] {5,3,2,1,4});
        intStream.sorted()
                .forEach(n-> System.out.println(n + ","));
        System.out.println();
        
        List<StudentCompare> studentList = Arrays.asList(
                new StudentCompare("홍길동", 30),
                new StudentCompare("신용권", 10),
                new StudentCompare("유미선", 20)
                );
        
        studentList.stream()
                    .sorted()
                    .forEach(s -> System.out.print(s.getScore() + ","));
        System.out.println();
        studentList.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s.getScore()+","));
        
    }
}
