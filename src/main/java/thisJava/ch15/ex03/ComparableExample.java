package thisJava.ch15.ex03;

import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<Person>();
        Person person1 = new Person("홍길동", 45);
        treeSet.add(person1);
        
        person1 = new Person("김지염", 25);
        treeSet.add(person1);

        
        person1 = new Person("안녕", 25);
        treeSet.add(person1);
        
        person1 = new Person("박지원", 31);
        treeSet.add(person1);
        
        treeSet.stream().forEach( p -> System.out.println(p.name + " : " + p.age));
    }
}
