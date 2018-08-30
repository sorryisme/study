package kosta_java;

public class Ex08 {
    public static void main(String[] args) {
        //1. for문을 이용하여 1 ~ 100까지 정수 중 
        //3의 배수의 총합을 구하세요
        System.out.println("\n----------1번-----------");

        int sum = 0;
        for (int i = 1; i <= 100 ; i++){
            if( i % 3 == 0) 
                sum += i;
        }
        System.out.print(sum);
        System.out.println("\n----------2번-----------");
    
        //2. Math.random()메소드를 이용해서 두개의 주사위를 던졌을 때 나오는 눈을 (눈1,눈2) 형태로 출력하고
        // 눈의 합이 5이면 실행을 멈춘다. (난수는 2개 발생 / 1 ~ 6)
        sum = 0;

        do {
        int nansu1 = (int)(Math.random() * 6) + 1;
        int nansu2 = (int)(Math.random() * 6) + 1;
        System.out.println("주사위1의 숫자는" + nansu1 + " 주사위2의 숫자는 " + nansu2 + " 입니다");
        sum = nansu1 + nansu2;
        System.out.println("합은" + sum + "입니다");
        }
        while (sum != 5);

        //3.중첩 for문을 이용하여 방정식 4x + 5y = 60의
        // 모든 해를 구해서 (x,y)형태로 출력하세요. 단, x와y는 10 이하의 자연수 이다.
        
        System.out.println("\n----------3번-----------");

        for (int x = 0; x <= 10 ; x++){
            for(int y= 0; y <= 10; y++){
                if(((4*x) + (5*y)) == 60)
                    System.out.println("("+ x +"," + y + ")");
            }
        }   
    }
}
