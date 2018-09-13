package kosta_java.ex0913.map;

import java.util.Iterator;
import java.util.Map;

public class EndView {

    /**
     * 전체 출력
     */
    public static void printAll(Map<String, Person> map) {
        System.out.println("****전체 검색 List****");
        for(String a : map.keySet()) {
            System.out.println(map.get(a));
        }
        
    }

    public static void printSearch(Person person) {
        System.out.println( "이름 : "+ person.getName());
        if(person instanceof Student) {
            System.out.println( " 총점 : " + ((Student) person).getSum());
        } 
        
    }
    public static void printMessage(String message) {
        System.out.println(message);
    }
}
