package thisJava.ch14.ex18;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferencesExample {
    public static void main(String[] args) {
        
        ToIntBiFunction<String, String> function;
        function = (a,b) -> a.compareToIgnoreCase(b);
        print(function.applyAsInt("abc", "abd"));
        print(function.applyAsInt("abc", "abc"));
        
        function = String :: compareToIgnoreCase;
        print(function.applyAsInt("Java", "JAVA"));
        
    }
    
    public static void print(int order) {
        if ( order < 0 ) { System.out.println( "사전순으로 먼저 나옵니다. ");}
        else if( order == 0 ) { System.out.println("동일한 문자열"); }
        else { System.out.println("사전순으로 나중에 나옵니다. ");}
    }
}
    
