package ex1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NameFormatter {

    public  String formatNames(List<String> names) {
        return IntStream.range(0,names.size())
                .filter(index -> index %2 ==0)
                .mapToObj(index -> (index + 1) + ". " + names.get(index))
                .collect(Collectors.joining(", "));
    }

}
