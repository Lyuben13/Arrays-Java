import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the elements of the array (comma-separated): ");
        String input = scanner.nextLine();

        String[] inputArray = input.split(",");
        int[] nums = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            nums[i] = Integer.parseInt(inputArray[i].trim());
        }

        while (nums.length > 1) {
            int[] condensed = new int[nums.length - 1];

            for (int i = 0; i < condensed.length; i++) {
                condensed[i] = nums[i] + nums[i + 1];
            }

            nums = condensed;
        }

        System.out.println(nums[0]);

        scanner.close();
    }
}
