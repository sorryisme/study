package kosta_java.ex0905;


class ElectronicsController {
    static ElectronicsService service = ElectronicsService.getService();

    /**
        1. 전체검색
     */ 
    public static void selectAll(){
        //service 호출 -> 결과 받아서 -> EndView 호출
        Electronics[] elecArr = service.selectAll();
        EndView.printAll(elecArr);

    }

    /**
        2. 조건검색
     */

    public static void searchByModelNo(int modelNo){
        Electronics elec = service.searchByModelNo(modelNo);

        if(elec == null) EndView.printMessage(modelNo+"는 없는 정보입니다.");
        else EndView.printSearch(elec);
    }

    /**
        3. 수정하기
     */
    public static void update(Electronics elec){
        if(service.update(elec) == false) 
            EndView.printMessage(elec.getModelNo()+"는 없는 정보입니다.");
        else EndView.printMessage(elec.getModelNo()+"의 정보를 수정 완료 하였습니다.");
    }



    /**
    4. 등록하기
     */
    public static void insert(Electronics elec){
        if(service.insert(elec) == false){
            EndView.printMessage(elec.getModelNo()+"는 중복됩니다.");
        } else 
            System.out.println("완료는되었습니다");
        EndView.printMessage(elec.getModelNo()+"삽입 완료.");

    }


}
