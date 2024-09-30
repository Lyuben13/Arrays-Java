import java.util.Scanner;

public class ReverseAnArrayOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter the elements of the array (comma-separated): ");
        String[] inputArray = scanner.nextLine().split(",");

        int[] newArray = new int[n];
        for (int i = 0; i < n; i++) {
            newArray[i] = Integer.parseInt(inputArray[i].trim());
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(newArray[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }

}
