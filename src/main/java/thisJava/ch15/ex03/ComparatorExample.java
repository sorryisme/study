package thisJava.ch15.ex03;

import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        
        TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());
        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 6000));
        treeSet.stream().forEach( t -> System.out.println(t));
    }
}
