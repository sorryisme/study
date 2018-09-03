package kosta_java;

public class Ex13 {
    //각int,double,char,boolean ,String type별로 총 5개씩 저장하는  배열을 생성하세요
    int[] intArr = new int[5];
    double[] doubleArr = new double[5];
    char[] charArr = new char[5];
    boolean[] boolArr = new boolean[5];
    String[] strArr = new String[5];

    //메소드 : printArrayValue01   
    //위의 배열들에 자동으로 초기화 된값을 출력하세요

    void printArrayValue01(){

        int index = 0;
        for(int a : intArr){
            System.out.print("int["+ (index++) +"]초기값 :"+ a +" \t");
        }
        System.out.println();   

        index=0;
        for(double a : doubleArr){
            System.out.print("dobule["+ (index++) + "]초기값 :"+ a +" \t");
        }
        System.out.println();

        index=0;
        for(char a : charArr){
            System.out.print("char["+ (index++) + "]초기값 :"+ a +" \t");
        }
        System.out.println();

        index=0;
        for(boolean a : boolArr){
            System.out.print("boolean["+ (index++) + "]초기값 :"+ a +" \t");
        }
        System.out.println();

        index=0;
        for(String a : strArr){
            System.out.print("String["+ (index++) + "]초기값 :"+ a +" \t");
        }
        System.out.println();

    }

    //메소드 : printArrayValue02   
    //위의 5개의 배열에서 각각 적당한 값으로 data를 할당하세요.
    void printArrayValue02(){
        for (int i=0; i<5; i++){
            intArr[i] = i;
            doubleArr[i] = (double)i;
            charArr[i] = (char)(65+i);
            boolArr[i] = true;
            strArr[i] = String.valueOf(i);
        }   
    }


    //메소드 : printArrayValue03   
    //새롭게 할당된값을 출력하세요

    void printArrayValue03(){
        printArrayValue01();
    }


    //메인메소드에서
    //ArrayExam의 메소드들을 순서대로 호출하세요.
    public static void main(String [] args){

        Ex13 arr = new Ex13();

        System.out.println("-------------------------------변경전------------------------------------");
        arr.printArrayValue01();

        arr.printArrayValue02();
        System.out.println("-------------------------------변경후------------------------------------");
        arr.printArrayValue03();

    }
}
