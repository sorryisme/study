package thisJava.ch15.ex01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        
        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("IBATIS");
        
        int size = set.size();
        System.out.println("총 객체수 : "+ size);
        
        set.stream().forEach(s -> System.out.println(s));
        System.out.println("---------------------------------");
                
        set.remove("Java");
        set.remove("IBATIS");
        set.stream().forEach(s -> System.out.println(s));
    }
}
