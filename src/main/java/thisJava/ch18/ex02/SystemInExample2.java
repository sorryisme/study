package thisJava.ch18.ex02;

import java.io.InputStream;

public class SystemInExample2 {
    public static void main(String[] args) throws Exception {
        InputStream is = System.in;
        
        byte[] datas = new byte[100];
        System.out.println("이름 ");
        int nameByte = is.read(datas);
        String name = new String(datas,0,nameByte-2); 
        System.out.println(name);
        System.out.println(nameByte);
        
    }
}
