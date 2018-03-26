package ThePrincipleOfJava.ch8;

public class Test01 {
    
   public static void main(String[] args) {
       try {
           try { } catch (Exception e) {}
       } catch ( Exception e ) {
           try { } catch (Exception e1) {} // 변수 e가 중복되서는 안된다.
       }
       
       
       
   }
}
