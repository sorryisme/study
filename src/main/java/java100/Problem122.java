package java100;

public class Problem122 {
    public static void main(String[] args) {
        int a =0;
        int num =0;
        a = 12345;
        String b= a+"";
        for(int i=0;i<b.length();i++) {
            num += a % 10;
            a/=10;
        }
        System.out.println(num);
    }
}
