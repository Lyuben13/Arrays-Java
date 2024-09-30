public class Main {
    public static void sumFirstAndLast(String[] array) {
        int firstElement = Integer.parseInt(array[0]);
        int lastElement = Integer.parseInt(array[array.length - 1]);

        int sum = firstElement + lastElement;

        System.out.println(sum);
    }
///1.	Sum First and Last Array Element
    public static void main(String[] args) {
        String[] example1 = {"20", "30", "40"};
        sumFirstAndLast(example1);

        String[] example2 = {"10", "17", "22", "33"};
        sumFirstAndLast(example2);

        String[] example3 = {"11", "58", "69"};
        sumFirstAndLast(example3);
    }
}
