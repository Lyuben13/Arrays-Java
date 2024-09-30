import java.util.Arrays;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the products (comma-separated): ");
        String input = scanner.nextLine();

        String[] products = input.split(",");

        for (int i = 0; i < products.length; i++) {
            products[i] = products[i].trim();
        }
        Arrays.sort(products);

        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + "." + products[i]);
        }

        scanner.close();
    }
}