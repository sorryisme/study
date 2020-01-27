package thisJava.ch16.ex07;

public class StudentCompare implements Comparable<StudentCompare>{

    private String name;
    private int score;
    
    public StudentCompare(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(StudentCompare o) {
        return Integer.compare(score, o.getScore());
    }


    
    
}
