package ThePrincipleOfJava;

public class Test02 {
	public static void main(String[] args) {
		char ch ='A';
		int code = (int)ch;
		
		
		// char 타입은 문자가 아닌 유니코드가 저장
		System.out.println(ch);
		System.out.println(code);
	}
}
