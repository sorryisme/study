package JUnit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator2 {
    int add(String str) {
        int result = 0;
        
        if(str.startsWith("-")) {
            throw new ArithmeticException();
        }
        
        if(str == null || str.isEmpty()) {
            return 0;
        } else if(str.length() == 1) {
            return Integer.parseInt(str);
        }
        
        String tokens[] = str.split(":|,");
        
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(str);
        if(m.find()) {
            String customDelimeter = m.group(1);
            tokens = m.group(2).split(customDelimeter);
        } 
        
        
        for(String token : tokens) {
            result += Integer.parseInt(token);
        }
        
        return result;
    }
    
    
}
