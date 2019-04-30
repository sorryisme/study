package ThePrincipleOfJava.ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOEx03 {
    public static void main(String[] args) {
        byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
        byte[] outSrc = null;
        byte[] temp = new byte[4];
        
        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;
        
        input = new ByteArrayInputStream(inSrc);
        // inSrc를 읽어온다
        output = new ByteArrayOutputStream();
        
        System.out.println("Input Source" + Arrays.toString(inSrc));
        try {
            while(input.available() > 0) {
                int len = input.read(temp);
                // output은 남아있는 데이터 문제 때문에 길이를 지정해야한다
                output.write(temp,0 ,len);
                System.out.println("temp :" + Arrays.toString(temp));
                
                outSrc = output.toByteArray();
                printArrays(temp, outSrc,inSrc);
            } 
        }catch (IOException e) {
            e.printStackTrace();
        }
    }// main
    
    static void printArrays(byte[] temp, byte[] outSrc,byte[] inSrc) {
        System.out.println("temp      :" +Arrays.toString(temp));
        System.out.println("Output Source:" +Arrays.toString(outSrc));
    }
}
