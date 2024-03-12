package stream.create;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Create {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cat", "Dog");

        Stream<String> stream = list.stream();

        stream.forEach(System.out::println);
    }
}
