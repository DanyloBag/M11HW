package ex1;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class NameFormatter {

    public  String formatNames(List<String> names) {
        HashMap<Integer, String> namesMap = new HashMap<>();

        for (int i = 0; i < names.size(); i++) {
            if (i % 2 != 0) {
                namesMap.put(i,names.get(i));
            }
        }

        return namesMap.entrySet().stream()
                .map(entry -> entry.getKey() + ". " + entry.getValue())
                .collect(Collectors.joining(", "));
    }

}
