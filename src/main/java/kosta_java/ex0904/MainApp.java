package kosta_java.ex0904;

class MainApp{  
    public static void main(String[] args) {

        String data [][] = {
                {"100" , "에어컨" , "250000", "삼성 무풍에어컨"} ,
                {"200" , "세탁기" , "350000", "LG 세탁짱"} ,
                {"300" , "냉장고" , "500000", "냉장고입니다."} ,
                {"400" , "전자렌지" , "640000", "전자렌즈입니다."} ,
                {"500" , "밥통" , "450000", "쿠쿠밥솥 최고!"}  
        };

        ElectronicsService service = new ElectronicsService();
        service.save(data);
        service.printAll();
        System.out.println("-----------------검색-----------------------");
        service.searchBymodelNo(300);
        service.searchBymodelNo(700);

    }
}

class Electronics{
    private int modelNo;
    private String modelName;
    private int modelPrice;
    private String modelDetail;



    Electronics(String[] data){
        setModelNo(Integer.parseInt(data[0]));
        setModelName(data[1]);
        setModelPrice(Integer.parseInt(data[2]));
        setModelDetail(data[3]);
    }

    public void setModelNo(int modelNo){
        this.modelNo = modelNo;
    }

    public int getModelNo(){
        return modelNo;
    }

    public void setModelName(String modelName){
        this.modelName = modelName;
    }

    public String getModelName(){
        return modelName;
    }

    public void setModelPrice(int modelPrice){
        this.modelPrice = modelPrice;
    }

    public int getModelPrice(){
        return modelPrice;
    }

    public void setModelDetail(String modelDetail){
        this.modelDetail = modelDetail;
    }

    public String getModelDetail(){
        return modelDetail;
    }

}

class ElectronicsService{
    Electronics electronics[] = new Electronics[5];

    public void save(String [][] data){
        for (int i=0; i<data.length;i++){
            electronics[i] = new Electronics(data[i]);
        }

    }

    public void printAll(){
        System.out.println("****** 전자제품 LIST ***********");
        for (int i=0; i<electronics.length;i++){        
            System.out.println("모델번호 :" + electronics[i].getModelNo() +"모델이름 :" +electronics[i].getModelName() +"가격 :" +electronics[i].getModelDetail() +"설명 :"+electronics[i].getModelNo());
        }
    }

    public void searchBymodelNo(int modelNo){
        boolean answer = false;

        for(int i=0; i<electronics.length;i++){
            if(electronics[i].getModelNo() == modelNo){
                System.out.println("모델번호 :" + electronics[i].getModelNo() +"모델이름 :" +electronics[i].getModelName() +"가격 :" +electronics[i].getModelDetail() +"설명 :"+electronics[i].getModelNo());
                answer = true;
            }
        }

        if(!answer)
            System.out.print("결과 : 모델번호 700에 해당하는 정보가 없습니다.");
    }   
}