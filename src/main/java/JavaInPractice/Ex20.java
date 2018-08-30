package JavaInPractice;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet : 일반적인 Set 구현
 * LinkedHashSet : 추가한 순서를 유지하는 Set 구현
 * 
 * arrayList와 동일
 * boolean contains(Object o) : 지정한 요소가 포함된 경우 true
 */

public class Ex20 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        
        set.add("개");
        set.add("고양이");
        set.add("토끼");
        
        for(String animal : set) {
            System.out.println(animal);
        }
    }
}
