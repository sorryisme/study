# 제네릭

이것이 자바다 내용 정리

## 제네릭의 사용 이유

1) 컴파일 시 강한 타입 체크

2) 타입 변환을 제거

```java
List list = new ArrayList();
list.add("hello");
String str = (String) list.get(0);
```

위 방식 대신 다음과 같이 사용 가능

```javascript
List<String list = new ArrayList<>();
list.add("hello");
String str = list.get(0);
```



## 제네릭 타입

타입을 파라미터로 가지는 클래스와 인터페이스

```
public class 클래스명<T>{ ... }
public interface 인터페이스<T> { ... }
```

제네릭 타입 파라미터를 사용하는 이유는 다음과 같다

> AS-IS

```java
public class Box{
    private Obejct object;
    private void set(Object object) { this.object = object; }
    private Object get() { return object; }
}
```

> TO-BE

```java
public class Box<T>{
    private T t;
    public T get(){ return t;}
    public void set(T t) { this.t = t; }
}
```

```java
Box<String> box = new Box<String>();
box.set("hello");
String str = box.get();
```



## 멀티 타입 파라미터 , class<K,V> , interface<K,V>

제네릭 타입은 두 개 이상 멀티 타입 파라미터를 사용할 수 있다.

```java
public class Product<T, M> {
    private T kind;
    private M model;
    
    public T getKind  { return this.kind; }
    public M getModel { return this.model; }
    
    public void setKind(T kind){ this,kind = kind;}
    public void setModel(M model) { this.model = model; }
}
```



## 제네릭 메소드 [<T,R> R Method( T t ) ]

매개 타입과 리턴 타입으로 파라미터를 갖는 메소드를 호칭

- public <타입 파라미터...> 리턴타입 메소드명 ( 매개변수 ...) {   ....  }

- public <T> Box<T> boxing(T t) { ... } 

  - 매개변수 타입 및 리턴 타입으로는 Box<T>를 사용

  ** 클래스의 제네릭은 타입체크, 변환에 용이하다는 것을 잊지말자 : 클래스 내부에서도 사용가능



- 지네릭 메소드 호출 방식

```java
리턴타입 변수 = <구체적 타입> 메소드명 (매개값);
Box<Integer> box = <Integer>boxing(100);

리턴타입 변수 = 메소드명(매개값);
Box<Integer> box = boxing(100);
```



## 제한된 타입 파라미터 [<T extends 최상위 타입>]

- 구체적인 타입을 제한할 필요

  예: Number 타입 또는 하위 타입 인스턴스만 가져야할 때 

- 타입 파라미터 뒤에 extends 키워드를 붙이고 상위 타입 파라미터를 명시

  ```java
  public <T extends 상위타입> 리턴타입 메소드(매개변수...){ ... }
  ```

  

- 메소드 중괄호 타입 파라미터 변수로 사용한 것은 상위 타입의 멤버(필드, 메소드)로 제한

  ```java
  public <T extends Number> int compare(T t1, T t2){
    double v1 = t1.doubleValue();
    double v2 = t2.doubleValue();
    return Double.compare(v1, v2);
  }
  ```



## 와일드 카드 타입 [ <?> , <? extends ...>, <? super..>]

- <?> : 제한 없음 
- <? extends 상위타입> : 상위클래스 제한
- <? super 하위타입 > 하위 클래스 제한