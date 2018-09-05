package kosta_java.ex0904_answer;

class TwoDmArray{

    String[][] arr = new String[10][];//열을 별도로 생성..

    public void make2DmArray(){
        for(int i=0; i<arr.length; i++){//10행
            arr[i] = new String[i+1];
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = (i+1) +"동" + (j+1)+"호";
                //System.out.print(arr[i][j] + "\t");
            }
            //System.out.println();
        }
    }

        
    public void print2DmArray(){
        String space="";

        for(int j=0; j<arr.length; j++){//10행 j = 0, 1, 2
            System.out.print(space);
            for(int i=j ; i<arr.length; i++){
                System.out.print(arr[i][j] + "\t"); //00 10  20 30  -> 11 21 31 -> 22 32 42
            }
            space+="\t\t";
            System.out.println();
        }

    }
}

public class TwoDmArrayExam{
    public static void main(String[] args){

        TwoDmArray tda = new TwoDmArray();
        tda.make2DmArray();
        tda.print2DmArray();

    }
}
