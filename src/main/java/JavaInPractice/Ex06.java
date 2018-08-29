package JavaInPractice;


//직원을 상속받은 아르바이트
public class Ex06 extends Ex05{
    // 교대
    private String shift;

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
    
    public void work() {
        System.out.println(getPosition() + "입니다. 파트타임으로"+"일을 합니다");
    }
    
}
