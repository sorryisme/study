package ThePrincipleOfJava.ch15;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEx2 {
    public static void main(String[] args) {
        int sum = 0;
        int score = 0;
        
        FileInputStream fis = null;
        DataInputStream dis = null;
        try {
            fis = new FileInputStream("score.dat");
            dis = new DataInputStream(fis);
            while(true) {
                score = dis.readInt();
                System.out.println(score);
                sum += score;
            }
        } catch (EOFException e) {
            System.out.println("점수 총합은 "+ sum + "입니다");
            // 더이상 읽을 데이터가 없다면 EOFException을 발생시킨다
        } catch (IOException ie) {
            ie.printStackTrace();
        } finally {
            try { 
                if(dis!=null)
                    dis.close();
            } catch (IOException ie) {
                ie.printStackTrace();
            }
        } //try
    } // main
}
