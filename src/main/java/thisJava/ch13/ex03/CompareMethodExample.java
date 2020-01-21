package thisJava.ch13.ex03;

public class CompareMethodExample {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "사과");
        Pair<Integer, String> p2 = new Pair<>(1, "사과");
        
        boolean result1 = Util.<Integer, String>compare(p1,p2);
        if(result1) {
            System.out.println("동일 객체");
        }
        
        
        Pair<String, String> p3 = new Pair<>("user1", "사람");
        Pair<String, String> p4 = new Pair<>("user2", "사람");
        
        boolean result2 = Util.compare(p3, p4);
        if(result2) {
            System.out.println("동일 객체");
        }
        
    }
}
