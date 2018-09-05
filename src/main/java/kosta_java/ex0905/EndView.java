package kosta_java.ex0905;

class EndView {
    /**
        전체 전자제품 출력하기
     */ 
    public static void printAll(Electronics [] elecArr){
        System.out.println("------------전자제품 List-------------");
        for(int i = 0; i < ElectronicsService.count; i++){
            System.out.print(elecArr[i].getModelNo() + " | ");
            System.out.print(elecArr[i].getModelName() + " | ");
            System.out.print(elecArr[i].getModelPrice() + " | ");
            System.out.print(elecArr[i].getModelDetail());
            System.out.println();

        }
    }
    /**
        모델번호에 해당하는 제품 출력하기
     */

    public static void printSearch(Electronics elec){
        System.out.println("--------------"+elec.getModelNo()+"의 검색결과----------");
        System.out.print(elec.getModelNo() + " | ");
        System.out.print(elec.getModelName() + " | ");
        System.out.print(elec.getModelPrice() + " | ");
        System.out.print(elec.getModelDetail() + " | ");
    }

    /**
        수정 or 등록의 결과메세지를 출력하기
     */
    public static void printMessage(String message){
        System.out.println(message);
    }
}
