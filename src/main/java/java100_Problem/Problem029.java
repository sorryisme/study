package java100_Problem;

public class Problem029 {

    public static void main(String[] args) {
        for(int year=1998;year<2006;year++) {
            boolean yearTF=((0 == (year % 4) && 0 !=(year%100)) || (0==year%400))? true : false;
        
            if(yearTF) {
                System.out.println(year+"는 윤년입니다.");
            } else {
                System.out.println(year+"윤년이 아닙니다.");
            }
        } // for문
        
        String s="";
        int numS=-123;
        int numT=numS;
        int count=1;
        for(int i=0; i<31; i++) {
            int aa = numS % 2;
            s=(aa>0)?aa+s:(-aa)+s;
            numS/=2;
        }
            System.out.println( numT+"toBinary" +s);
    }
}
