package thisJava.ch15.ex03;

public class Person implements Comparable<Person>{

    public String name;
    public int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return age == o.age ? 0 : (age < o.age ? -1 : 1);
    }

}
