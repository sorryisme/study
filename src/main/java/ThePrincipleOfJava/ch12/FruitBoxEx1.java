package ThePrincipleOfJava.ch12;

import java.util.ArrayList;

public class FruitBoxEx1 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Toy> toyBox= new Box<Toy>();
        //Box<Grape> grapeBox = new Box<Apple>(); 에러 타입 불일치
        
        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        // 다형성 적용 가능
        

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        //appleBox.add(new Toy()); 에러 Apple만 가능
        
        toyBox.add(new Toy());
        //toyBox.add(new Apple()); 에러 apple을 담을 수 없음
        
        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);
        
    }
}

class Fruit                     { public String toString() { return "Fruit";}}
class Apple extends Fruit { public String toString() {return "Apple";}}
class Grape extends Fruit { public String toString() {return "Garape";}}
class Toy                           { public String toString() {return "Toy";}}

class Box<T>{
    ArrayList<T> list = new ArrayList<T>();
    void add (T item) { list.add(item) ;}
    T get( int i ) { return list.get(i); }
    ArrayList<T> getList() { return list; }
    int size () { return list.size(); }
    public String toString() { return list.toString(); }
}