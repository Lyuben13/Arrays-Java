import java.util.Scanner;

public class PrintEveryNthElementFromAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the elements of the array (comma-separated): ");
        String input = scanner.nextLine();

        System.out.print("Enter the step (N): ");
        int step = scanner.nextInt();

        String[] array = input.split(",");

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % step == 1) {
                result.append(array[i].trim()).append(" ");
            }
        }

        System.out.println(result.toString().trim());

        scanner.close();
    }
}
