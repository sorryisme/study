package ThePrincipleOfJava.ch15;

import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderWriterEx {
    public static void main(String[] args) {
        String inputData = "ABCD";
        StringReader input = new StringReader(inputData);
        StringWriter output = new StringWriter();
        
        int data = 0;
        try {
            while((data = input.read()) != -1) {
                output.write(data);
            }
        } catch (Exception e) {}
        System.out.println("Input Data :" + inputData);
        System.out.println("Output Data :" + output.toString());
        //System.out.println("Output Data :" + output.getBuffer().toString());
        //위 출력문과 동일하다 하지만 println의 경우 toString이 자동 출력된다.
    }
}
