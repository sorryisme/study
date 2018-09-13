package kosta_java.ex0913.map;

public class Person {
    private String id;
    private String name;
    private int age;
    public Person() {}
    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Person(String id, String name, int age) {
        this(id,name);
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("id=");
        builder.append(id);
        builder.append(", name=");
        builder.append(name);
        builder.append(", age=");
        builder.append(age);
        return builder.toString();
    }
    
    
    
}
