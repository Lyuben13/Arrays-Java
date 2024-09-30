import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the elements of the array (comma-separated): ");
        String input = scanner.nextLine();

        String[] array = input.split(",");

        int sum = 0;

        for (String str : array) {
            int num = Integer.parseInt(str.trim());
            if (num % 2 == 0) {
                sum += num;
            }
        }

        System.out.println(sum);

        scanner.close();
    }
}
