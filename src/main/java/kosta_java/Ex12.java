package kosta_java;
class Test{

    int a =5;
    static int b = 10;

    public void aa(){// non-static 영역에서 static, non-static 모두 접근 가능
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(b);
        System.out.println(this.b);
    }

    public void bb(){ // non-static 영역에서 static, non-static 모두 접근 가능
        aa();
        this.aa();
        cc();
        this.cc();
    }

    public static void cc(){// static 안에서 static만 , this는 사용불가
        //System.out.println(a);
        //System.out.println(this.a);
        System.out.println(b);
        //System.out.println(this.b);
    }

    public static void dd(){
        //aa();
        //this.aa();
        cc();
        //this.cc();
    }

}

class Ex12 {
    public static void main(String[] args) {
        System.out.println(Test.b);
        //System.out.println(Test.a); 객체 생성해야 사용가능하다
        
        Test.dd();
        //Test.aa(); non-static이라 객체를 생성해야한다.

        //static 변수 공유 대하여 
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();

        System.out.println("t1 =" + t1);
        System.out.println("t2 =" + t2);
        System.out.println("t3 =" + t3);

        //non-static 변수 값 변경

        System.out.println("a 변수 값 변경전...");
        System.out.println("t1.a = "  + t1.a );
        System.out.println("t2.a = "  + t2.a );
        System.out.println("t3.a = "  + t3.a );

        t1.a = 100;

        System.out.println("a 변수 값 변경후...");
        System.out.println("t1.a = "  + t1.a );
        System.out.println("t2.a= "  + t2.a );
        System.out.println("t3.a = "  + t3.a );
        //////////////////////////////////////////
        
        //static 변수 값 변경

        System.out.println("a 변수 값 변경전...");
        System.out.println("t1.b = "  + t1.b );
        System.out.println("t2.b = "  + t2.b );
        System.out.println("t3.b = "  + t3.b );

        t1.b = 100;

        System.out.println("a 변수 값 변경후...");
        System.out.println("t1.b = "  + t1.b );
        System.out.println("t2.b = "  + t2.b );
        System.out.println("t3.b = "  + t3.b );

    }
}
