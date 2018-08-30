package JavaInPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex19 {
    public static void main(String[] args) {
        //리스트를 꺼내는 방법에는 iterator 방법도 있음
        
        List<String> list = new ArrayList<>();
        
        list.add("철수");
        list.add("영희");
        list.add("길동");
        
        Iterator<String> it = list.iterator();
        
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
