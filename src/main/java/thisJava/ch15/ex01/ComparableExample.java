package thisJava.ch15.ex01;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<Person>();
        treeSet.add(new Person("홍길동",45));
        treeSet.add(new Person("김자바", 25));
        treeSet.add(new Person("박지원", 31));
        // compareTo로 인해 저장시 나이순으로 저장
        
        Iterator<Person> iterator = treeSet.iterator();
        while(iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person.name +":"+person.age);
        }
    }
}
