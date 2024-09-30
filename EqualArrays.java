import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first array (comma-separated): ");
        String[] array1 = scanner.nextLine().split(",");

        System.out.print("Enter the second array (comma-separated): ");
        String[] array2 = scanner.nextLine().split(",");

        if (array1.length != array2.length) {
            System.out.println("Arrays are not identical. Found difference at 0 index");
            scanner.close();
            return;
        }

        int sum = 0;
        boolean identical = true;

        for (int i = 0; i < array1.length; i++) {
            int num1 = Integer.parseInt(array1[i].trim());
            int num2 = Integer.parseInt(array2[i].trim());

            if (num1 != num2) {
                System.out.println("Arrays are not identical. Found difference at " + i + " index");
                identical = false;
                break;
            }

            sum += num1;
        }

        if (identical) {
            System.out.println("Arrays are identical. Sum: " + sum);
        }

        scanner.close();
    }
}
