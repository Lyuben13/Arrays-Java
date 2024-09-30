import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the elements of the array (comma-separated): ");
        String input = scanner.nextLine();

        System.out.print("Enter the number of rotations: ");
        int rotations = scanner.nextInt();

        String[] array = input.split(",");

        int n = array.length;

        if (n == 0) {
            System.out.println("Empty");
            return;
        }

        rotations = rotations % n;

        String[] rotatedArray = new String[n];

        for (int i = 0; i < n; i++) {
            rotatedArray[(i + rotations) % n] = array[i].trim();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(rotatedArray[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        scanner.close();
    }
}
