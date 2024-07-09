# **Java - Stream API**

## 📌 Stream 이란?
기존에 존재하던 Collection 인터페이스를 생각해보면(Collection 만 해당하는건 아님) Collection 객체 마다
데이터를 다룰 수 있는 방식이 전부 달랐다.

```java
List -> Collection.sort()
Array -> Arrays.sort()
```

이러한 문제를 위해서 Stream 은 데이터 소스를 추상화 하여 다루도록 하였고, 추가로 가독성을 높이고, 병렬적으로 처리해 성능 향상도
기대할 수 있다.

****

## 📌 특징
- <b>Stream 은 데이터 원본을 변경하지 않는다.</b>
    - read 작업만 한다.
- <b>Iterator 와 같이 일회용으로 사용한다.</b>
    - 한 번 닫히면 다시 사용 불가능하다.
- <b>지연 연산</b>
    - 최종 연산 메소드가 호출되기 전 까지는 최종 연산이 실행되지 않는다.
    ```
    Stream.distinct().sort().collect()
  
    중간 연산자인 distinct, sort 는 최종 연산이 수행 되어야 소모된다.
    ```
- <b>기본형 타입의 스트림을 제공한다.</b>
    ```
    ex) IntStream
    {1, 2, 3} 이라는 데이터가 있다면 Stream<Integer> wrapper 클래스로 boxing 되어야 하기 때문에  
    오토박싱으로 인한 비효율을 줄이기 위해서 IntStream 으로 사용한다.
    
    또한 기본 형타입을 다루기 위한 메소드도 있다. 
    ```

****

## 📌 장점과 단점
### ⚙︎ 장점
- <b>내부 반복으로 소스코드의 가독성을 높인다.</b>
- <b>병렬 처리</b>

****

## 📌 Stream 만드는 방법
### ⚙︎ Collection
```java
default Stream<E> Stream() {
    return StreamSupport.Stream(spliterator(), false);
}
```

java 의 Collection 인터페이스는 Stream 메소드를 구현했기 때문에 Collection 을 구현한 클래스들은 사용할 수 있다.  
흔희들 사용하는 List, HashMap 등이 있다.

```java
List<String> list = Arrays.asList("Apple", "Banana", "Cat", "Dog");

Stream<String> Stream = list.Stream();
```

### ⚙ Array
````java
public static <T> Stream<T> Stream(T[] array) {
    return Stream(array, 0, array.length);
}
````

T 타입의 배열에 대해서 Stream 을 생성해서 반환해주는 함수가 Arrays 에 정의되어 있다.

```java
String[] strArr = new String[]{"Apple", "Banana", "Cat", "Dog"};

Stream<String> Stream = Arrays.Stream(strArr);
```

또한 Stream 인터페이스에서 구현한 of 메소드를 통해서도 스트림 생성이 가능하다.

```java
public static<T> Stream<T> of(T... values) {
    return Arrays.Stream(values);
}
```

인자로 배열을 받아서 Arrays 에 정의되어 있는 Stream 을 사용하기 때문에 이왕이면 Arrays 에 정의되어 있는
static 메소드를 활용하자

### ⚙ Stream builder 패턴
Stream 에서 제공하는 메소드로 빌더 패턴을 이용해서 만들 수 있다.

```java
Stream<String> Stream = Stream.<String>builder()
                              .add("Apple")
                              .add("Banana")
                              .add("Cat")
                              .add("Dog")
                              .build();
```

****

## 📌 메소드 활용
### ⚙︎ range() & rangeClosed()
- range: start 부터 end 전 까지 연속된 정수를 스트림으로 생성
- rangeClosed: start 부터 end 까지 연속된 정수를 스트림으로 생성
````java
IntStream intStream = IntStream.range(0, 10);
IntStream intStream2 = IntStream.rangeClosed(0, 10);

intStream.forEach(System.out::print);
System.out.println();
intStream2.forEach(System.out::print);
````
```
[ Console Result ] 
range -> 0123456789
rangeClosed -> 012345678910
```

****

### ⚙︎ Random 값 생성하기
Random 클래스를 이용한 랜덤 값으로 만들어진 스트림

```java
new Random().ints(10);
            .forEach(System.out::println);
```

결과를 보면 유추할 수 있을 수 있지만 타입에 따라서 최대 표한 가능한 범위 만큼의 랜덤 값이 생성된다.
> ex) Integer.MIN_VALUE < int() < Integer.MAX_VALUE 

```
[ Console Result ] 
-180406979
1410508241
191464062
-703691325
1133679181
-303388979
1869194554
-1493443135
2024530124
1637150022
```

다른 방법으로는

```java
new Random().ints();
            .limit(5)
            .forEach(System.out::println);
```

위 방법이든 아래 방법이든 범위는 지정해줘야 한다.

