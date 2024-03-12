package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Create {
    public static void main(String[] args) {
        Stream<String> collectionStream = getCollectionStream();
        Stream<String> arrayStream = getArrayStream();
        Stream<String> arrayStream2 = getArrayStream();
        Stream<String> streamFromBuilder = getStreamFromBuilder();

        // collectionStream.forEach(System.out::println);
        // arrayStream.forEach(System.out::println);
        // arrayStream2.forEach(System.out::println);
        // streamFromBuilder.forEach(System.out::println);
    }

    private static Stream<String> getStreamFromBuilder() {
        return Stream.<String>builder()
                .add("Apple")
                .add("Banana")
                .add("Cat")
                .add("Dog")
                .build();
    }

    private static Stream<String> getArrayStream() {
        String[] strArr = new String[]{"Apple", "Banana", "Cat", "Dog"};

        return Arrays.stream(strArr);
    }

    private static Stream<String> getArrayStream2() {
        String[] strArr = new String[]{"Apple", "Banana", "Cat", "Dog"};

        return Stream.of(strArr);
    }

    private static Stream<String> getCollectionStream() {
        List<String> list = Arrays.asList("Apple", "Banana", "Cat", "Dog");

        return list.stream();
    }
}
