package thisJava.ch14.ex19;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {
    public static void main(String[] args) {
        Function<String, Member> function1 = Member:: new;
        Member member1 = function1.apply("angel1");
        
        BiFunction<String, String, Member> function2 = Member :: new;
        Member member2 = function2.apply("신천사", "angel1");
        
    }
}

class Member {
    private String name;
    private String id;
    
    public Member() {
        System.out.println("Member() 실행");
    }
    
    public Member(String id) {
        System.out.println("Member(String id) 실행");
        this.id = id;
    }
    
    public Member(String name, String id) {
        System.out.println("Member(String name, String id) 실행");
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    
    
    
    
}