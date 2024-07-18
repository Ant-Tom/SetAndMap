import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        printUniqueEvenNumbers(nums);
    }

    public static void printUniqueEvenNumbers(List<Integer> numbers) {
        TreeSet<Integer> evenNumbers = new TreeSet<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        for (Integer number : evenNumbers) {
            System.out.println(number);
        }
    }
}
