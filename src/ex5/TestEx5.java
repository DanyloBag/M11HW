package ex5;

import java.util.stream.Stream;

public class TestEx5 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3,9,8);
        Stream<Integer> stream2 = Stream.of(4, 5, 6,7);

        Stream<Integer> zippedStream = Zipper.zip(stream1, stream2);
        zippedStream.forEach(System.out::println);
    }
}
