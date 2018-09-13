package kosta_java.ex0913.homwork;
/**
 * 작성자 : 김지성
 * 작성일자 : 180912 
 * 작성주제 : 로또
 */
public class LottoExam {
	public static void main(String[] args) {
		
		Lotto lotto = new Lotto();
		lotto.addLotto();
		lotto.print();
		System.out.println("정렬 후 ");
		lotto.sorting();
		lotto.print();
	}		
	
}
