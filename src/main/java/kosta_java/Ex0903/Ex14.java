package kosta_java.Ex0903;

public class Ex14 {
    public static void main(String[] args) {
        for (String a : args){
            System.out.println("args =" + a);
        }

        System.out.println("args.length = " + args.length);
        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
    }
/**
    실행을 할 때 사용자가 값을 전달 할 수 있다.
    java ArgsExam 값 값 값 ......


    1) 문자열을 숫자로 변환
        Integer.parseInt(문자);

        2) 숫자를 문자열로 변환
        Integer.String(숫자);

        public class Integer{

            public static int parseInt(String args){

                return ;
            }

            public static String toString(int i){
                return ;
            }
        }
 */
}
