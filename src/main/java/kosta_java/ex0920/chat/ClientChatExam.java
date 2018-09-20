package kosta_java.ex0920.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientChatExam {
    Socket sk;
    public ClientChatExam() {
        try {
            sk = new Socket("192.168.0.111", 9000);
            //읽기 쓰레드
            
            
            
            //보내기 쓰레드 
            new SendThread(sk,"[Client 전송]").start();
            new ClientReciveThread().start();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public static void main(String[] args) {
        new ClientChatExam();
    }
    
    
    class ClientReciveThread extends Thread{

        
        @Override
        public void run() {
            try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(sk.getInputStream()));
            String data =null;
            while((data=br.readLine()) != null) {
                System.out.println(data);
            }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if(sk != null) try{ sk.close(); } catch (Exception e) {}
            }
        }
        
    }
    
    
    
    
}
