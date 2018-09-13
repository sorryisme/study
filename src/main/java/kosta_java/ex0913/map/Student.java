package kosta_java.ex0913.map;

public class Student extends Person{

    private int kor;
    private int eng;
    private int math;
    private int sum;
    public Student() {
    }
    public Student(String id, String name, int kor, int eng, int math) {
        super(id,name);
        this.kor = kor;
        this.math = math;
        this.eng = eng;
        sum = kor+eng+math;
    }
    public Student(String id, String name, int age, int kor, int eng, int math) {
        this(id,name,kor,eng,math);
        super.setAge(age);
    }
    public int getKor() {
        return kor;
    }
    public void setKor(int kor) {
        this.kor = kor;
    }
    public int getEng() {
        return eng;
    }
    public void setEng(int eng) {
        this.eng = eng;
    }
    public int getMath() {
        return math;
    }
    public void setMath(int math) {
        this.math = math;
    }
    public int getSum() {
        return sum;
    }
    public void setSum() {
        this.sum = kor + eng + math;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        builder.append(" kor=");
        builder.append(kor);
        builder.append(", eng=");
        builder.append(eng);
        builder.append(", math=");
        builder.append(math);
        builder.append(", sum=");
        builder.append(sum);
        return builder.toString();
    }
    
}

