package ThePrincipleOfJava.ch2_ch3;

public class Test01 {
	public static void main(String[] args) {
		byte b=1;
		short s = 2;
		char c = 'A';
		
		int finger = 10;
		long big = 100_000_000_000L;
		long hex =0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum = 010; // 8진수ㄴ
		int hexNum = 0x10; // 16진수
		int bigNum = 0b10; // 2진수
		
		System.out.printf("b=%d\n",b);
		System.out.printf("s=%d\n",s);
		System.out.printf("c=%c, %d %n",c, (int)c);
		System.out.printf("finger[%5d]\n = ",finger);
		System.out.printf("finger[%-5d]\n = ",finger);
		System.out.printf("finger[%05d]\n = ",finger);
		
		System.out.printf("big=%d\n",big);
		System.out.printf("hex=%#x\n",hex);
		
		System.out.printf("octNum =%o,%d\n", octNum, octNum);
		System.out.printf("hexNum =%x,%d\n", hexNum, hexNum);
		System.out.printf("octNum =%s,%d\n", bigNum, bigNum);
		
	}
}
