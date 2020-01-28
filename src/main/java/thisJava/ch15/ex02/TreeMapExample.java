package thisJava.ch15.ex02;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
        scores.put(new Integer(87), "홍길동");
        scores.put(new Integer(98), "이동수");
        scores.put(new Integer(75), "박길순");
        scores.put(new Integer(95), "김자바");
        scores.put(new Integer(100), "김메인");
        
        Map.Entry<Integer,String> entry = null;
        
        entry = scores.firstEntry();
        System.out.println("제일 낮은 점수 "+entry.getValue());
        
        entry = scores.lastEntry();
        System.out.println("가장 높은 점수 " + entry.getValue());
        
        entry = scores.lowerEntry(new Integer(90));
        System.out.println("90점 보다 낮은 점수 " +entry.getValue());
        
        entry = scores.higherEntry(new Integer(90));
        System.out.println("90점 보다 높은 점수 " + entry.getValue());
        
        entry = scores.floorEntry(new Integer(99));
        System.out.println("동일 하거나 그보다 낮은 점수 " + entry.getValue());
        
        entry = scores.ceilingEntry(new Integer(99));
        System.out.println("동일 하거나 그보다 높은 점수  " + entry.getValue());
        
        while(!scores.isEmpty()) {
            entry = scores.pollFirstEntry();
            System.out.println("추출 후 삭제 " + entry + " 갯수 :" + scores.size());
        }
        
       
        
    }
}
