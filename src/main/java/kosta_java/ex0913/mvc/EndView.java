package kosta_java.ex0913.mvc;
/**
 * 작성자 : 김지성
 * 작성일자 : 180912 
 * 작성주제 : MVC와 ArrayList의 이해
 */
import java.util.List;

/**
	요청 결과에 대한 정보를 화면에 출력 담당 클래스
*/

class EndView {
	/**
		전체 전자제품 출력하기
	*/ 
	public static void printAll(List<Electronics> list){
		System.out.println("------------전자제품 List-------------");
		for(Electronics elec : list){
			System.out.print(elec);
			System.out.println();

		}
	}
	/**
		모델번호에 해당하는 제품 출력하기
	*/

	public static void printSearch(Electronics elec){
		System.out.println("--------------"+elec.getModelNo()+"의 검색결과----------");
		System.out.println(elec);
		
	}

	/**
		수정 or 등록의 결과메세지를 출력하기
	*/
	public static void printMessage(String message){
		System.out.println(message);
	}
}
