package kosta_java.ex1003.jdbcMVC.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import kosta_java.ex1003.jdbcMVC.model.dto.BoardDTO;
import kosta_java.ex1003.jdbcMVC.model.util.DBUtil;

public class BoardDAOImpl implements BoardDAO{

    private Properties proFile = DBUtil.getProFile();
    
    @Override
    public List<BoardDTO> boardSelectAll() throws SQLException {
        
            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;

            String sql = proFile.getProperty("board.selectAll");
            List<BoardDTO> list = new ArrayList<>();
            
            try {

                con = DBUtil.getConnection();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                
                while(rs.next()) {
                    list.add(new BoardDTO(rs.getInt("board_no"),
                            rs.getString("subject"),rs.getString("writer"),
                            rs.getString("content"),rs.getString("board_date")));
                }
                
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                DBUtil.dbClose(rs, ps, con);
            }
        return list;
    }

    @Override
    public List<BoardDTO> boardSelectBySubject(String keyWord) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        List<BoardDTO> list = new ArrayList<>();
        String sql = proFile.getProperty("board.selectBySubject");
        
        try {

            con = DBUtil.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, keyWord);
            rs = ps.executeQuery();
            while(rs.next()) {
                list.add(new BoardDTO(rs.getInt("board_no"),
                        rs.getString("subject"),rs.getString("writer"),
                        rs.getString("content"),rs.getString("board_date")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.dbClose(rs, ps, con);
        }
        
        return list;
    }

    @Override
    public BoardDTO boardSelectByNo(int boardNo) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        BoardDTO dto =null;
        String sql = proFile.getProperty("board.selectByNo");
        
        try {

            con = DBUtil.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, boardNo);
            rs = ps.executeQuery();
            
            if(rs.next()) {
                dto = new BoardDTO(rs.getInt("board_no"),
                        rs.getString("subject"),rs.getString("writer"),
                        rs.getString("content"),rs.getString("board_date"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.dbClose(rs, ps, con);
        }
        
        return dto;
    }

    @Override
    public int boardInsert(BoardDTO boardDTO) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        String sql = proFile.getProperty("board.insert");
        int result = 0;
        
        try {

            con = DBUtil.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, boardDTO.getSubject());
            ps.setString(2, boardDTO.getContent());
            ps.setString(3, boardDTO.getWriter());
            result = ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.dbClose(ps, con);
        }
        
        
        return result;
    }

    @Override
    public int boardUpdate(BoardDTO boardDTO) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        String sql = proFile.getProperty("board.updateByNo");
        int result = 0;
        
        try {
            con = DBUtil.getConnection();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, boardDTO.getContent());
            ps.setInt(2, boardDTO.getBoardNo());
            result = ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.dbClose(ps, con);
        }
        
        return result;
    }
    

    @Override
    public int boardDelete(int boardNo) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        String sql = proFile.getProperty("board.deleteByNo");
        int result = 0;
        
        try {
            con = DBUtil.getConnection();
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, boardNo);
            result = ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.dbClose(ps, con);
        }
        
        return result;
    }

}
