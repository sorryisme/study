 package kosta_java.ex0910.interfaceEx.defaultInterface;

public class MainApp {
	public static void main(String[] args) {
		BoardInterface board = null;
		System.out.println("1) FreeBoard �Խ��� ....");
		board = new FreeBoardImpl();
		test(board);
		System.out.println("2) QABoard �Խ��� ....");
		board = new QABoardImpl();
		test(board);
		System.out.println("3) UploadBoard �Խ��� ....");
		board = new UploadBoardImpl();
		test(board);
	}
	
	
	/**
	 * �� �Խ����� �˻��� ����� ȣ�����ִ� �޼ҵ�
	 * */
	public static void test(BoardInterface board){
		// �Ű������� �̿��� ������
		// �˻��� ����� ȣ���Ѵ�.
		
		board.selectByNo(10);
		board.insert(new BoardDTO());
		board.delete(10);
		BoardInterface.update();
		
	}
}
