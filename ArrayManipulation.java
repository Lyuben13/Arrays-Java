import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array of numbers: ");
        String[] inputArray = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String num : inputArray) {
            numbers.add(Integer.parseInt(num));
        }

        System.out.println("Enter the commands (type 'end' to stop):");
        while (true) {
            String command = scanner.nextLine().trim();
            if (command.equalsIgnoreCase("end")) {
                break;
            }

            String[] commandParts = command.replace(",", "").split(" ");
            switch (commandParts[0]) {
                case "Add":
                    int numberToAdd = Integer.parseInt(commandParts[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(commandParts[1]);
                    numbers.remove(Integer.valueOf(numberToRemove));
                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(commandParts[1]);
                    numbers.remove(indexToRemove);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(commandParts[1]);
                    int indexToInsert = Integer.parseInt(commandParts[2]);
                    numbers.add(indexToInsert, numberToInsert);
                    break;
            }
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
