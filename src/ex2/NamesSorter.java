package ex2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NamesSorter {

    public String sortNames(List<String> names){
        return names.stream()
                .map(String::toUpperCase)
                .sorted((s1,s2) -> s2.compareTo(s1))
                .collect(Collectors.toList()).toString();
    }
}
