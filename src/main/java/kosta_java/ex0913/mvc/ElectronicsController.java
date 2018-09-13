package kosta_java.ex0913.mvc;
/**
 * 작성자 : 김지성
 * 작성일자 : 180912 
 * 작성주제 : MVC와 ArrayList의 이해
 */
import java.util.List;

/**
	뷰로부터 사용자 요청을 받아서 그에 해당하는 Service를 호출하고
	그 결과를 받아 해당하는 뷰에 호출한다.
*/

class ElectronicsController {
	static ElectronicsService service = ElectronicsService.getService();
	
	/**
		1. 전체검색
	*/ 
	public static void selectAll(){
		//service 호출 -> 결과 받아서 -> EndView 호출
		List<Electronics> list = service.selectAll();
		EndView.printAll(list);
		
	}

	/**
		2. 조건검색
	*/

	public static void searchByModelNo(int modelNo){
		Electronics elec = service.searchByModelNo(modelNo);
		
		if(elec == null) EndView.printMessage(modelNo+"는 없는 정보입니다.");
		else EndView.printSearch(elec);
	}

	/**
		3. 수정하기
	*/
	public static void update(Electronics elec){
		if(service.update(elec) == false) 
			EndView.printMessage(elec.getModelNo()+"는 없는 정보입니다.");
		else EndView.printMessage(elec.getModelNo()+"의 정보를 수정 완료 하였습니다.");
	}
	
	

	/**
	4. 등록하기
	*/
	public static void insert(Electronics elec){
		if(service.insert(elec)){
			EndView.printMessage(elec.getModelNo()+"삽입 완료.");
		} else {
			EndView.printMessage(elec.getModelNo()+"중복됩니다..");

		}
	}
	
	/***
	 5. 삭제하기
	 */
	
	public static void delete(int modelNo) {
		if(service.delete(modelNo))
			EndView.printMessage(modelNo + "는 삭제되었습니다");
	}


}
