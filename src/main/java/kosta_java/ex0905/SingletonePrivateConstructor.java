package kosta_java.ex0905;
class Service{

    private static Service service = new Service();
    private Service(){} 
    //외부에서 객체생성불가(내부에서 생성해서 제공해준다)
    // 즉 개발자의 의도대로 생성할 수 있도록 하기 위해서 
    
    /**
        현재 객체를 생성해서 리턴해주는 메소드 작성한다
    */

    public static Service instance(){
        
        return service;
    }

}


class SingletonePrivateConstructor {
    public static void main(String[] args) {
        Service s1 = Service.instance();
        Service s2 = Service.instance();
        Service s3 = Service.instance();
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
