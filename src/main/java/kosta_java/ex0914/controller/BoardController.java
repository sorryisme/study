package kosta_java.ex0914.controller;

import kosta_java.ex0914.dto.Board;
import kosta_java.ex0914.service.BoardServiceImpl;
import kosta_java.ex0914.view.FailView;
import kosta_java.ex0914.view.SuccessView;

public class BoardController {
	
	public BoardController() {}
	
	public static void getAllBoard(){
		try {
			SuccessView.printBoard(BoardServiceImpl.getInstance().getBoardList());
		} catch (Exception e){
			FailView.errorMessage(e.getMessage());
		}
	}
	
	public static void getBoardByKind(String kind){
		try {
			SuccessView.printBoardByKind(BoardServiceImpl.getInstance().getBoardByKind(kind));
		} catch (Exception e){
			FailView.errorMessage(e.getMessage());
		}
	}
	
	public static void getBoardByno(String kind, int no){
		try {
			SuccessView.printBoardByNo(BoardServiceImpl.getInstance().getBoardByNo(kind, no));
		} catch (Exception e){
			FailView.errorMessage(e.getMessage());
		}
	}
	
	
	
	public static void insertBoard(String kind, Board board) {
		try {
			if(BoardServiceImpl.getInstance().insertBoard(kind, board));
			SuccessView.printMessage("등록 완료");
		} catch (Exception e){
			FailView.errorMessage(e.getMessage());
		}
	}
	
	public static void deleteBoard(String kind, int no){
		try {
			if(BoardServiceImpl.getInstance().deleteBoard(kind, no)) {
				SuccessView.printMessage("삭제 성공");
			}
		} catch (Exception e){
			FailView.errorMessage(e.getMessage());
		}
	}
	
	public static void updateBoard(Board board, String kind) {
		try {
			if(BoardServiceImpl.getInstance().updateBoard(board, kind))
				SuccessView.printMessage("업뎃 완료");
		} catch (Exception e){
			FailView.errorMessage(e.getMessage());
		}
	}
}