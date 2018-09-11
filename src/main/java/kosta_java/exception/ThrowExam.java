package kosta_java.exception;

import java.io.IOException;

class Student {
	private int age;

	public void setAge(int age) throws IOException {
		// 변경 전 음수값이 전달되면 예외 발생시킨다.
		if(age <= 0)
			throw new IOException("나이는 음수가 안돼요");
		this.age = age;
	}
}

public class ThrowExam {
	public static void main(String[] args) throws IOException{
		
		try {
		new Student().setAge(0);
		System.out.println("완료");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("완료");
		
	}
}
