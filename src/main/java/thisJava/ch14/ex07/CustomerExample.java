package thisJava.ch14.ex07;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class CustomerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = t -> System.out.println(t + 9);
        consumer.accept("text");
        
        BiConsumer<String, String> bigConsumer = (t,u)-> System.out.println(t + u);
        bigConsumer.accept("text 1" , "text 2");
        
        DoubleConsumer doubleConsumer = d -> System.out.println(d);
        doubleConsumer.accept(10L);
        
        
        ObjIntConsumer<String> objIntConsumer = (t,i) -> System.out.println(t + i);
        objIntConsumer.accept("Java", 8);
        
        
    }
}
