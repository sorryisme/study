package ThePrincipleOfJava.ch4;

import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        int menu = 0, num = 0;
        Scanner scanner = new Scanner(System.in);
        
        outer:
        while(true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.println("원하는 메뉴를 선택하세요(1~3), 종료 : 0 ");
            
            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);
            
            if(menu ==0 ) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else if (!(1<= menu && menu <= 3)) {
                System.out.println("잘못선택하셨습니다");
                continue;
                // 무한 루프이기 때문에 다시 돌아감
            }
            
            for(;;) {
                System.out.println("계산할 값을 선택하세요 (계산종료 :0 , 전체종료 :99)");
                tmp = scanner.nextLine();
                num = Integer.parseInt(tmp);
                if(num == 0)
                    break;
                if(num ==99)
                    break outer; // 전체종료 현재 for 문안에 있기때문에
                
                switch(menu) {
                    case 1:
                        System.out.println("result =" + num*num);
                        break;
                    case 2: 
                        System.out.println("result =" + Math.sqrt(num));
                        break;
                    case 3:
                        System.out.println("resul =" + Math.log(num));
                        break;
                }
            }
        }
    }
}
