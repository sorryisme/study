package thisJava.ch13.ex04;

public class Person {
    
    private String name;

    public Person() {}


    public Person(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }
    
    
    

}
