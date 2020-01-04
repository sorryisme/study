# 스트림

스트림은 자바 8부터 추가된 컬렉션 저장요소를 하나씩 참조해서  함수적 스타일로 처리 할 수 있도록하는 반복자 



## 반복자 스트림

기존에 List를 처리하기 위해서 Iterator 반복자를 다음처럼 사용

```java
Iterator<String> iterator = list.iterator();

while(iterator.hasNext()){
    System.out.println(iterator.next());
}
```

- 스트림 이후 다음과 같이 바뀜

```java
Stream<String> stream = list.stream();
stream.forEach( name -> System.out.println(name));
```

* forEach는 Consumer 함수적 인터페이스 타입의 매개값을 가진다

  

## 스트림의 특징

- stream과 Iterator의 차이?
  - 람다식 제공, 내부 반복자사용으로 병렬 처리가 쉬움
- 요소 처리 내용을 매개값으로 전달가능



### 내부 반복자를 사용하면 병렬처리가 쉽다

- 외부 반복자는 개발자가 직접 코드로 요소를 반복해서 가져온다

- 내부 반복자는 컬렉션 내부에서 처리해야할 코드만 제공하는 코드패턴

  1)    외부 반복자

  ​ 개발자 코드 -> next -> 컬렉션 -> 처리 -> next ...

  2) 내부 반복자

  ​ 개발자 코드 제공 -> 컬렉션에서 처리

- 람다로 처리 내용만 전달할 뿐 반복은 컬렉션 내부에서 일어남



### 병렬처리

- 한 가지 작업을 서브작업으로 나누고 서브작업들을 분리된 스레드에서 병렬적으로 처리
- 컬렉션의 요소 총합을 구할 때 순차적으로 읽어 합을 구함
- 병렬 처리 스트림은 요소들의 **부분적으로 합하고 전체 합을 계산하는 형태**



### 병렬처리의 중간처리와 최종처리

- 중간 처리 : 매핑, 필터링, 정렬

- 최종 처리 : 반복, 카운팅, 평균, 총합 등 집계처리

  - e.g: 

  ```java
  studentList.stream().mapToInt(Student::getScore).average().getAsDouble();
  ```

  

