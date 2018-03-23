package ThePrincipleOfJava.ch6;

public class Test01 {
    int value;
}

class Data2{
    int value;
    
    Data2(int x){
    value = x;
    }
}

class ConstructorTest{
    public static void main(String[] args) {
        Test01 t1 = new Test01();
        Data2 d2 = new Data2(1);
    }
}