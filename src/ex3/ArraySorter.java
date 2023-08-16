package ex3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraySorter {

    public String sortArray(String[] arr) {
        return Arrays.stream(arr)
                .flatMap(array -> Arrays.stream(array.split(", ")))
                .map(Integer::valueOf)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}
