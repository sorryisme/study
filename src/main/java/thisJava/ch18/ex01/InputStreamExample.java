package thisJava.ch18.ex01;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamExample {
    public static void main(String[] args) {
        try{
            InputStream is = new FileInputStream("C:/test/step1_myBatisOutput.log");
            int readByte;
            int count = 0;
            byte[] byteArray = new byte[8192];

            while((readByte = is.read()) != -1 ) {
                byteArray[count++] = (byte)(readByte);
            }

            String contents = new String(byteArray);
            System.out.println(contents);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
