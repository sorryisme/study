package ThePrincipleOfJava.ch15;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEx3 {
    public static void main(String[] args) {
        int sum = 0;
        int score = 0;
        
        try (FileInputStream fis = new FileInputStream("score.dat");
                DataInputStream dis = new DataInputStream(fis)){
            //Autoclosable을 구현한 객체는 try- with resource문을 이용해서 간결한 코드작성이 가능하다
            //java 7부터 구현가능!
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
        } 
    } // main
}
