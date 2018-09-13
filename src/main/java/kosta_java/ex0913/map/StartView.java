package kosta_java.ex0913.map;

public class StartView {
    public static void main(String[] args) {
        //MVC 구조 형태 : startview => controller => service
        // 1. 전체검색
        System.out.println("1. 전체검색 ************");

        MapStudentController.selectAll();

        System.out.println("2. 검색하기 ************");
        //person 경우 => 결과 : 이름
        System.out.print(" (1) person => 결과");
        MapStudentController.searchById("apple");

        //student 경우 => 결과 : 이름 , 총점
        System.out.print(" (2) Student => 결과");
        MapStudentController.searchById("lee");
        
        // 없는 경우  => 예외메세지
        System.out.print(" (3) 예외메세지 발생");
        MapStudentController.searchById("aa");

        
        System.out.println("3. 등록하기 ************");
        //person 등록
        System.out.println("1. person 등록 => ");
        MapStudentController.insert(new Person("aaa","aaa",22));
        //student 등록
        System.out.println("2. student 등록 => ");
        MapStudentController.insert(new Student("bbb", "bbb",33,100,100,100));
        
        //등록 실패 = > key값이 같은 경우
        System.out.println("3. key가 중복=> ");
        MapStudentController.insert(new Student("kim", "kim",33,100,100,100));
        MapStudentController.insert(new Person("kim", "kim",33));
        /*
        
        System.out.println("4. 삭제하기 ************");
        //삭제성공
        MapStudentController.delete("park");
        //삭제실패
        MapStudentController.delete("cc");
        */
        
        
        System.out.println("5. 수정하기하기 ************");
        // person
        MapStudentController.update(new Person("kim","이쁘이"));// id와 name만 전달 - 생성자 추가
        // 생성자 중복코드 제거 this();
        
        // student
        MapStudentController.update(new Student("aaa","이쁘이" ,77,77,77));// id name 점수- 생성자 추가
        // 생성자 중복코드 제거 this();

        //실패
        //아이디 없으면 수정실패
        MapStudentController.update(new Student("jang","이쁘이" ,100,100,100));
        
        
        MapStudentController.selectAll();
    }
}
