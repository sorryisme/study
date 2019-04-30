package ThePrincipleOfJava.ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx02 {
    
    public static void main(String[] args) {
        
    byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
    byte[] outSrc = null;
    byte[] temp = new byte[10];

    ByteArrayInputStream input = null;
    ByteArrayOutputStream output = null;
    input = new ByteArrayInputStream(inSrc);
    output = new ByteArrayOutputStream();

    input.read(temp, 0, temp.length);
    // temp 변수에 읽어온 데이터를 담는다
    output.write(temp,5,5);
    // temp[5]부터 5개의 데이터를 write 한다
    
    outSrc =output.toByteArray();
    
    System.out.println("Input Source :"+Arrays.toString(inSrc));
    System.out.println("tmp :"+Arrays.toString(temp));
    System.out.println("outPut Source :"+Arrays.toString(outSrc));
    
    }
}