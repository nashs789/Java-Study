# **Java - Stream API**

## 📋 Stream 만드는 방법

```java
default Stream<E> stream() {
    return StreamSupport.stream(spliterator(), false);
}
```

java 의 Collection 인터페이스는 stream 메소드를 구현했기 때문에 Collection 을 구현한 클래스들은 사용할 수 있다.  
흔희들 사용하는 List, HashMap 등이 있다.

```java
List<String> list = Arrays.asList("Apple", "Banana", "Cat", "Dog");

Stream<String> stream = list.stream();
```