package kosta_java.ex0905;

class ElectronicsService {
    private static ElectronicsService service = new ElectronicsService();

    String data [][] = {
      {"100" , "에어컨" , "250000", "삼성 무풍에어컨"} ,
      {"200" , "세탁기" , "350000", "LG 세탁짱"} ,
      {"300" , "냉장고" , "500000", "냉장고입니다."} ,
      {"400" , "전자렌지" , "640000", "전자렌즈입니다."} ,
      {"500" , "밥통" , "450000", "쿠쿠밥솥 최고!"}
      };

      Electronics elecArr[] = new Electronics[20];
    
      /**
        Electronics 타입 배열안에 실제 들어있는 전자제품 개수 check하는 변수
      */

      static int count;


    /**
        외부에서 객체생성 못하도록 private 생성자 작성
    */
    private ElectronicsService(){
    // 초기치 데이터 세팅하기
        for(int i=0; i<data.length ;i++){
            elecArr[i] = new Electronics(Integer.parseInt(data[i][0]),data[i][1],Integer.parseInt(data[i][2]),data[i][3]);
            count++;
        }   
    }

    /**
        현재 객체를 사용할 수 있도록 객체를 리턴해주는 메소드 작성
    */
    public static ElectronicsService getService(){
        return service;
    }


    /**
        1. 전체 검색 기능
    */
    public Electronics [] selectAll(){
        return elecArr;
    }
    
    /**
        2. 모델 번호에 해당하는 검색
    */

    public Electronics searchByModelNo(int modelNo){
        for(int i=0; i < count; i++){
            if(elecArr[i].getModelNo() == modelNo ){
                return elecArr[i];
            }
        }
        return null;
    }

    /**
        3. 모델번호에 해당하는 전자제품수정하기(가격, 상품내용)
        @return : true - 수정성공 , false - 수정실패;
    */

    public boolean update(Electronics elec){
        for(int i=0; i < count; i++){
            if(elecArr[i].getModelNo() == elec.getModelNo()){
                elecArr[i].setModelPrice(elec.getModelPrice());         
                elecArr[i].setModelDetail(elec.getModelDetail());               
                return true;
            }
        }
        return false;
    }

    /**
        4. 전자제품 추가하기(등록)
        @return : true : 등록성공, false - 등록실패
    */
    public boolean insert(Electronics elec){
            for(int i=0; i < count; i++){
                if(elecArr[i].getModelNo() == elec.getModelNo()) {
                    return false;
                } 
            }       
        
            elecArr[++count] = new Electronics(elec.getModelNo(),elec.getModelName(), elec.getModelPrice(),elec.getModelDetail());
            
            //System.out.println("count값"+count);
            return true;
    }
}