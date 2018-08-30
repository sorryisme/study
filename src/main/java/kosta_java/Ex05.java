package kosta_java;

public class Ex05 {
    public static void main(String [] args) {
      //1. 1~100까지 한줄로 출력
        System.out.println("1. 1~100까지 한줄로 출력");
        int i = 1;
        while(i <= 100){
            System.out.print(i + "\t");
            i++;
        }
        //2. 1~100까지 5의 배수만 출력
        System.out.println("\n2. 1~100까지 5의 배수만 출력");
    
            i = 1;
            while(i <= 100){
                if(i % 5 == 0)
                System.out.print(i + "\t");
                i++;
            }

        //3. 1~100까지 출력하되 10행 10열 출력 while문 안에 while
        System.out.println("\n3. 1~100까지 출력하되 10행 10열 출력 while문 안에 while ");
            i = 0;
            while(i <= 9){
                int j = 1;
                while(j <= 10){
                    System.out.print( j+(i*10)+"\t");
                    j++;
                }
                
                System.out.println();
                i++;
            }
        
        //4. 구구단출력
        System.out.println("\n4. 구구단 출력");
            i = 1;
            while(i <= 9){
                int j = 2;
                while(j <= 9){
                    System.out.print( j + "*" + i + "=" + (i*j) + "\t");
                    j++;
                }
                System.out.println();
                i++;
            }
    }
}
