package kosta_java.ex1002.prepare.view;

import java.util.List;

import kosta_java.ex1002.dto.EmpVo;
import kosta_java.ex1002.prepare.dao.EmpDAO;
import kosta_java.ex1002.prepare.dao.EmpDAOImpl;


public class StartView {
	
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAOImpl();
		
		//1. 레코드 추가 - 사원번호 중복체크 한 후 중복아닐 때 추가
			System.out.println("1. 레코드 추가 - 사원번호 중복체크 한 후 중복아닐 때 추가");
			EmpVo empVo = new EmpVo(9008,"얼짱","백조",5500);
			
			if(dao.duplicateByEmpno(empVo.getEmpno())) {
				EndView.printMessage(empVo.getEmpno()+"는 중복입니다");
			} else {
				if(dao.empInsert(empVo) > 0)
					EndView.printMessage("등록되었습니다");
				else 
					EndView.printMessage("등록되지 않았습니다.");
			} 
			
		///////////////////////////////////////////////////////	
		//2. 사원번호 검색 - 
			
			System.out.println("사원번호 검색 --------");
			EmpVo vo = dao.selectByEmpno(7698);
			EndView.printByEmpno(vo);
		
		//3. 전체검색		
			System.out.println("3. 전체검색");
			List<EmpVo> list = dao.selectAll();
			EndView.printAll(list);
		//4. 사원 번호에 해당하는 레코드 삭제
		
//			System.out.println("4. 사원 번호에 해당하는 레코드 삭제");
//			if(!dao.duplicateByEmpno(empVo.getEmpno())) {
//				EndView.printMessage(empVo.getEmpno()+"는 없는 번호입니다");
//			} else {
//				if(dao.empDelete(empVo.getEmpno()) > 0)
//					EndView.printMessage("삭제되었습니다.");
//				else 
//					EndView.printMessage("삭제에 실패했습니다.");
//			} 
			
		//5. 사원번호에 해당하는 레코드 수정
			empVo = new EmpVo(9008,"수정","수정",5000);
			
			System.out.println("5. 사원번호에 해당하는 레코드 수정");
			if(!dao.duplicateByEmpno(empVo.getEmpno())) {
				EndView.printMessage(empVo.getEmpno()+"는 없는 번호입니다");
			} else {
				if(dao.empUpdate(empVo) > 0)
					EndView.printMessage("수정 되었습니다.");
				else 
					EndView.printMessage("수정에 실패했습니다.");
			} 
			
	}
}
