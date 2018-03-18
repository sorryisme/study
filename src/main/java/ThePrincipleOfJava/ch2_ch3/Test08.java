
package ThePrincipleOfJava.ch2_ch3;

public class Test08 {
    public static void main(String[] args) {
        float f = 0.1f;
        double d = 0.1;
        double d2 = (double)f;
        
        System.out.printf("10.0==10.0f %b\n", 10.0 == 10.0f);
        System.out.printf("0.1==0.1f %b\n", 01.==0.1f);
        // 실수형은 근사값으로 저장되므로 오차가 발생할 수 있다. false
        System.out.printf("f = %19.17f\n", f);
        System.out.printf("d = %19.17f\n", d);
        System.out.printf("d2 = %19.17f\n", d2);
        
        System.out.printf("d==f %b\n",  d==f);
        // 0.1f == 0.1d false
        System.out.printf("d==d2 %b\n", d==d2);
        // 0.1 == (double)0.1f false
        System.out.printf("d2==f %b\n", d2==f);
        System.out.printf("(float)d ==f %b\n", (float)d==f);
        //float과 double 타입을 비교하려면 double을 float으로 형변환해야 비교가능(높은 것에서 낮은것으로)
        
        
        
    }
}
