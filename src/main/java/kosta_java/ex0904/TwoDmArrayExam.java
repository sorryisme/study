package kosta_java.ex0904;

class TwoDmArray{
    String[][] twoDmArray = new String[10][10];

    void make2DmArray(){

        //계단식
        for (int i = 0; i < twoDmArray.length; i++){
            for(int j = 0; j <= i; j++){
                twoDmArray[i][j] = (i+1)+"동"+(j+1)+"호";
            }

        }

        /*
        역계단식(jpg)
        for (int i = 0; i < twoDmArray.length; i++){
            for(int j = 9; j >= i; j--){
                twoDmArray[i][j] = (j+1)+"동"+(i+1)+"호";
            }
        } 
         */
    }

    void print2DmArray(){
        for (int i = 0; i < twoDmArray.length; i++){
            for(int j = 0; j <twoDmArray.length; j++){
                if(twoDmArray[i][j] == null)
                    System.out.print("\t");
                else
                    System.out.print(twoDmArray[i][j]+" ");
            }
            System.out.println();
        }

    }




}

public class TwoDmArrayExam{

    public static void main(String [] args){
        TwoDmArray twoDmArray = new TwoDmArray();
        twoDmArray.make2DmArray();
        twoDmArray.print2DmArray();

    }
}
