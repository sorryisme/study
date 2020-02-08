package thisJava.ch18.ex07;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializabledReader {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:/Temp/testfolder/Object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ClassA v = (ClassA) ois.readObject();
        System.out.println("field1 " + v.field1);
        System.out.println("field2 " + v.field2.field1);
        System.out.println("field3 " + v.field3);
        System.out.println("field4 " + v.field4);
    }
}
