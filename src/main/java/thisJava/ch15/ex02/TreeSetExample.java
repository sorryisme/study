package thisJava.ch15.ex02;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<Integer>();
        scores.add(new Integer(87));
        scores.add(new Integer(98));
        scores.add(new Integer(75));
        scores.add(new Integer(95));
        scores.add(new Integer(80));
        
        Integer score = null;
        
        score = scores.first();
        System.out.println("제일 낮은 점수 " + score);
        
        score = scores.last();
        System.out.println("제일 높은 점수 " + score);
        
        score = scores.lower(new Integer(95));
        System.out.println("95 아래 점수 " + score);
        
        score = scores.higher(new Integer(75));
        System.out.println("75 위 점수 " + score);
                    
        
    }
}
