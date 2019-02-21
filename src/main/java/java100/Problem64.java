package java100;

public class Problem64 {
    public static void main(String[] args) {
        for(int z=1; z<100; z++) {
            for(int y=1; y<100; y++) {
                for(int x=1; x< 100; x++) {
                    // z> y > x 수 중에서 피타고라스 정리를 만족시키는 수는?
                    if(z > x && y>x &&  z> y && z*z == x*x + y*y) {
                        System.out.println(x+":" +y +":" + z);
                    }
                }
            }
        }
        
        printPita(100);
        
    }// main
    
    public static boolean isPita(int x, int y, int z) {
        boolean isP= false;
        if(z*z == x*x + y*y) {
            isP=true;
        }
        return isP;
    }
    
    public static boolean isLarge(int x, int y, int z) {
        boolean isP = false;
        if( z>x && y >x && z>y) {
            isP=true;
        }
        return isP;
    }
    
    public static void printPita(int n) {
            for (int z = 1; z<n ; z++) {
                for(int y=1; y<n; y++) {
                    for(int x=1; x<n; x++) {
                        // z>y>x의 수 중에서 피타고라스 정리를 만족하는 수
                        if(isLarge(x, y, z) && isPita(x,y,z)) {
                            System.out.println("피타고라스의 수 : x= " +x +"y="+y+"z="+z);
                        }
                    }
                }
            }
    }
}
