package ThePrincipleOfJava.ch15;

public class UserInfo implements java.io.Serializable {
    String name;
    String password;
    int age;
    
    
    public UserInfo() {
        this("Unknown","1111", 0);
    }
    
    public UserInfo(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserInfo [name=" + name + ", password=" + password + ", age=" + age + "]";
    }
    
    
}
