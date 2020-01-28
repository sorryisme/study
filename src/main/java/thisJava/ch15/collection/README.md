# 콜렉션 프레임워크

널리 알려져있는 자료구조를 바탕으로 객체를 효율적으로 사용할 수 있도록 모아둔 것이 컬렉션 프레임워크



## List

- 순서를 유지하고 저장
- 중복저장 가능

### ArrayList

- 배열은 생성할 때 크기가 고정되고 크기를 변경할 수 없음

- 저장 용량을 초과한 객체가 들어오면 자동으로 저장용량이 늘어난다.

- 고정된 객체들로 구성된 List를 생성할 때 Arrays.asList( T... a) 메소드를 사용한다

  ```
  List<T> list = Arrays.asList(T... a)
  ```



### Vector

- ArrayList와 다른점은 Vector는 동기화 된 메소드로 구성되어 있다.(Thread Safe)

### LinkedList

- LinkedList는 인접 참조를 링크로 하여 체인처럼 관리

- 빈번한 객체 삽입이 있을 때 ArrayList보다 LinkedLList가 좋은 성능을 발휘한다.

- ArrayList , LinkedList 비교

  | 구분       | 순차적 추가/삭제 | 중간에 추가/삭제 | 검색   |
  | ---------- | ---------------- | ---------------- | ------ |
  | ArrayList  | 빠르다           | 느리다           | 빠르다 |
  | LinkedList | 느리다           | 빠르다           | 느리다 |



## Set

- Set은 저장 순서가 유지되지 않는다. 객체를 중복해서 저장할 수 없고 하나의 null만 저장할 수 있다.
- 저장할 때 순서와 나올 때 순서가 다를 수 있다.

### HashSet

- 순서 없이 저장하고 중복저장하지 않는다.

- 객체 저장 전에 HashCode 메소드를 호출 => 이미 해시코드가 있다면 eqaul로 객체비교

- 동일한 해시코드가 있다면 중복저장 하지 않는다

  

## Map

- 키와 값으로 구성된 Entry 객체를 저장하는 구조

- 키는 중복 저장할 수 없지만 값은 중복저장될 수 있다.(기존 값 대체)

- 저장된 객체 대상으로 하나씩 얻고 싶다면?

  - KeySet로 모든 키를 Set 컬렉션으로 얻은 후 get으로 가져오기

  - entrySet 메소드로 Set 컬렉션을 얻은 후 반복자로 getKey와 getValue로 키와 값을 얻기

    ```
    Set<Map.Entry<K,V> entrySet = map.entrySet();
    Iterator<Map.Entry<K,V>> entryIterator = entrySet.iterator();
    
    while(entryIterator.hasNext()){
        Map.Entry<K, V> entry = entryIterator.next();
        K key = entry.getKey();
        V value = entry.geValue();
    }
    ```

### HashMap

- 동일한 키가 될 조건은 hashCode의 리턴값이 같아야하고 eqauls 메소드가 true 리턴해야한다.
- 기본 타입은 사용할 수 없음

### HashTable

- HashMap과 차이는 synchorinized 여부이다.

### Properties

- Hashtable의 하위 클래스 이기 때문에 Hashtable의 특징을 그대로 가지고 있다.

- key와 value가 String 타입으로 제한된 컬렉션

- 저장된 프로퍼티 파일을 읽을 때 주로 사용

  ```java
  Properties properties = new Properties();
  properties.load(new FileReader("C:/~/database.properties"));
  ```



------------------



# 검색기능을 강화시킨 컬렉션

검색 기능을 강화시키는 TreeSet과 TreeMap을 제공하며 이진 트리(binary tree)를 이용해 계층적 구조를 가지며 객체를 저장한다



## 이진 트리 구조

- 여러개 노드가 트리 형태로 연결된 구조
- 루트에서 시작하여 최대 2개 노드를 연결할 수 있는 구조
- 이진트리는 부모 노드의 값보다 작은 노드는 왼쪽에 위치, 부모 노드보다 큰 값은 오른쪽에 위치 시킴
- 이로 인해 **범위 검색이 쉬움**

### TreeSet

- 이진 트리 기반 set 컬렉션

- left | value | right 로 구성되어 좌 우 자식 노드를 참조한다

- 만약 내림차순으로 정렬하고 싶다면 desndingIterator 또는 descendingSet() 메소드를 호출하자

- 범위 검색 

  | 리턴타입        | 메소드  | 설명                                                         |
  | --------------- | ------- | ------------------------------------------------------------ |
  | NavigableSet<E> | headSet | 주어진 객체보다 낮은 객체 리턴                               |
  | NavigableSet<E> | tailSet | 주어진 객체보다 높은 객체 리턴                               |
  | NavigableSet<E> | subSet  | 시작과 끝으로 주어진 객체 사이 객체 리턴, 객체포함 boolean 인자 |



### TreeMap

- 이진트리 기반 Map 컬렉션
- TreeSet과 달리 키와 값이 저장된 Map.Entry를 저장
- left | < key , value> | right 형태로 저장
- Map 대신 TreeMap을 사용하는 이유는 특정 객체를 찾거나 **범위 검색과 관련된 메소드를 찾는데 용이하다**
- 내림차순 및 범위검색은 TreeSet과 동일하므로 생략





