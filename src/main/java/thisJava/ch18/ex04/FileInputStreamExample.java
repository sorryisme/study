package thisJava.ch18.ex04;

import java.io.FileInputStream;
import java.io.InputStream;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class FileInputStreamExample {
    public static void main(String[] args) {
        
        
        try{ 
            InputStream fis = new FileInputStream("C:/Temp/file1.txt");
            int data;
            byte[] byteArr = new byte[1024];
            int count = 0;
            while ( (data = fis.read()) != -1 ) {
                System.out.print(data);
                byteArr[count++] = (byte)data;
            }
            System.out.println();
            System.out.println("-------------------");
            System.out.println(new String(byteArr));
            
            
            
            
            fis.close();
            
            fis = new FileInputStream("C:/Temp/file1.txt");
            byte[] read = new byte[20];
            
            int len;
            
            while((len = fis.read(read)) != -1) {
                System.out.println("length:"+len);
            }
            
            System.out.println(new String(read));
            fis.close();
            
        } catch (Exception e) {
            
        }
    }
}
