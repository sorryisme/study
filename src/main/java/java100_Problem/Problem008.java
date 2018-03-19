// 1이면 남자 2이면 여자를 출력하자
// 상수의 개념
package java100_Problem;

public class Problem008 {

        public final static int MEN = 3;
        public final static int WOMEN =4;
        public static void main(String args[]){
            int people1 = WOMEN;
            switch(people1) {
                case 3:System.out.println("남자");
                    break;
                case 4: System.out.println("여자");
                    break;
            }
            
        }

}


