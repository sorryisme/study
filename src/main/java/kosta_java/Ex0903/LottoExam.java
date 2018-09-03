package kosta_java.Ex0903;


/**
    작성자:김지성
    작성일자:180903
    작성주제:로또
*/

/*
    
    문제 : 로또번호 6개를 배열방에서 중복되지 않게 만들어서 출력하기
            (1~ 45까지)  출력을 할때 내림차순으로 출력하게 한다.
   
*/

class LottoExam{
    int[] num = new int [6];

    //1)중복체크하는 메소드
    Boolean checkNum(int number){
        for (int i = 0; i < num.length ;i++){
            if(num[i] == number){
                System.out.print("중복되어 다시 추첨합니다. 새로뽑은숫자:" + num[i] + "기존숫자:" + number + "\n");
                return false;           
            }
        }
        return true;
    }

    //2)숫자 6개를 배열방에 저장하는 메소드, 중복여부 확인 후 배열에 삽입
    void making(){
        int tmp = 0;
        int i = 0;  
        while(num[5] == 0){
            tmp = (int)(Math.random() * 45) + 1;
            if(checkNum(tmp) == true){
                num[i] = tmp;
                i++;
            }
        }
        
        
        
    }

    //3)배열방의 값을 내림차순으로 정렬하는 메소드, , 버블소트 내림차순
    void descArr(){
        int tmp = 0;
        for(int i=0; i<num.length; i++){
            for (int j=0; j<num.length-1; j++){
                if(num[j] < num[j+1]){
                    tmp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = tmp;
                }//if문
            }//inner for문 
        }   
    }

    //4)배열의 값을 화면에 출력하는 메소드 
    void printLotto(){
        for (int print : num){
            System.out.println(print);
        }
    }


    public static void main(String[] args) {

        LottoExam lotto = new LottoExam();
        System.out.println("-----------초기화값 확인------------");
        lotto.printLotto();
        System.out.println("-----------로또추첨시작--------------");
        lotto.making(); 
        lotto.printLotto();
        System.out.println("-----------내림차순-----------------");
        lotto.descArr();
        lotto.printLotto();
    }
}
