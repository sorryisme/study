package java100;

public class Problem62 {
    public static void main(String[] args) {
        for(int z=1;z<5; z++) {
            for(int y=1;y<5;y++) {
                for(int x=1; x<5; x++) {
                   if((x+y>z) && (y+z>x) && (x+z>y)) {
                       System.out.println("삼각형의 조건:" +x+"+"+y+"+"+z );
                   }
                }
            }
        }
        
        printTriCons(5);
        
    }// main
    public static boolean isXYZTri(int x,int y, int z) {
        boolean isL=false;
        if(x+y>z) {
            isL = true;
        }
        
        return isL;
    }
    
    public static boolean isXYZTriUp(int x, int y, int z) {
        boolean isL = false;
        if(x+y < z) {
            isL=true;
        }
        return isL;
    }
    
    public static void printTriCons(int n) {//삼각형
        for(int z=1; z<n; z++) {
            for(int y=1;y<n; y++) {
                for(int x=1; x<n; x++) {
                    if(isXYZTri(x, y, z)&& isXYZTri(y, z, x) && isXYZTri(z, x, y)) {
                        System.out.println("삼각형의 조건 : x " + x +":"+ y +":"+ z );
                    }
                }
            }
        }
    }
}
