package java100_Problem;

public class Problem015 {
    public static void main(String[] args) {
        System.out.println(Math.E);//자연로그
        System.out.println(Math.PI);//파이
        
        //method
        System.out.println(Math.abs(-5));//절대값
        System.out.println(Math.ceil(4.34));//올림
        System.out.println(Math.round(4.34)); // 반올림
        System.out.println(Math.floor(4.34)); // 버림
        System.out.println(Math.rint(4.34)); //반올림 대신 0.51 처럼 05가 넘어가야함
        System.out.println(Math.max(45, 78)); //최대값 
        System.out.println(Math.min(45, 78));  //최솟값
        System.out.println(Math.pow(2, 4)); //승수(제곱)
        System.out.println(Math.log(30));// 로그 밑수는 Math.E
        System.out.println(Math.exp(3)); //자연지수의 승수
        System.out.println(Math.sqrt(10));//루트 근사값 계산
    }
}
