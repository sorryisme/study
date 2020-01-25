package thisJava.ch15.ex01;

import java.util.ArrayList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        
        long startTime;
        long endTime;
        //중간 삽입
        startTime = System.nanoTime();
        
        for ( int i = 0; i < 1000; i++) {
            list1.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println(endTime - startTime + "ns"  );
        
        startTime = System.nanoTime();
        for( int i = 0; i < 1000; i++) {
            list2.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        
        
        System.out.println(endTime - startTime + "ns"  );

        
        
        
        startTime = System.nanoTime();
        
        for ( int i = 0; i < 1000; i++) {
            list1.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("마지막에 추가" + (endTime - startTime) + "ns"  );
        
        startTime = System.nanoTime();
        for( int i = 0; i < 1000; i++) {
            list2.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("마지막에 추가" + (endTime - startTime) + "ns"  );
        
    }
}
