package stream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Method {
    public static void main(String[] args) {
        //testRange();
        //testRandom();
        //testIterate();
        //testGenerate();

        Stream<Object> empty = Stream.empty();
    }

    private static void testGenerate() {
        Stream<Integer> integerStream = Stream.generate(() -> 2).limit(5);
        integerStream.forEach(System.out::println);

        Stream<Double> integerStream1 = Stream.generate(Math::random).limit(5);
        integerStream1.forEach(System.out::println);
    }

    private static void testIterate() {
        IntStream intStream1 = IntStream.iterate(0, e -> e + 2)
                                        .limit(10);

        intStream1.forEach(System.out::println);

        IntStream intStream2 = Stream.iterate(0, e -> e + 2)
                .limit(10)
                .mapToInt(Integer::valueOf);

        Stream<Integer> intStream3 = IntStream.iterate(0, e -> e + 2)
                .limit(10)
                .boxed();
    }

    private static void testRandom() {
        IntStream intStream = new Random().ints(10);
        intStream.forEach(System.out::println);

        IntStream intStream2 = new Random().ints();
        intStream2.limit(5).forEach(System.out::println);
    }

    private static void testRange() {
        IntStream intStream = IntStream.range(0, 10);
        IntStream intStream2 = IntStream.rangeClosed(0, 10);

        intStream.forEach(System.out::print);
        System.out.println();
        intStream2.forEach(System.out::print);
    }
}
