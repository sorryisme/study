package ThePrincipleOfJava.ch13;

import java.util.ArrayList;

class Customer1 implements Runnable {
    private Table1 table;
    private String food;

    Customer1(Table1 table, String food){
        this.table = table;
        this.food = food;
    }
    public void run() {
        while(true) {
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            String name = Thread.currentThread().getName();
            table.remove(food);
            System.out.println(name + " ate a " + food);
        }
    }
}

class Cook1 implements Runnable {
    private Table1 table;
    Cook1(Table1 table) { this.table = table;}

    public void run() {
        while(true) {
            int idx = (int)(Math.random() * table.dishNum());
            table.add(table.dishNames[idx]);
            try { Thread.sleep(10); } catch (InterruptedException e) {}
        }
    }
}

class Table1 { 
    String[] dishNames = {"donut", "donut","burger"};
    final int MAX_FOOD = 6;
    private ArrayList<String> dishes = new ArrayList<>();

    public synchronized void add(String dish) {
        while(dishes.size() >= MAX_FOOD) {
            String name = Thread.currentThread().getName();
            System.out.println(name + "is waitting");

            try {
                wait();
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }

        dishes.add(dish);
        notify();
        System.out.println("Dishes:"+ dishes.toString());
    }

    public void remove (String dishName) {
        synchronized(this){
            String name = Thread.currentThread().getName();
            while(dishes.size() == 0 ) {
                System.out.println(name + " is waitting ");
                
                try{ 
                    wait();
                    Thread.sleep(500);
                } catch (InterruptedException e) {}
            }
            
            while(true) {
                for(int i=0; i<dishes.size(); i++) {
                    if(dishName.equals(dishes.get(i))) {
                        dishes.remove(i);
                        notify();
                        return;
                    }
                }// for
                try {
                    System.out.println(name + " is waiting");
                    wait();
                    Thread.sleep(500);
                } catch (InterruptedException e) {}
                
            } // while
        } // synchronized
    }
    public int dishNum() { return dishNames.length;}
}


public class ThreadWaitEx3 {
    public static void main(String[] args) {
        Table1 table = new Table1();
        new Thread(new Cook1(table), "COOK1").start();
        new Thread(new Customer1(table, "donut"), "cust1").start();
        new Thread(new Customer1(table, "burger"), "cust2").start();
        
    }  
}
