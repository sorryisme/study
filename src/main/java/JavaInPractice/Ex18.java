package JavaInPractice;

import java.util.ArrayList;
import java.util.List;

/**
 * 컬렉션 프레임워크는 List, Set, Map 3가지
 * List : 데이터가 차례대로 저장된 컬렉션 중복되어도 상관없음
 * Set : 데이터의 유일성 보장, 저장 순서가 관리되지 않음
 * Map : 키와 값이 쌍으로 저장된 컬렉션
 *
 */

public class Ex18 {
    public static void main(String [] args) {
        /* ArrayList : 크기를 나중에 변경할 수 있는 배열
         * LinkedList : 요소 추가와 삭제를 빠르게 할 수 있는 리스트
         * 메서드 :  
         * boolean add (E e) - 끝에 추가
         * void add (int index, E element) - 지정한 위치에 추가
         * E set(int index, E elemnt) - 지정한 위치의 요소를 바꿈
         * E get(int index) - 지정한 위치의 요소 반환
         * boolean remove(int index) - 지정한 위치의 요소 삭제 
         * void clear() : 모든 요소 삭제
         * boolean isEmpty() : 요소가 없으면 treu 반환
         * int size() : 요소의 개수를 반환
         */
        
        List<String> list = new ArrayList<>();
        list.add("철수");
        list.add("영희");
        list.add("길동");
        
        list.set(1, "지영");
        for(String value : list) {
            System.out.println(value);
        }
    }
}
