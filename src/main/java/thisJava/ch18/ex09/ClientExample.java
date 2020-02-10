package thisJava.ch18.ex09;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
    public static void main(String[] args) {
        Socket socket = null;
        
        try{
            socket = new Socket();
            socket.connect(new InetSocketAddress("localhost", 5001));
            
            byte[] bytes = null;
            String message = null;
            
            OutputStream os = socket.getOutputStream();
            message = "hello";
            bytes = message.getBytes("UTF-8");
            
            os.write(bytes);
            os.flush();
            System.out.println("데이터 보내기 성공");

            InputStream is = socket.getInputStream();
            bytes = new byte[100];
            int readByteCount = is.read(bytes);
            message = new String(bytes, 0, readByteCount, "UTF-8");
            System.out.println("데이터 받기 완료" + message);
            
            is.close();
            os.close();
            
        } catch (Exception e) {
            
        }
        
        if(!socket.isClosed()) {
            try { socket.close(); } catch (IOException e1) {}
        }
        
    }
}
