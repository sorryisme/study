package kosta_java.ex0913.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapExam extends HashMap<Integer, String>{
    public MapExam() {
        
        super.put(10, "김지성");
        super.put(50, "배고파");
        super.put(20, "언제");
        super.put(20, "밥먹냐");
        super.put(111, "김지성");
        super.put(11, "아자식아");
        System.out.println(this);
    }
    
    public void printMap() {
        
        
        Set<Integer> keys = super.keySet();
        Iterator iter = keys.iterator();
        while(iter.hasNext()) {
            System.out.println(super.get(iter.next()));
        }
    }
    
    public static void main(String[] args) {
        new MapExam().printMap();
        
        
    }
}
