package thisJava.ch14.ex15;

import java.util.function.Predicate;

public class PredicateEqualExample {
    public static void main(String[] args) {
        
        Predicate<String> predicate;
        
        predicate = Predicate.isEqual(null);
        System.out.println(predicate.test(null));
        
        
        predicate = Predicate.isEqual("string");
        System.out.println(predicate.test(null));
        
        predicate = Predicate.isEqual(null);
        System.out.println(predicate.test("test"));
        
        predicate = Predicate.isEqual("test");
        System.out.println(predicate.test("test"));
        
        predicate = Predicate.isEqual("test");
        System.out.println(predicate.test("test2"));
        
        
        
    }
}
