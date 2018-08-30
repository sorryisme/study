package kosta_java;

public class Ex04 {
    public static void main(String [] args){
        System.out.println("//1. 1~100까지 한줄로 출력합니다");
        //1. 1~100까지 한줄로 출력합니다
        for (int i = 1; i <= 100 ; i++ ){
            System.out.print(i);
        }   
        
        System.out.println("\n//2. A~Z까지 한줄로 출력합니다");
        //2. A~Z까지 한줄로 출력합니다
        
        for(char i = 65; i < 91; i++){
            System.out.print(i);
        }

        System.out.println("\n//3. 1~10사이의 합을 출력");
        //3. 1~10사이의 합을 출력
        
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            sum += i;
        }
        System.out.println(sum);
        
        System.out.println("//4. 1~100사이의 7의 배수를 거꾸로 출력합니다");
        //4. 1~100사이의 7의 배수를 거꾸로 출력합니다
         
        for (int i = 100; i >= 1; i--){
            if(i % 7 == 0) System.out.print(i);
        }

        System.out.println("\n//5. 1~100까지 출력하되 10행 10열로 출력합니다");
        //5. 1~100까지 출력하되 10행 10열로 출력합니다
        int count = 1;
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                System.out.print(count++);
            }
            System.out.println();   
        }

        System.out.println("//6. 1~100까지 출력하되 10행 10열로 출력한다(for 문안에 if문 이용)");
        //6. 1~100까지 출력하되 10행 10열로 출력한다(for 문안에 if문 이용)
        for (int i = 1; i <= 100; i++){
            System.out.print(i);
            if(i % 10 == 0) System.out.println();
        }
    }
}
