package thisJava.ch14.ex12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    private static List<Student> list = Arrays.asList(
            new Student ("홍길동", "남자", 90),
            new Student ("가각간", "여자", 40),
            new Student ("나낙나", "여자", 30)
        );
            
    
    public static double avg( Predicate<Student> predicate ) {
        
        int count = 0;
        int sum = 0;
        for ( Student student : list) {
            if(predicate.test(student)) {
                count ++;
                sum += student.getScore();
            }
        }
        
        return (double) sum / count;
    }
    
    public static void main(String[] args) {
        double maleAvg = avg( t -> t.getSex().equals("남자"));
        System.out.println("남자 평균 점수 "+ maleAvg);
        
        double femaleAvg = avg ( t->t.getSex().equals("여자"));
        System.out.println("여자 평균 점수" + femaleAvg);
     }
    
}
