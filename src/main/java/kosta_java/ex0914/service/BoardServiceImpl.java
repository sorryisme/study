package kosta_java.ex0914.service;

import java.util.Iterator;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.TreeMap;

import kosta_java.ex0914.dto.ArchiveBoard;
import kosta_java.ex0914.dto.Board;
import kosta_java.ex0914.dto.PhotoBoard;
import kosta_java.ex0914.util.DuplicateException;
import kosta_java.ex0914.util.InexistentException;

public class BoardServiceImpl implements BoardService {

    private static BoardService instance = new BoardServiceImpl();

    Map<String,Map<String,Board>> allBoardList = new TreeMap<>();

    private BoardServiceImpl() {
        Map<String,Board> archiveMap= new TreeMap<>();
        Map<String,Board> photoMap= new TreeMap<>();
        //archiveInfo.properties 파일로딩
        // properties가 map을 상속받음

        ResourceBundle rb = 
                ResourceBundle.getBundle("kosta_java/ex0914/service/archiveInfo");
        Iterator<String> keys = rb.keySet().iterator();

        while(keys.hasNext()) {
            String key = keys.next();
            String[] value = rb.getString(key).split(",");
            Board board = new ArchiveBoard(Integer.parseInt(value[0]),value[1],value[2],value[3],value[4],value[5],Integer.parseInt(value[6]));
            archiveMap.put(key,board);
        }

        rb = ResourceBundle.getBundle("kosta_java/ex0914/service/photoInfo");
        keys = rb.keySet().iterator();

        while(keys.hasNext()) {
            String key = keys.next();
            String[] value = rb.getString(key).split(",");
            Board board = new PhotoBoard(Integer.parseInt(value[0]),value[1],value[2],value[3],value[4],value[5]);
            photoMap.put(key,board);
        }
        allBoardList.put("archive", archiveMap);
        allBoardList.put("photo", photoMap);


    }

    public static BoardService getInstance() {
        return instance;
    }

    private void propertiesFileStore(String key, Board board) {
    }


    @Override
    public Map<String, Map<String, Board>> getBoardList() throws InexistentException {
        if(allBoardList == null) {
            throw new InexistentException("Null Exception : 게시물이 존재하지 않습니다.");
        }

        return allBoardList;
    }

    /**
     *게시판의유형(Kind)에 따른 게시물 검색하기
     *  @return kind에 해당하는 전체게시물 Map으로 리턴
     *  @param :  게시물유형에 따른 key를 인수로 전달받는다.
     *  @throws : kind에 해당하는 게시물이 한개도 없을 때 InexistentException예외발생
     *  kind = > AB, PB 둘중 하나 
     * */

    @Override
    public Map<String, Board> getBoardByKind(String kind) throws InexistentException {
        if(!allBoardList.containsKey(kind)) {
            throw new InexistentException("kind Exception : 요청하신 유형의 게시판이 존재하지 않습니다");
        }
        return allBoardList.get(kind);
    }

    /**
     *  게시물 유형에서 글번호에 해당하는 게시물 한개를 검색
     * @return 게시물 정보 한개를 Board 형태로 리턴
     * @param kind는 게시물 유형, no는 게시물 글번호
     * @throws 검색하는 게시물이 없으면 InexistentException 예외발생
     * kind 잘못이면 kind exception
     * */

    @Override
    public Board getBoardByNo(String kind, int no) throws InexistentException {


        if(!allBoardList.containsKey(kind)) {
            throw new InexistentException("kind Exception : 찾으시는 종류가 존재하지 않습니다");
        } else if (!allBoardList.get(kind).containsKey(Integer.toString(no))) {
            throw new InexistentException("no Exception : 찾으시는 번호가 존재하지 않습니다");
        }

        return allBoardList.get(kind).get(Integer.toString(no));
    }


