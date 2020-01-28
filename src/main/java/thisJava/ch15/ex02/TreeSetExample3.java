package thisJava.ch15.ex02;

import java.util.TreeSet;

public class TreeSetExample3 {
    public static void main(String[] args) {
        
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("apple");
        treeSet.add("forever");
        treeSet.add("description");
        treeSet.add("ever");
        treeSet.add("base");
        treeSet.add("guess");
        treeSet.add("cheery");
        
        System.out.println("c~f 사이의 단어 검색");
        treeSet.subSet("c", "f").stream()
                                .forEach(t -> System.out.println(t));
        
    }
}
