package thisJava.ch14.ex13;

import java.util.function.Consumer;

public class ConsumerAndThenExample {
    public static void main(String[] args) {
        
        Consumer<Member> consumerA = (m) -> {
            System.out.println("Consumer A : " + m.getName());
        };
        
        Consumer<Member> consumerB = (m) -> {
            System.out.println("consumer B :" + m.getId());
        };
        
        Consumer<Member> consumerAB = consumerA.andThen(consumerB);
        Consumer<Member> consumerAB2 = consumerA.andThen((m) ->{ System.out.println("consumber B : " + m.getAddress());});
        
        consumerAB.accept(new Member("홍길동", "hong", null));
        System.out.println();
        consumerAB2.accept(new Member("test", "test", null));
        
    }
}
