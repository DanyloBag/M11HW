package ex2;

import java.util.List;


public class TestEx2 {
    public static void main(String[] args) {
        List<String> strings = List.of("Ivan", "Liza", "Petro", "Lena", "Igor", "Katya", "Slava", "Irina", "Mykola", "Sveta");
        NamesSorter sort = new NamesSorter();
        System.out.println("sort.sortNames(strings) = " + sort.sortNames(strings));

    }
}
