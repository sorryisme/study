package kosta_java.ex0910.interfaceEx.defaultInterface;
/**
 * �Խù��� ����(�� ��ȣ, ����, ���� , �ۼ���...)�� �����ϴ� ��ü
 */
public class BoardDTO {
	private int no;
	private String subject;
	private String content;
	private String writer;
	
	//������
	//getter, setter
	//toString overriding
	public BoardDTO() {}
	public BoardDTO(int no, String subject, String content, String writer) {
		super();
		this.no = no;
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BoardDTO [no=");
		builder.append(no);
		builder.append(", subject=");
		builder.append(subject);
		builder.append(", content=");
		builder.append(content);
		builder.append(", writer=");
		builder.append(writer);
		builder.append("]");
		return builder.toString();
	}
	
	
}
