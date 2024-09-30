import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class AddAndRemoveElementsFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the commands (add/remove): ");
        String input = scanner.nextLine();

        String[] commands = input.split(",");

        List<Integer> numbers = new ArrayList<>();
        int currentNumber = 1;

        for (String command : commands) {
            command = command.trim();

            if (command.equals("add")) {
                numbers.add(currentNumber);
            } else if (command.equals("remove")) {
                if (!numbers.isEmpty()) {
                    numbers.remove(numbers.size() - 1);
                }
            }
            currentNumber++;
        }

        if (numbers.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (int i = 0; i < numbers.size(); i++) {
                System.out.print(numbers.get(i));
                if (i < numbers.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
