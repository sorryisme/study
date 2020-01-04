package thisJava.ch15.ex07;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", Member.MALE, 30),
                new Member("김나리", Member.FEMALE, 29),
                new Member("김지연", Member.MALE, 44),
                new Member("가각간", Member.FEMALE, 11)
                );
        
        double ageAvg = list.stream()
                .filter(m -> m.getSex() == Member.MALE)
                .mapToInt(Member::getAge)
                .average()
                .getAsDouble();
        
        System.out.println("남자 평균 나이 : " + ageAvg);
    }
}
