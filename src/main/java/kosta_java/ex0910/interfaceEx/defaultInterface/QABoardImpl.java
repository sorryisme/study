package kosta_java.ex0910.interfaceEx.defaultInterface;

public class QABoardImpl implements BoardInterface{

	@Override
	public BoardDTO selectByNo(int no) {
		System.out.println("QABoard selectByNo ȣ��");
		return null;
	}

	@Override
	public boolean insert(BoardDTO boardDTO) {
		System.out.println("QABoard insert ȣ��");
		return false;
	}

	@Override
	public boolean delete(int no) {
		System.out.println("QABoard �������̵� ����ó���Ͽ����ϴ�.");
		return true;
	}
	
	
	
	
}
