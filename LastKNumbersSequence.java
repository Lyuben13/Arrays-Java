import java.util.Scanner;

public class LastKNumbersSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.print("Enter k: ");
        int k = scanner.nextInt();

        long[] sequence = new long[n];
        sequence[0] = 1;

        for (int i = 1; i < n; i++) {
            long sum = 0;
            for (int j = i - 1; j >= Math.max(0, i - k); j--) {
                sum += sequence[j];
            }
            sequence[i] = sum;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(sequence[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        scanner.close();
    }
}