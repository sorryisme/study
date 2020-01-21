package thisJava.ch13.ex04;

public class Student extends Person{

    private String name;
    
    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + "]";
    }
    
    
}
