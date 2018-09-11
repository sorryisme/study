package kosta_java.exception;

class Test{
	public void aa(int i) throws Exception {
		System.out.println("Test의 aa(int i) 호출됨....");
		try {
		this.bb(i);
		} finally {
		System.out.println("Test aa(int i) 완료 !!");
		}
	}
	
	public void bb(int i) throws ArithmeticException, NullPointerException {
		System.out.println("Test bb(int i) 호출됨!!");
		try {
		int re = 100/i;
		} finally {
		System.out.println("Test bb(int i) 완료됨!!");
		}
	}
}

public class ThrowsExam {
	public static void main(String[] args) {
		System.out.println("**** 메인 시작 ****");
		
		Test t = new Test();
		try {
			t.aa(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("**** 메인 종료 ****");
	}
}
