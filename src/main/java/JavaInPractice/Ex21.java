package JavaInPractice;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * HashMap 주요 메서드
 * 
 * boolean put(K key, V value) : 키와 값을 쌍을 ㅗ저장
 * boolean remove(Object key) : 값 삭제
 * void clear()
 * boolean isEmpty()
 * Set<K>keySet() :맵에 포함된 키 목록을 Set으로 가져온다
 * int size() : 요소의 개수를 반환한다
 * boolean containsKey(Object key) : 지정한 키가 포함되어 있으면 true
 * boolean containsValue(Object value) : 지정한 값이 포함되어 있으면 false
 * 
 */
public class Ex21 {
    public static void main(String[] args) {
        
        Map<String, String> map = new HashMap<>();
        map.put("빨강", "사과");
        map.put("보라", "포도");
        map.put("노랑", "귤");
        for(String key : map.keySet()) {
            // 맵에 포함된 모든 키 목록을 저장한다
            
            String value = map.get(key);
            //ket값을 기준으로 map에 있는 모든 값을 가져온다
            
            System.out.println(value);
        }
        
        
        
        
        
        
        
        
        
        
    }
}
