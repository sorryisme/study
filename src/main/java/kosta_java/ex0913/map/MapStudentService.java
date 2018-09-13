package kosta_java.ex0913.map;

import java.util.HashMap;
import java.util.Map;
public class MapStudentService {
	private Map<String, Person> map = new HashMap<>();
	
	/**
	 * 데이터 초기화
	 * */
	public MapStudentService() {
		map.put("apple", this.create("apple", "가각간", 15));
		map.put("kim", this.create("kim", "장독건", 55));
		
		map.put("park", this.create("park", "지성빠레", 16,70,80,90));
		map.put("hyun", this.create("hyun", "켠", 25,100,100,100));
		map.put("lee", this.create("lee", "승우", 19,50,70,80));
	}
	
	/**
	 * Person 또는 Student 생성해서 리턴해주는 메서드를 작성
	 **/
	public Person create(String id, String name, int age, int...arg) {
	    if(arg.length==0) { //person
	    	return new Person(id,name,age);
	    } else {
	    	return new Student(id,name,age,arg[0],arg[1],arg[2]);
	    }
	}
	
	/**
	 * 전체출력
	 * */
	public Map<String, Person> selectAll() {
		if(map.isEmpty()) {
			throw new RuntimeException ("Person 또는 Student 정보가 없습니다");
		}
		return map;
	}
	
	/**
	 * key에 해당하는 정보검색
	 * key에 해당하는 정보를 출력할 때 
	 ㅇ
	 * 없는 경우 "id는 없습니다." 예외발생 => end view에서 처리
	 * */

	public Person searchByKey(String id) {
		if(!map.containsKey(id)) {
			throw new RuntimeException("요청하신 id의 정보가 없습니다.");
		}
		return map.get(id);
	}
	/**
	 * 등록 : key와 Person의 정보를 받아 등록하는 메소드
	 * key는 person의 아이디
	 * 실패하면 예외 발생 => 중복발생
	 * */
	public void insert(Person person) {
		if(map.containsKey(person.getId())) {
			throw new RuntimeException("요청 아이디는 이미 존재합니다");
		}
		map.put(person.getId(), person);
	}

	
	/**
	 * 삭제
	 * id에 해당하는 value를 삭제 
	 * 삭제되지 않으면 예외발생
	 **/
	public void delete(String id) {
		if(!map.containsKey(id)) {
			throw new RuntimeException("삭제할  id의 정보가 없습니다.");
		}
		map.remove(id);
		System.out.println("삭제하였습니다.(임시)");
	}
	/**
	 * 수정
	 * person인 경우 - 이름만 수정
 	 * student인 경우 - 이름 , 국어, 수학, 영어, 총점
	 * 수정이 안된다면 예외발생(키가 잘못된 경우)
	 * 
	 * */
	public void update(Person person) { 
		if(!map.containsKey(person.getId()))
			throw new RuntimeException("수정할 아이디가 없습니다");
		
		Person ps = map.get(person.getId()); 
		
		
		if(person instanceof Student && ps instanceof Person) {
			throw new RuntimeException("타입 오류 입니다.");
			
		} else if(person instanceof Student && ps instanceof Student) {
			((Student) ps).setKor(((Student) person).getKor());
			((Student) ps).setEng(((Student) person).getEng());
			((Student) ps).setMath(((Student) person).getMath());
			((Student) ps).setSum();
			ps.setName(person.getName());
		} else {
			ps.setName(person.getName());

		}
		
		
		//인수로 전달 된 id를 꺼내서 존재유무를 체크
		//있는 경우.... 찾은 객체와 전달된 객체의 정보로 수정
		// 맵 데이터 타입과 인수로 들어오는 데이터 타입 일치해야함
		
		
	}
}

