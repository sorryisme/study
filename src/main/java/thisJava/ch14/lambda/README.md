# 람다식

이것이 자바다 vol.2 람다식 정리



## 개요

- 병렬처리와 이벤트 지향 프로그래밍에 적합한 함수적 프로그래밍이 부각을 받기 시작함
- Java 8부터 람다식을 지원
- 런타임 시 익명 구현 객체 생성



## 기본문법 

- ( 타입 매개변수 ) -> { 실행문 }

  ```   java
  ( int a ) -> { System.out.println(a); }
  ```

- 매개 변수는 런타임 시에 매개변수 클래스를 인식

  ```java
  (a) -> { System.out.println(a); }
  ```

- 매개 변수 하나만 있으면 괄호 / 중괄호 생략 가

  ```
  a -> System.out.println(a);
  ```

- 매개변수가 없다면 빈괄호 사용

  ```
  () -> { 실행문; }
  ```

- return이 있어야 한다면 return 작성

  ```java
  (x , y) -> { return x+y; }
  ```

- 구현은 없고 return 만 있으다면 return 및 중괄호 생략 가능

  ```
  (x , y) -> x + y
  ```



##  타겟 타입 / 함수적 인터페이스

- 람다식은 인터페이스의 익명 구현 객체를 생성

- 람다식이 대입될 인터페이스를 람다식 타겟 타입이라 불림

- @FunctionalInterface 어노테이션은 추상 메소드가 두 개이상 선언되지 않도록 체킹

  ```java
  MyFunctionalInterface fi = (x,y) -> x + y;
  fi.method(5,2);
  ```



### 로컬 변수 사용

-  메소드의 매개 변수 또는 로컬 변수를 내부에서 사용하고 싶다면 final 특성을 가져야 한다



## java.util.function 

빈번히 사용 되는 함수적 인터페이스를 API로 제공 

1) Consumer : 매개값은 있고 리턴 값은 없음

2) Supplier : 매개값은 없고 리턴 값은 있음

3) Function : 매개값도 있고 리턴 값도 있음 (매핑)

4) Operator : 매개값도 있고 리턴 값도 있음 (연산)

5) Predicate : 매개값은 있고 리턴타입은 boolean



### 람다식 활용 예제

---

```java
public static double avg(ToIntFunction<Student> function) {
        int sum = 0;
        for (Student student : list) {
            sum += function.applyAsInt(student);
        }
        double avg = (double) sum / list.size();
        return avg;
    }
    
    public static void main(String[] args) {
        double englishAvg = avg( s -> s.getEnglishScore());
        System.out.println("영어 평균 " + englishAvg);
        
        double mathAvg = avg ( s -> s.getMathScore());
        System.out.println("수학 평균 " + mathAvg);
    }
```

- 함수적 인터페이스를 매개변수로 지정
- 메소드 내부에서 함수 메소드 호출
- main 메소드에서 람다로 전달 -> 매개변수로 전달 -> 메소드 내부에서 실행 순



### andThen과 Compose 메소드

---------------

- Consumer, Function, Operator 종류의 함수 인터페이스는두 개의 함수인터페이스를 순차적으로 연결 가능하도록 디폴트 메소드 제공

- #### andThen

  ```
  인터페이스 AB = 인터페이스A.andThen(인터페이스B);
  최종결과 = 인터페이스.method();
  ```

  - 인터페이스 B는 A로부터 결과를 받아 처리를 한다

- #### Compose 

  ```
  인터페이스 AB = 인터페이스A.compose(인터페이스B);
  최종결과 = 인터페이스AB.mehtod();
  ```

  - 인터페이스 A는 B로부터 결과를 받아 처리를 한다

- 예제 코드

  ````java
  functionA = (m) -> m.getAddress();
          functionB = (a) -> a.getCity();
          functionAB = functionA.andThen(functionB);
          city = functionAB.apply(
        new Member("홍길동", "hong", new Address("한국","서울")));
  ````

### 메소드 참조

-------

- 람다식에서 불필요한 매개 변수를 제거하는 것이 목적

  ```   java
  - 정적 메소드 참조  
  클래스 :: 메소드
      
  - 인스턴스 메소드 참조
  참조변수 :: 메소드
      
  - 생성자 참조
  클래스 :: new
  ```

- 참고 예제

  ```java
  ToIntBiFunction<String, String> function;
  function = (a,b) -> a.compareToIgnoreCase(b);
  
  function = String :: compareToIgnoreCase;
  ```

  







