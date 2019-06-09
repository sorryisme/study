package ThePrincipleOfJava.ch14;
@FunctionalInterface
interface Myfunction1 {
    void myMethod(); 
}


public class LambdaEx2 {
    public static void main(String[] args) {
        Myfunction1 f = () -> {};
        Object obj = (Myfunction1)(() -> {}); // Object 타입으로 형변환 생략
        String str = ((Object)(Myfunction1)(()->{})).toString();
        
        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);
        
        //System.out.println( ()->{}); 람다식은 Object타입으로 형변환 불가
        System.out.println((Myfunction1)(()->{}));
        System.out.println(((Object)(Myfunction1)(()->{})).toString());
        
    }
}
