import java.util.Scanner;

public class FirstAndLastKNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the elements of the array (comma-separated): ");
        String input = scanner.nextLine();

        String[] inputArray = input.split(",");
        int n = inputArray.length;

        for (int i = 0; i < k; i++) {
            System.out.print(inputArray[i].trim());
            if (i < k - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        for (int i = n - k; i < n; i++) {
            System.out.print(inputArray[i].trim());
            if (i < n - 1) {
                System.out.print(' ');
            }
        }
        System.out.println();

        scanner.close();
    }
}