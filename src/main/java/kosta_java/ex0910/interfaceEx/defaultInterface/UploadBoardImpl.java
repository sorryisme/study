package kosta_java.ex0910.interfaceEx.defaultInterface;

public class UploadBoardImpl implements BoardInterface{

	@Override
	public BoardDTO selectByNo(int no) {
		System.out.println("UploadBoardImpl SelectByNo ȣ��");
		return null;
	}

	@Override
	public boolean insert(BoardDTO boardDTO) {
		System.out.println("UploadBoardImpl insert ȣ��");
		return false;
	}
	
}
