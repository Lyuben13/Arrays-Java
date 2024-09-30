import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExtractANonDecreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the elements of the array (comma-separated): ");
        String input = scanner.nextLine();

        String[] inputArray = input.split(",");
        List<Integer> result = new ArrayList<>();

        int currentMax = Integer.MIN_VALUE;

        for (String str : inputArray) {
            int num = Integer.parseInt(str.trim());
            if (num >= currentMax) {
                result.add(num);
                currentMax = num;
            }
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i < result.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        scanner.close();
    }
}
