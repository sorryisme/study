package kosta_java.ex1003.jdbcMVC.controller;

import java.sql.SQLException;

import kosta_java.ex1003.jdbcMVC.model.dto.BoardDTO;
import kosta_java.ex1003.jdbcMVC.model.service.BoardService;
import kosta_java.ex1003.jdbcMVC.model.service.BoardServiceImpl;
import kosta_java.ex1003.jdbcMVC.model.view.FailView;
import kosta_java.ex1003.jdbcMVC.model.view.SuccessView;


public class BoardController {

    static BoardService service = new BoardServiceImpl();
    
    public static void boardSelectByAll() {
        try {
            SuccessView.selectPrint(service.boardSelectAll());
        } catch (SQLException e) {
            FailView.errorMessage(e.getMessage());
        }
    }

    public static void boardSelectByNo(int i) {
        try {
            SuccessView.selectByNoPrint(service.boardSelectByNo(i));
        } catch (SQLException e) {
            FailView.errorMessage(e.getMessage());
        }       
    }

    public static void boardSelectBySubject(String string) {
        try {
            SuccessView.selectPrint(service.boardSelectBySubject(string));
        } catch (SQLException e) {
            FailView.errorMessage(e.getMessage());
        }       
    }

    public static void boardInsert(BoardDTO boardDTO) {
        try {
            service.boardInsert(boardDTO);
            SuccessView.messagePrint("입력에 성공하였습니다");
        } catch (Exception e) {
            FailView.errorMessage(e.getMessage());
        }
        
    }
    

    public static void boardUpdate(BoardDTO boardDTO) {
        try {
            service.boardUpdate(boardDTO);
            SuccessView.messagePrint("수정에 성공하였습니다");
        } catch (Exception e) {
            FailView.errorMessage(e.getMessage());
        }
        
    }
    
    

    public static void boardDelete(int boardNo) {
        try {
            service.boardDelete(boardNo);
            SuccessView.messagePrint("삭제에 성공하였습니다");
        } catch (Exception e) {
            FailView.errorMessage(e.getMessage());
        }
        
    }

}

