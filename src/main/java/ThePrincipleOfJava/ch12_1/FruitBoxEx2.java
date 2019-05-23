package ThePrincipleOfJava.ch12_1;

import java.util.ArrayList;

public class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();
        
        
        
        // FruitBox<Fruit> grapeBox = new FruitBox<Apple>(); => 에러..
        // FruitBox<Grape> grapeBox = new FruitBox<Apple>(); => 에러..
        // FruitBox<Toy> toyBox = new FruitBox<Toy>(); 에러
        // Bound mismatch: The type Toy is not a valid substitute for the bounded parameter <T extends Fruit & Eatable> of the type FruitBox<T>
        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        
        appleBox.add(new Apple());
        //appleBox.add(new Grape()); 에러
        grapeBox.add(new Grape());
        
        System.out.println("fruitBox"+fruitBox);
        System.out.println("appleBox"+appleBox);
        System.out.println("GrapeBox"+grapeBox);
    }
}

interface Eatable { }

class Fruit implements Eatable { public String toString() { return "Fruit";}}
class Apple extends Fruit { public String toString() {return "Apple";}}
class Grape extends Fruit { public String toString() {return "Garape";}}
class Toy                           { public String toString() {return "Toy";}}

class FruitBox <T extends Fruit & Eatable> extends Box<T>{}

class Box<T>{
    ArrayList<T> list = new ArrayList<T>();
    void add (T item) { list.add(item) ;}
    T get( int i ) { return list.get(i); }
    ArrayList<T> getList() { return list; }
    int size () { return list.size(); }
    public String toString() { return list.toString(); }
}