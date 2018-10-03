package kosta_java.ex1003.jdbcMVC.model.view;

import java.util.List;

import kosta_java.ex1003.jdbcMVC.model.dto.BoardDTO;

public class SuccessView {
    /**
     * 전체 또는 부분 레코드 출력  
     */
    public static void selectPrint(List<BoardDTO> list) {
        System.out.println("--------게시글 LIST--------");
        for(BoardDTO boardDTO : list) {
            System.out.println(boardDTO);
        }
    }
    /**
     * 글번호에 해당하는 레코드 출력
     */
    public static void selectByNoPrint(BoardDTO boardDTO) {
        System.out.println(boardDTO);
    }
    
    /**
     * 등록, 수정, 삭제 성공 메세지 출력
     */
    public static void messagePrint(String message) {
        System.out.println(message);
    }
}