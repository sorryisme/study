package thisJava.ch18.ex05;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {
    public static void main(String[] args) throws Exception {
        
        InputStream is = System.in;
        Reader reader = new InputStreamReader(is);
        
        int readCharNo;
        char[] cbuf = new char[100];
        
        while((readCharNo=reader.read(cbuf)) != 1) { 
            String data = new String(cbuf);
            System.out.println(data);
        
        }
        
        reader.close();
        
    }
}
