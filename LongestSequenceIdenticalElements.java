import java.util.Scanner;
import java.util.Arrays;

public class LongestSequenceIdenticalElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array of integers: ");
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int longestElement = numbers[0];
        int longestLength = 1;

        int currentElement = numbers[0];
        int currentLength = 1;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == currentElement) {
                currentLength++;
            } else {
                currentElement = numbers[i];
                currentLength = 1;
            }

            if (currentLength >= longestLength) {
                longestLength = currentLength;
                longestElement = currentElement;
            }
        }

        for (int i = 0; i < longestLength; i++) {
            System.out.print(longestElement + " ");
        }

        scanner.close();
    }
}
