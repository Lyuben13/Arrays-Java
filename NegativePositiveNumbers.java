import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NegativePositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the elements of the array (comma-separated): ");
        String input = scanner.nextLine();

        String[] inputArray = input.split(",");
        List<Integer> negativeNumbers = new ArrayList<>();
        List<Integer> positiveNumbers = new ArrayList<>();

        for (String str : inputArray) {
            int num = Integer.parseInt(str.trim());
            if (num < 0) {
                negativeNumbers.add(num);
            } else {
                positiveNumbers.add(num);
            }
        }

        List<Integer> result = new ArrayList<>();
        result.addAll(negativeNumbers);
        result.addAll(positiveNumbers);

        for (int num : result) {
            System.out.println(num);
        }

        scanner.close();
    }
}
