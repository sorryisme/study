package ThePrincipleOfJava.ch7;

public class Test03 {
    int price;
    int bonusPoint;

    Test03(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}


class Tv extends Test03{
    Tv(){
        super(100);
    }
    
    public String toString() {return "Tv";}
}

class Computer extends Test03{
    Computer(){super(200);}
    public String toString() { return "Computer"; }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    void buy(Test03 p) {
        if(money < p.price) {
            System.out.println("물건이 부족하여 물건을 살 수 없습니다");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "을 구매했습니다.");
    }
}


