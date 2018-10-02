package kosta_java.ex1002.prepare.view;

import java.util.Iterator;
import java.util.List;

import kosta_java.ex1002.dto.EmpVo;


public class EndView {
	/**
	 * 전체 출력
	 * */
	
	public static void printAll(List<EmpVo> list) {
		Iterator<EmpVo> iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
				
	}
	
	/**
	 * 사원번호에 해당하는 정보 출력
	 * */
	
	public static void printByEmpno(EmpVo vo) {
		System.out.println(vo);
	}
	
	/**
	 * 등록 수정 삭제 메세지 출력
	 * */
	public static void printMessage(String message) {
		System.out.println(message);
	}

}
