package JUnit;

public class StringCalculator2 {
    int add(String str) {
        int result = 0;
        if(str == null || str.isEmpty()) {
            return 0;
        } else if(str.length() == 1) {
            return Integer.parseInt(str);
        }
        
        String tokens[] = str.split(":|,");
        
        for(String token : tokens) {
            result += Integer.parseInt(token);
        }
        
        return result;
    }
    
    
}
