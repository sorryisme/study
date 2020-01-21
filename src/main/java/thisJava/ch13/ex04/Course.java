package thisJava.ch13.ex04;

public class Course<T> {
    private String name;
    private T[] students;
    
    public Course (String name, int capacity) {
        this.name = name;
        students = (T[]) (new Object[capacity]);
        //T[n] 형태로 생성 불가
    }

    public String getName() { return name; }
    public T[] getStudents() { return students; } 
    
    public void add(T t) {
        for(int i=0; i < students.length; i++) {
            if( students[i] == null ) {
                students[i] = t;
                break;
            }
        }
    }
    
}
