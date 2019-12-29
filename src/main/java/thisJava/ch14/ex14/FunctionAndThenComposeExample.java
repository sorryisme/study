package thisJava.ch14.ex14;

import java.util.function.Function;

public class FunctionAndThenComposeExample {
    public static void main(String[] args) {
        Function<Member, Address> functionA;
        Function<Address, String> functionB;
        Function <Member, String> functionAB;
        String city;
        
        functionA = (m) -> m.getAddress();
        functionB = (a) -> a.getCity();
        
        functionAB = functionA.andThen(functionB);
        //인터페이스 정의부터 처리
        
        city = functionAB.apply(
                new Member("홍길동", "hong", new Address("한국","서울"))
                );
        
        System.out.println("거주도시 :" + city);
                
        functionAB = functionB.compose(functionA);
        
        city = functionAB.apply(
                    new Member("홍길동", "hong", new Address("한국", "서울"))
                );

        System.out.println("거주도시 :" + city);
    }
}
