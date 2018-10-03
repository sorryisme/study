package kosta_java.ex1003.jdbcMVC.model.service;

import java.sql.SQLException;
import java.util.List;

import kosta_java.ex1003.jdbcMVC.model.dao.BoardDAO;
import kosta_java.ex1003.jdbcMVC.model.dao.BoardDAOImpl;
import kosta_java.ex1003.jdbcMVC.model.dto.BoardDTO;

public class BoardServiceImpl implements BoardService {
    private BoardDAO boardDAO = new BoardDAOImpl();

    @Override
    public List<BoardDTO> boardSelectAll() throws SQLException {
        List<BoardDTO> list = boardDAO.boardSelectAll();
        if (list == null || list.size() == 0) {
            throw new SQLException("검색된 레코드가 없습니다.");
        }
        return list;
    }

    @Override
    public List<BoardDTO> boardSelectBySubject(String keyWord) throws SQLException {
        List<BoardDTO> list = boardDAO.boardSelectBySubject(keyWord);
        if(list == null || list.size() == 0) {
            throw new SQLException("제목에 "+keyWord+"가 포함된 레코드가 없습니다.");
        }
        return list;
    }

    @Override
    public BoardDTO boardSelectByNo(int boardNo) throws SQLException {
        
        BoardDTO dto= boardDAO.boardSelectByNo(boardNo);
        if(dto==null) {
            throw new SQLException(boardNo + "가 포함된 레코드가 없습니다.");
        }
        return dto;
    }

    @Override
    public void boardInsert(BoardDTO boardDTO) throws SQLException {
        //등록완료
        int re = boardDAO.boardInsert(boardDTO);
        if(re == 0) {
            throw new SQLException("등록되지 않았습니다.");
        }
    }

    @Override
    public void boardUpdate(BoardDTO boardDTO) throws SQLException {
        int re = boardDAO.boardUpdate(boardDTO);
        if(re == 0) {
            throw new SQLException(boardDTO.getBoardNo() + "번 게시물이 수정되지 않았습니다.");
        }
    }

    @Override
    public void boardDelete(int boardNo) throws SQLException {
        int re = boardDAO.boardDelete(boardNo);
        if(re == 0) {
            throw new SQLException(boardNo + "번 게시물이 삭제되지 않았습니다.");
        }
    }

}
