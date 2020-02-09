package thisJava.ch18.ex08;

import java.net.InetAddress;

public class InetAddressExample {
    public static void main(String[] args) throws Exception{
        InetAddress local = InetAddress.getLocalHost();
        System.out.println(local.getHostAddress());
        
        InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
        
        for(InetAddress remote : iaArr) {
            System.out.println("www.naver.com IP주소 : " + remote.getHostAddress());
        }
        
        
        
    }
}
