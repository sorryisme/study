package kosta_java.ex0910.interfaceEx.defaultInterface;
/**
 * �Խ����� ������ �������� ����ϴ� �ֿ� �޼ҵ� ����(�԰ݼ� ����) 
 */
public interface BoardInterface {
	/**
	 * �˻��ϱ�(�󼼺���)
	 */
	BoardDTO selectByNo(int no);
	
	
	/**
	 * ����ϱ�
	 * @return : true ����, false ����
	 */
	
	boolean insert(BoardDTO boardDTO);
	
	
	/**
	 * 1.8 version���� �߰��� ���� - abstract �ƴϴ� = �޼ҵ� body�� �����Ѵ�.
	 * 
	 * 1) default �޼ҵ�
	 * 	- ��ɱ����� ����
	 * 	- �ݵ�� ���� ��ü�� �־�߸� ȣ�Ⱑ��
	 * 2) static �޼ҵ� 
	 * 	- ��� ���� ����
	 * 	- ������ü ���� ȣ�Ⱑ��
	 * 		: �������̽��̸�.�޼ҵ��̸�();
	 * �߰��� ����
	 * 	:�������� ���鿡�� �̹� ���ߵ� ������ �� Ư�� interface �޼ҵ尡 
	 * 	  �߰��Ǹ� �̹� ������ ��� Ŭ�������� �������ϴ� ���ŷ����� �ִ�. 
	 * 	 default �޼ҵ带 ����� �ʿ��� ���� Ŭ���������� �������ϸ� �ȴ�.
	 * 	  ���� ��� ���� Ŭ������ ������ ����� ������ �ִٸ� 
	 * 	 ���������� �ʰ� �������� interface ����� ���� ����� �� �ִ�.
	 * */
	
	/**
	 * �����ϱ�
	 * */
	default boolean delete(int no) {
		System.out.println(no+"�� �Խù��� �����Ͽ����ϴ�.");
		return true;
	}
	
	/**
	 * �����ϱ�
	 * */
	static void update() {
		System.out.println("�����Ǿ����ϴ�");
	}
	 
}
