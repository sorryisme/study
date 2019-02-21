package java100;
/**
 * 2,3,5g 추가 각각 10개씩 있다
 * 추를 조합해서 81g 만든다
 */
public class Problem63 {
    public static void main(String[] args) {
        for(int five=0; five<11; five ++) {
            for(int three =0; three <11; three++) {
                for(int two=0;two<11; two ++) {
                        if(5*five + 3*three +2* two == 81) {
                            // 5g * 갯수 + 3g * 갯수 + 2g * 갯수 = n이 나오면 된다.
                            System.out.printf("5g = %d, 3g = %d, 2g =%d\n", five,three,two);
                        }
                }
            }
        }
    }
}
