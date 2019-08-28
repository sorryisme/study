package JUnit;

public class StringCalculator {
    int add(String str) {
        String[] strArr = splitStringToArray(str);
        int[] intArr = parseStringtoInt(strArr);
        int calResult = 0;
        for(int result : intArr) {
            calResult += result;
        }
        return calResult;
    }
    
    int subtract(int i, int j) {
        return i - j;
    }

    int multiply(int i, int j) {
        return i * j;
    }
    
    int divide(int i, int j) {
        return i / j;
    }
    
    private String[] splitStringToArray(String str) {
        String[] result = null;
        
        if(!str.trim().isEmpty() && str.trim() != null) {
            result = str.replaceAll(":",",").split(",");
        } else {
            result =new String[]{"0"};
        }
        return result;
    }
    
    private int[] parseStringtoInt(String[] strArr) {
        int len = strArr.length;
        int[] resultArr = new int[len]; 
        for(int i = 0; i < len; i++) {
            resultArr[i] = Integer.parseInt(strArr[i]);
        }
        
        return resultArr; 
    }
}
