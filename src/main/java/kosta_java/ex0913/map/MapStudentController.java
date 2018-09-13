package kosta_java.ex0913.map;

public class MapStudentController {
    private static MapStudentService service = new MapStudentService();
    
    
    /**
     * 전체검색
     */
    public static void selectAll() {
        try {
            EndView.printAll(service.selectAll());
        } catch (RuntimeException e) {
            EndView.printMessage(e.getMessage());
        }
    }
    
    /**
     * 부분검색
     */
    public static void searchById(String id) {
        try {
            EndView.printSearch(service.searchByKey(id));
        } catch (RuntimeException e) {
            EndView.printMessage(e.getMessage());
        }
    }
    
    /**
     * 등록
     */
    
    public static void insert(Person person) {
        try {
            service.insert(person);
        } catch (RuntimeException e) {
            EndView.printMessage(e.getMessage());
        }
    }
    
    /**
     * 삭제
     */
    public static void delete(String id) {
        try {
            service.delete(id);
        } catch (RuntimeException e) {
            EndView.printMessage(e.getMessage());
        }
    }
    
    /**
     * 수정
     */
    public static void update(Person person) {
        try {
            service.update(person);
        } catch (RuntimeException e) {
            EndView.printMessage(e.getMessage());
        }
    
    }
}
