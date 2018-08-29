package JavaInPractice;

public class Ex04 {
    public static void main(String[] args) {
        label: for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                    System.out.println("j==1일 때 break");
                    break label;
                }
                System.out.println( "i = " + i + ", j =" + j);
            }
        }
        
        System.out.println("-------------------------------");
        label:for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(j == 1 ) {
                    System.out.println("j==1일때 label continue");
                    continue label;
                }
                System.out.println(" i= " + i +" j= " + j);
            }
        }
        
    }
}
