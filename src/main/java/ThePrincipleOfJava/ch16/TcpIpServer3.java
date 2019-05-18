package ThePrincipleOfJava.ch16;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIpServer3 {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        
        try{ 
            serverSocket = new ServerSocket(7777);
            System.out.println(getTime()+"서버가 준비되었습니다.");
        
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        while(true) {
            try {
                System.out.println(getTime() +"연결요청 기다립니다.");
                
                serverSocket.setSoTimeout(5*1000);
                Socket socket = serverSocket.accept();
                System.out.println(getTime() + socket.getInetAddress());
                OutputStream out = socket.getOutputStream();
                DataOutputStream dos = new DataOutputStream(out);
                
                dos.writeUTF("[Notice] Test message1 from serverh");
                System.out.println(getTime() + " 데이터를 신청하였습니다.");
               dos.close();
               socket.close();
            }  catch (SocketTimeoutException e) {
                System.out.println("지정된 시간동안 접속 요청이 없어서 서버를 종료합니다.");
                System.exit(0);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    static String getTime() {
        SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
        return f.format(new Date());
    }
}
