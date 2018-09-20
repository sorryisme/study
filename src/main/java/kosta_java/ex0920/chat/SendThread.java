package kosta_java.ex0920.chat;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


public class SendThread extends Thread{
    
    Socket sk;
    String name;
    
    public SendThread(Socket sk, String name) {
        this.sk = sk;
        this.name = name;
    }
    
    
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        try {
            
            PrintWriter pw = new PrintWriter(sk.getOutputStream(),true);
            while(true) {   
                String sendMessage = sc.nextLine();
                if(sendMessage.equals("quit"))break;
                pw.println(name + " : " + sendMessage);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if( sk != null) try{ sk.close();} catch (Exception e) { e.printStackTrace();}
        }
    }
}
