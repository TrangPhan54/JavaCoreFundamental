import java.util.Scanner;
public class SmallestAndLargest2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double max = 0;
        double min = 0;
        int amountNumbers = 0;
        do {
            System.out.println(" Enter a number, or enter - 99 to exit");
            int number = kb.nextInt();
            if (number == -99) {
                break;
            } else if (amountNumbers == 0 || number < min) {
                min = number;
            } else if (amountNumbers == 0 || number > max) {
                max = number;

            }
            amountNumbers++;

        } while (true);
        if (amountNumbers > 0) {
            System.out.println("The largest number is " + max);
            System.out.println("The smallest number is " + min);

        }
    }
}
