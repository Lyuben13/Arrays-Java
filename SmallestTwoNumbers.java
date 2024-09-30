import java.util.Scanner;
import java.util.Arrays;


public class SmallestTwoNumbers  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the elements of the array (comma-separated): ");
        String input = scanner.nextLine();

        String[] inputArray = input.split(",");
        int[] numbers = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            numbers[i] = Integer.parseInt(inputArray[i].trim());
        }

        Arrays.sort(numbers);

        System.out.println(numbers[0] + " " + numbers[1]);

        scanner.close();
    }
}