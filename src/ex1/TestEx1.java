package ex1;

import java.util.List;



public class TestEx1 {

    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Liza", "Petro", "Lena", "Igor", "Katya", "Slava", "Irina", "Mykola", "Sveta");
        NameFormatter nameFormatter = new NameFormatter();
        System.out.println("nameFormatter.formatNames() = " + nameFormatter.formatNames(names));
    }
}
