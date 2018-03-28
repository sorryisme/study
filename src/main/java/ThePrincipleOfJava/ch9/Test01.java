package ThePrincipleOfJava.ch9;

public class Test01 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);
        if(v1.equals(v2))
            System.out.println("v1과 v2는 같습니다.");
        else 
            System.out.println("v1과 v2는 다릅니다.");
        
        // 서로의 주소가 다르기에 다르다고 나옴
        v2 = v1;
        
        if(v1.equals(v2))
            System.out.println("v1과 v2는 같습니다.");
        else 
            System.out.println("v1과 v2는 다릅니다.");
     }
}

class Value {
    int value;
    Value(int value){
        this.value = value;
    }
}