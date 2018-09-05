package kosta_java.ex0904_answer;
class MainApp {
    public static void main(String[] args) {
        String data [][] = {
                {"100" , "에어컨" , "250000", "삼성 무풍에어컨"} ,
                {"200" , "세탁기" , "350000", "LG 세탁짱"} ,
                {"300" , "냉장고" , "500000", "냉장고입니다."} ,
                {"400" , "전자렌지" , "640000", "전자렌즈입니다."} ,
                {"500" , "밥통" , "450000", "쿠쿠밥솥 최고!"} , 
        };

        ElectronicsService service = new ElectronicsService();

        // - ElectronicsService의 save를 호출한다.
        service.save(data);
        // - ElectronicsService의 printAll() 호출한다.
        service.printAll();

        // - ElectronicsService의 searchBymodelNo(int modelNo) 호출한다.
        //   (modelNo는 실행할때 인수(args)로 전달된 정보를 준다)
        if(args.length > 0 )
            service.searchBymodelNo(Integer.parseInt(args[0]));

    }
}
