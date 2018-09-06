package java100_Problem;

public class Problem049 {
    public static void main(String[] args) {
        Die.printAddDie();
        Die.printMultiDie();
        
        //non-static
        Die die = new Die();
        die.printnAddDie();
        die.printnMultiDie();
    }
}

class Die{
    
    public static void printAddDie() {
        for (int i=1; i<6; i++) {
            for(int j=1; j<=6; j++) {
                System.out.print(j+"+"+i+"="+(i+j)+"\t");
            }
            System.out.println();
        }
        System.out.println("-------------------------");
    }
    
    public void printnAddDie(){
        for(int i=1; i<=6; i++) {
            for(int j=1; j<=6; j++) {
                System.out.print(j+"+"+i+"="+(i+j)+"\t");
            }
            System.out.println();
        }
        System.out.println("-------------------------");
    }
    
    public static void printMultiDie() {
        for(int i=1; i<=6; i++) {
            for(int j=1; j<=6;j++) {
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }
    
    public void printnMultiDie() {
        for(int i=1; i<=6; i++) {
            for(int j=1; j<=6; j++) {
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
        System.out.println("-------------------------");
    }
}
