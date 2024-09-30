import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the elements of the array (comma-separated): ");
        String input = scanner.nextLine();

        String[] array = input.split(",");

        int evenSum = 0;
        int oddSum = 0;

        for (String str : array) {
            int num = Integer.parseInt(str.trim());

            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        int difference = evenSum - oddSum;

        System.out.println(difference);

        scanner.close();
    }
}
