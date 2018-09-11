package kosta_java.exception;

import java.util.Random;

public class ShoppingException {
	public static void main(String[] args) {
		
			Random r = new Random();
			
			for(int i = 0; i < 10; i++) {
				int age = r.nextInt(55)+1;
			
				try {
					ShoppingMall.checkAge(age);//개발자가 에러를 검출하고 싶은 포인트라고 
				} catch (Exception e) {
					System.out.println(e.getMessage());// 발생된 후 수습작업
				}
				
			}
			System.out.println(GetoutKidException.count);
	}
}

class ShoppingMall {
	
	static void checkAge(int age) throws GetoutKidException {
		if(age < 18) 
			throw new GetoutKidException("애들은가라");
		System.out.println("입장을 환영합니다 ");
	}
	
	
}

class GetoutKidException extends Exception{
	static int count;
	
	GetoutKidException(){}
	GetoutKidException(String msg){
		super(msg);
		count++;
	}
	
	
}
