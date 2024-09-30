import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcessOddNumbers{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the elements of the array (comma-separated): ");
        String input = scanner.nextLine();

        String[] inputArray = input.split(",");
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i < inputArray.length; i += 2) {
            int number = Integer.parseInt(inputArray[i].trim());
            result.add(number * 2);
        }

        for (int i = result.size() - 1; i >= 0; i--) {
            System.out.print(result.get(i));
            if (i > 0) {
                System.out.print(" ");
            }
        }
        System.out.println();

        scanner.close();
    }
}