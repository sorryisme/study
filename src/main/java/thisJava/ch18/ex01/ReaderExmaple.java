package thisJava.ch18.ex01;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExmaple {
    public static void main(String[] args) {
        try {
            FileReader rd = new FileReader("C:/test/step1_myBatisOutput.log");
            int read;

            while((read = rd.read()) != -1 ) {
                char charData = (char) read;
                System.out.print(charData);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
