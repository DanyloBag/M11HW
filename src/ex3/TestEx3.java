package ex3;

public class TestEx3 {
    public static void main(String[] args) {
        ArraySorter sorter = new ArraySorter();

        String[] numbers = new String[]{"1, 2, 0", "4, 5"};

        System.out.println("sorter.sortArray(numbers) = " + sorter.sortArray(numbers));
    }

}
