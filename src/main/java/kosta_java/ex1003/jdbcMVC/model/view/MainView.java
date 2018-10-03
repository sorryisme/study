package kosta_java.ex1003.jdbcMVC.model.view;

import kosta_java.ex1003.jdbcMVC.controller.BoardController;
import kosta_java.ex1003.jdbcMVC.model.dto.BoardDTO;

public class MainView {

	public static void main(String[] args) {
		System.out.println("********** [1] 모든 게시물 검색 ******************");
		BoardController.boardSelectByAll();		
	

		System.out.println();
		System.out.println("********** [2] Board에서 게시글 번호에 해당하는 게시물 검색 *********");
		System.out.println("1. 존재하는 게시글 검색인 경우의 실행 결과 ");
		BoardController.boardSelectByNo(1); //존재하는 게시물
		
		
		System.out.println();
		
		System.out.println("2. 미 존재하는 게시글 검색인 경우의 실행 결과");
		BoardController.boardSelectByNo(30);// 없는 게시물
		
		System.out.println();
		
		
		System.out.println("********** [3] 게시물 제목이 포함된 모든 게시글들 검색 ******************");
		BoardController.boardSelectBySubject("db수업");
		
		System.out.println();
		
		System.out.println("********** [3] 게시물 제목이 포함된 모든 게시글들 검색 ******************");
		BoardController.boardSelectBySubject("sql");

	
	   System.out.println("********** [4] 게시물 등록 *************");
		BoardController.boardInsert(new BoardDTO(0, "Java기본문법", "이나영", "요약정리학습", null));//글번호 없는 게시물등록
		BoardController.boardInsert(new BoardDTO(0, "WEB", "천송이", "초보개발자", null));//글번호 없는 게시물등록
	
		System.out.println();
	
		System.out.println("********** [5] 게시물 수정 *************");
		System.out.println("1. 게시물이 존재하는 경우 실행결과  ");
		BoardController.boardUpdate(new BoardDTO(5, null, null, "myBatis수업", null));//글번호 있는 게시물 수정
		
		System.out.println();
		System.out.println("2. 게시물이 존재하지 않는 경우 실행결과 ");
		BoardController.boardUpdate(new BoardDTO(50, null, null, "myBatis수업", null) );//글번호 없는 게시물 수정
		BoardController.boardSelectByAll();
		
		System.out.println();	

	
		System.out.println("********** [6] 게시물 삭제 *************");
		System.out.println("1. 게시물이 존재하는 경우 삭제  ");
		BoardController.boardDelete(5);
		
		System.out.println();
		System.out.println("2. 게시물이 존재하지 않는 경우 삭제");
		BoardController.boardDelete(40);
	
	    BoardController.boardSelectByAll();	
	}
}