```
[ Console Result ] 
1854683030
145633655
-1232669176
1794913569
1128443685
```

****

### ⚙︎ iterate()
위에서 무한 스트림(Infinite Stream) 을 랜덤으로 생성하는 방법을 알아 봤는데 그와 다르게 범위를
람다식을 조건으로 넣어서 계산된 결과를 얻을 수 있는 방법도 있다.

마찬가지로 범위를 지정해줘야 무한 루프에 빠지지 않는다.

```java
IntStream.iterate(0, e -> e + 2)
         .limit(10);
         .forEach(System.out::println);
```

시드(Seed) 값 0 (첫 번째 파라미터) 부터 2씩 증감하는 람다식을 넣고 만든 스트림의 출력 값은 이렇다.

```
[ Console Result ] 
0
2
4
6
8
10
12
14
16
18
```

결과를 살펴보면 이전의 결과 값이 다음 연산의 Seed 가 되어 진행된다.  

iterate() 는 Stream 에서도 구현되어 있기 때문에 위의 예제를 IntStream 이 아니라 Stream 으로 만든다면
예외가 발생할 것이다.

```
cannot be converted to java.util.Stream.IntStream
```

Wrapper 클래스와 원시 타입을 구분 하거나 스트림의 다른 메소드를 통해서 형변환 하여 해결할 수 있다.

```java
Stream.iterate(0, e -> e + 2)
      .limit(10)
      .mapToInt(Integer::valueOf);
```

반대로 원시형 타입인 경우에는 Boxing 을 해주는 boxed() 메소드를 통해서 해결할 수 있다.

```java
IntStream.iterate(0, e -> e + 2)
         .limit(10)
         .boxed();
```

마지막으로 주의할 점은 람다식으로 받는 파라미터는 함수형 인터페이스를 인자로 받기 때문에 람다식 혹은 함수형 인터페이스
구현해서 넘겨줘야 한다.

****

### ⚙ generate()
generate 메소드도 iterate() 와 같이 함수형 인터페이스를 인자로 받으며, Seed 값을 계속해서 연산에 사용하는게
아닌 새로운 값을 생성한다.

```java
Stream.generate(() -> 2)
      .limit(5);
      .forEach(System.out::println);
```

Seed 같은 인자는 보이지 않고, 결과를 보게되면 같은 값만 보인다.

```
[ Console Result ] 
2
2
2
2
2
```

다른 예시

```java
Stream.generate(Math::random)
      .limit(5);
      .forEach(System.out::println);
```

기본적으로 random() 메소드의 반환 값은 double 이다.

```
[ Console Result ] 
0.9739549527150505
0.9127245704871921
0.6857475040249579
0.5376478895726601
0.3142060405874961
```

**** 

### ⚙ empty()
빈 스트림을 생성한다.

```java
Stream<Object> empty = Stream.empty();

System.out.println(empty.count());
```

빈 스트림을 생성하며, 스트림 내의 요소 개수는 0개이다.

```
[ Console Result ] 
0
```

### ⚙︎ skip()
말 그대로 명시한 요소만큼 시작부터 건너 뛰는 메소드

```java
IntStream intStream = IntStream.range(1, 10)
                               .skip(5);

intStream.forEach(System.out::println);
```

1 ~ 9 까지의 정수를 생성 했지만 앞에서 5개의 요소를 생략한 결과

```
[ Console Result ] 
6
7
8
9
```


****

### ⚙︎ limit()
스트림의 요소를 제한하는 메소드

```java
IntStream intStream = IntStream.range(1, 10)
                               .limit(5);

intStream.forEach(System.out::println);
```

1 ~ 9 까지의 정수를 생성 했지만 앞에서부터 5개의 요소만 출력

```
[ Console Result ] 
1
2
3
4
5
```

****

### ⚙︎ filter()
주어진 조건에 참인 요소들만 남기는 메소드

```java
// IntStream 이기 때문에 IntPredicate 를 인자로 받는다.
IntStream filter(IntPredicate predicate);
```

조건식으로 인자로 받아서 스트림에 적용하는 방법으로 연산 결과가 boolean 타입을 만족하는 람다식으로 인자로
넣어도 무방하다.

````java
IntStream intStream = IntStream.range(1, 10)
                               .filter(e -> e % 2 == 0);

intStream.forEach(System.out::println);
````

람다식을 살펴보면 짝수만 출력하도록 조건을 만들었다.

```
[ Console Result ] 
2
4
6
8
```

****

### ⚙︎ distinct()
메소드명과 같이 중복된 요소를 걸러주는 기능을 제공한다.

```java
IntStream.of(1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 5, 6)
         .distinct()
         .forEach(System.out::println);
```

중복된 정수를 제외한 결과를 출력한다.

```
[ Console Result ] 
1
2
3
4
5
6
```

****

### ⚙