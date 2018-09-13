package kosta_java.ex0913.mvc;
import java.util.Scanner;

/**
 * 작성자 : 김지성
 * 작성일자 : 180912 
 * 작성주제 : MVC와 ArrayList의 이해
 */
/**
	사용자로부터 메뉴를 통해 원하는 기능을 요청 받기 위한 View
*/


class StartView {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("************** 메뉴 선택 ***************");
			System.out.println("1. 전체검색 2. 조건검색 3. 수정하기 4. 등록하기  5. 삭제하기  6.종료하기");
			int choiceMenu = sc.nextInt();
			switch(choiceMenu){
				case 1: ElectronicsController.selectAll(); break;
				case 2: searchMenu(sc); break;
				case 3: updateMenu(sc); break;
				case 4: insertMenu(sc); break;
				case 5: deleteMenu(sc); break;
				case 6: 
					System.out.println("프로그램 종료됩니다.");
					System.exit(0);// 프로그램 종료 
			}
		}
	}

	/**
		조건 검색 메뉴
	*/
	public static void searchMenu(Scanner sc){
		System.out.println("검색하려는 모델번호?");
		int modelNo = sc.nextInt();
		ElectronicsController.searchByModelNo(modelNo);
	}

	/**
		수정하기 메뉴
	*/
	public static void updateMenu(Scanner sc){

		Electronics elec = new Electronics();
		System.out.println("바꾸려는 모델번호는?");
		elec.setModelNo(sc.nextInt());

		System.out.println("바꾸실 모델가격 입력");
		elec.setModelPrice(sc.nextInt());
		
		System.out.println("바꾸실 모델 디테일 입력");
		elec.setModelDetail(sc.next());
		
		ElectronicsController.update(elec);
	
	}

	/**
		등록하기 메뉴
	*/
	public static void insertMenu(Scanner sc){
		Electronics elec = new Electronics();
		System.out.println("입력하실 모델번호는?");
		elec.setModelNo(sc.nextInt());

		System.out.println("입력하실 모델명은?");
		elec.setModelName(sc.next());
		
		System.out.println("입력하실 모델가격은?");
		elec.setModelPrice(sc.nextInt());
		
		System.out.println("입력하실 모델설명은?");
		elec.setModelDetail(sc.next());

		ElectronicsController.insert(elec);
	}
	
	public static void deleteMenu(Scanner sc) {
		System.out.println("삭제하실 모델번호는?");
		ElectronicsController.delete(sc.nextInt());
	}
}
