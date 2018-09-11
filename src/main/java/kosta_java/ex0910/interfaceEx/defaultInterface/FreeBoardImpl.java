package kosta_java.ex0910.interfaceEx.defaultInterface;

public class FreeBoardImpl implements BoardInterface{

	@Override
	public BoardDTO selectByNo(int no) {
		System.out.println("Freeboard�� selectByNO�� ȣ��");
		return null;
	}

	@Override
	public boolean insert(BoardDTO boardDTO) {
		System.out.println("Freeboard�� insert�� ȣ��");
		return false;
	}
	
}
