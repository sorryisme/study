package kosta_java.ex0910.interfaceEx;
interface InterfaceExam00{
	abstract void interfaceExam00();
}


interface InterfaceExam01 extends InterfaceExam00{
	final int i = 767;
	/*private*/ int k=999;

	void interfaceExam01(int i, int k);
}



interface InterfaceExam02{
	int j =747;
	/*private*/ int privateInt = 8; 
	// interface �ȿ� ��� ������ public static final

	/*private*/ void interfaceExam02(int j);
	// interface �ȿ� ��� �޼���� public abstract�̴� 
	// �ۼ��ϰų� �ۼ����� �ʴ� ���� �߿��ϴ�

}



class SuperClassExam{
	String superString = "Super";

	String superMethod(){
		System.out.println("SuperClassExam.SuperMethod()�� ȣ��Ǿ����ϴ�.");
		return "returnString";
	}
}

class SubClassExam01 extends SuperClassExam{}/*,InterfaceExam01{} */
//�������̽��� implements�� ���� ���������ϴ�


class SubClassExam02 extends SuperClassExam implements InterfaceExam01, InterfaceExam02{
	//�������̽��� ������ Ŭ������ �ݵ�� �޼��带 �������̵��ؾ��Ѵ� �׷��� ������ Ŭ������ abstract �� �߻�ȭ Ŭ������ �Ǿ���Ѵ�

	@Override
	public void interfaceExam00() {

	}

	@Override
	public void interfaceExam02(int j) {

	}

	@Override
	public void interfaceExam01(int i, int k) {
	}


}


abstract class SubClassExam03 implements /*SuperClassExam,*/ InterfaceExam01, InterfaceExam02{
	//�Ϲ� Ŭ������ ��ӹ��� �� ���� 
	//�������̽��� ��ӹ޾� �޼��带 �������̵� ���� �ʴ´ٸ� �� Ŭ������ abstract �� �߻�ȭ Ŭ�����̴�.


}


class SubClassExam04 extends SubClassExam02{
	//���⿡ �ʿ��� �͵��� �߰��Ͽ� ������ �ذ��ϼ���..
	public void interfaceExam00(){}
	public void interfaceExam01(int i, int k){}
	public void interfaceExam02(int j){}

	SubClassExam04(){
		System.out.println("subClassExam04() ��ü ����");
		System.out.println(" i = "+i);
		System.out.println(" j = "+j);
	}
	SubClassExam04(String s1, String s2){
		System.out.println(s1+" Ÿ�� "+"subClassExam04("+s2+") ��ü ����");

	}
	void printSuperString(){
		//InterfaceExam01 ie01 = new InterfaceExam01();
		//�������̽��� ������ �Ұ����ϴ�


		System.out.println(" superString = "+superString);
	}
}

//���⼭���ʹ� �ϳ��� ��ġ�� ���ð� �״�� ���� �˴ϴ�.
public class ImplememtsInterfaceExam{ 
	public static void main(String args[]){		
		SubClassExam02 sub02sub04 = new SubClassExam04("SubClassExam02", "sub02sub04");
		SuperClassExam  superSub04 = new SubClassExam04("SuperClassExam", "superSub04");
		InterfaceExam01 ifc01Sub04 = new SubClassExam04("InterfaceExam01", "ifc01Sub04");
		SubClassExam04 sub04 = new SubClassExam04();
		sub04.interfaceExam00();
		sub04.interfaceExam01(1,7);
		sub04.superMethod();
	}
}

