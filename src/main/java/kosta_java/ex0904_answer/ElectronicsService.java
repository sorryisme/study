package kosta_java.ex0904_answer;

class ElectronicsService{
    Electronics electronics [] = new Electronics[5];

    /**
      초기치 데이터 저장하는 메소드 
     */
    public void save(String [][] data){ //2차원배열 주소
        //{"100" , "에어컨" , "250000", "삼성 무풍에어컨"} 
        /* electronics[0] = new Electronics(); //기본생성자호출
       electronics[0].setModelNo(Integer.parseInt(data[0][0]));
       electronics[0].setModelName(data[0][1]);
       electronics[0].setModelPrice(Integer.parseInt(data[0][2]));
       electronics[0].setModelDetail(data[0][3]);*/

        /* electronics[0] =  new Electronics(Integer.parseInt(data[0][0]), data[0][1], 
                                         Integer.parseInt(data[0][2]), data[0][3] );

       electronics[1] =  new Electronics(Integer.parseInt(data[0][0]), data[0][1], 
                                         Integer.parseInt(data[0][2]), data[0][3] );

       electronics[2] =  new Electronics(Integer.parseInt(data[0][0]), data[0][1], 
                                         Integer.parseInt(data[0][2]), data[0][3] );

       electronics[3] =  new Electronics(Integer.parseInt(data[0][0]), data[0][1], 
                                         Integer.parseInt(data[0][2]), data[0][3] );

       electronics[4] =  new Electronics(Integer.parseInt(data[0][0]), data[0][1], 
                                         Integer.parseInt(data[0][2]), data[0][3] );*/

        for(int i=0; i<electronics.length ; i++ ){
            electronics[i] =  new Electronics(Integer.parseInt(data[i][0]), data[i][1], 
                    Integer.parseInt(data[i][2]), data[i][3] );
        }
    }

    /**
       전자제품 모두 출력
         모델번호 : 100  모델이름 :     가격 :    설명 : 
     */
    public void printAll(){
        System.out.println("****** 전자 제품 LIST *********");
        for(Electronics elec : electronics){
            System.out.print("모델번호 : " + elec.getModelNo() +"\t");
            System.out.print("모델이름 : " + elec.getModelName() +"\t");
            System.out.print("가격 : " + elec.getModelPrice() +"\t");
            System.out.print("설명 : " + elec.getModelDetail() +"\n");
        }
    }

    /**
      모델번호에 해당하는 전자제품 검색
     */
    public void searchBymodelNo(int modelNo){
        System.out.println("---------검색 결과 ------------");
        for(Electronics elec  : electronics){
            if(elec.getModelNo() == modelNo){
                System.out.print("모델번호 : " + elec.getModelNo() +"\t");
                System.out.print("모델이름 : " + elec.getModelName() +"\t");
                System.out.print("가격 : " + elec.getModelPrice() +"\t");
                System.out.print("설명 : " + elec.getModelDetail() +"\n");

                return ; //함수를 빠져나가라.
                //reak ; //반복문을 빠져나가라.
            }
        }

        System.out.println("모델번호 " + modelNo+"에 해당하는 정보가 없습니다");
    }

}