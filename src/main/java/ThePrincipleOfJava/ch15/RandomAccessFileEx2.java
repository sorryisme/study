package ThePrincipleOfJava.ch15;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx2 {
    public static void main(String[] args) {
        int [] score = {1,100,90,90,
                               2, 70,90,100,
                               3, 100, 100, 100,
                               4, 70, 60, 80,
                               5, 70, 90, 100
                            };
        
        try { 
            RandomAccessFile raf = new RandomAccessFile("score2.dat" ,"rw");
            for(int i=0; i<score.length; i++) {
                raf.writeInt(score[i]);
            }
            
            raf.seek(0);
            while(true) {
                // writeInt 사용 후 포인터가 이독했다 그렇기 때문에 raf.seek(0)으로 포인터를 다시 가져와야한다
                
                System.out.println(raf.readInt());
            }
                
        } catch(EOFException eof) {
            // ReadInt를 실행할 때 호출할 내용이 더이상 없으면 EOFException 발생
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    } // main
}
