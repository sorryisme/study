package kosta_java.Ex0903;
/**
버블정렬 : 서로 이웃한 데이터끼리 비교하여 큰 값을 뒤로 보내는 방식
선택정렬 : 데이터 중 가장 작은 데이터를 맨 앞으로 보낸 뒤 첫번째를 제외하고 두번째부터 반복
삽입정렬 : 임의의 데이터를 이미 정렬된 부분에 삽입하는 방식
int arr [] = {5,7,1,2,4,3,8,9,6,10}  
배열방에 있는  데이터를 올림차순으로 정렬하여 출력한다.(버블정렬, 선택정렬,삽입정렬)
*/

class DataArray {

    void printArray(int[] arr){
        for(int i : arr)
            System.out.println(i);
    }

    void bubbleSort(){
        int[] arr = {5,7,1,2,4,3,8,9,6,10};
        int tmp = 0;
        
        for(int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length-1; j++){
                
                if(arr[j] > arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }//if문

            }//inner for문 
        }   
        printArray(arr);    
    }


    void selectSort(){
        
        int[] arr = {5,7,1,2,4,3,8,9,6,10};
        int tmp = 0;
        int cursor = 0;
        for(int i=0; i<arr.length-1; i++){
            int min = arr[i];

            for(int j=i+1; j<arr.length; j++){
                if(min > arr[j]){
                    min = arr[j];
                    cursor = j;                 
                }
                //System.out.println("현재 최소값은" + min + "," + "현재 arr[j]는" +  arr[j] + "," + "현재 커서는" + cursor); 

            }

            tmp = arr[i];
            arr[i] = min;
            arr[cursor] = tmp;  
            
        }
            
        printArray(arr);    
    }

/*
    void insertSort(){
        int[] arr = {5,7,1,2,4,3,8,9,6,10};
    
        printArray(arr);

    }
*/
    public static void main(String[] args) {

        DataArray data = new DataArray();
        data.bubbleSort();
        data.selectSort();
    }
}
