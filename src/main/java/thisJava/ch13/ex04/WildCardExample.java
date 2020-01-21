package thisJava.ch13.ex04;

import java.util.Arrays;

public class WildCardExample {
    public static void registerCourse( Course<?> course ) { // 모든 과정
        System.out.println(course.getName() + " 수강생" + Arrays.toString(course.getStudents()));
    }
    
    public static void registerCourseStudent ( Course<? extends Student> course) { //학생과정, 상위제한
        System.out.println(course.getName() + "수강생 "+ Arrays.toString(course.getStudents()));
    }
    
    public static void registerCourseWork( Course<? super Worker> course) {
        System.out.println(course.getName() + " 수강생 "+ Arrays.toString(course.getStudents()) );
    }
    
    
    public static void main(String[] args) {
        
        Person person = new Person("일반인");
        Worker worker = new Worker("직장인");
        Student student = new Student("학생");
        HighStudent highStudent = new HighStudent("고등학생");
        
        Course<Person> personCourse = new Course<Person>("일반인과정" , 5 );
        personCourse.add(person);
        personCourse.add(worker);
        personCourse.add(student);
        personCourse.add(highStudent);
        
        Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
        workerCourse.add(worker);
        
        Course<Student> studentCourse = new Course<Student>("학생과정", 5);
        studentCourse.add(student);
        studentCourse.add(highStudent);
        
        Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생과정", 5);
        highStudentCourse.add(highStudent);
        
        
        registerCourse(personCourse);
        registerCourse(workerCourse);
        registerCourse(studentCourse);
        registerCourse(highStudentCourse);
        
        registerCourseStudent(studentCourse);
        registerCourseStudent(highStudentCourse);
//        registerCourseStudent(personCourse); error
//        registerCourseStudent(workerCourse); error
        
        
        registerCourseWork(personCourse);
        registerCourseWork(workerCourse);
//        registerCourseWork(studentCourse); error
//        registerCourseWork(highStudentCourse); eror
        
        
        
        
    }
    
    
    
}