    /**
     *  게시물 등록하기
     *  @return : true이면  등록성공, false이면 등록실패
     *  @param : kind는 추가할 게시판유형, board는 추가할 게시물의 정보
     *  @throws: 등록하기 전에 글번호 중복을 체크해서 중복이면 DuplicateException발생
     *           등록을 실패하면  InexistentException 발생
     * */

    @Override
    public boolean insertBoard(String kind, Board board) throws DuplicateException, InexistentException {

        if(!allBoardList.containsKey(kind)) throw new InexistentException("kind insert Exception : 삽입할 종류가 존재하지 않습니다");

        if(duplicateByNo(kind,board.getNo())) throw new DuplicateException("Duplicate insert Exception : 이미 존재하는 게시판 번호입니다.");

        if(board instanceof ArchiveBoard) {
            allBoardList.get("archive").put(Integer.toString(board.getNo()), board);
            return true;
        } else if(board instanceof ArchiveBoard) {
            allBoardList.get("photo").put(Integer.toString(board.getNo()), board);
            return true;
        } 

        return false;
    }

    /**
     * 5. 등록전에 번호 중복여부 체크 하는 기능
     *    @return : true이면 중복, false이면 중복아님.
     *    @param : kind의 게시판의 유형, no는 글번호
     * */

    @Override
    public boolean duplicateByNo(String kind, int no)  {
        if(allBoardList.get(kind).containsKey(Integer.toString(no))) {
            return true;
        }       
        return false;
    }

    /**
     * 6. 게시물 삭제하기
     *  @return : true이면 삭제성공, false이면 삭제실패
     *  @param : kind의 게시판의 유형, no는 글번호
     *  @throws : 삭제가 되지 않으면 InexistentException 예외 발생.
     * */

    @Override
    public boolean deleteBoard(String kind, int no) throws InexistentException {
        if(!allBoardList.containsKey(kind)) 
            throw new InexistentException("kind Delete Exception : 삭제할 종류가 존재하지 않습니다");

        if(!duplicateByNo(kind,no)) 
            throw new InexistentException("duplicate No Exception : 삭제할 번호가 존재하지 않습니다");

        allBoardList.get(kind).remove(Integer.toString(no));
        return true;
    }

    /**
     * 7. 게시물 수정하기
     *     공통 : 제목, 작성자, 내용
     *     photo : imgName
     *     archive : fileName, fileSize
     *     
     * @return :true이면 수정성공, false이면 수정실패
     * @param : board는 수정할 게시물의 정보, kind는 수정될 게시물이있는 게시판의유형
     * @throws: 수정되지 않으면 InexistentException 예외발생
     * */

    @Override
    public boolean updateBoard(Board board, String kind) throws InexistentException {
        if(!allBoardList.containsKey(kind)) {
            throw new InexistentException("kind Update Exception :수정할 종류가 존재하지 않습니다");
        }

        if(!duplicateByNo(kind,board.getNo())) {
            throw new InexistentException("duplicate Update Exception : 수정할 내용이 존재하지 않습니다");
        }

        if(board instanceof ArchiveBoard) {
            ArchiveBoard archiveBoard =  (ArchiveBoard) allBoardList.get("archive").get(Integer.toString(board.getNo()));

            archiveBoard.setSubject(board.getSubject());
            archiveBoard.setWriter(board.getWriter());
            archiveBoard.setContent(board.getContent());
            archiveBoard.setFileName(((ArchiveBoard) board).getFileName());
            archiveBoard.setFileSize(((ArchiveBoard) board).getFileSize());
            return true;
        } else if(board instanceof PhotoBoard) {
            PhotoBoard photoBoard =  (PhotoBoard) allBoardList.get("photo").get(Integer.toString(board.getNo()));

            photoBoard.setSubject(board.getSubject());
            photoBoard.setWriter(board.getWriter());
            photoBoard.setContent(board.getContent());
            photoBoard.setImgName((((PhotoBoard)board).getImgName()));
            return true;
        }
        return false;
    }


}
