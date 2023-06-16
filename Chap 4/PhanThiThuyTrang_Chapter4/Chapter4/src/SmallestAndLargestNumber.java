import javax.swing.JOptionPane;
public class SmallestAndLargestNumber {
    public static void main(String[] args) {
        int number, largestNumber, smallestNumber, amountOfNumbers;
        String inputString;
        inputString = JOptionPane.showInputDialog("Enter an integer, or enter -99 to stop");
        number =Integer.parseInt(inputString);
        largestNumber = number;
        smallestNumber = number;
        for (amountOfNumbers = 1; number != 99; amountOfNumbers++) {
            inputString = JOptionPane.showInputDialog("Enter an integer, or enter -99 to stop");
            number =Integer.parseInt(inputString);
            if (number == -99) {
                break;
            }
            if (number > largestNumber) {
                largestNumber = number;
            }
            if (number < smallestNumber) {
                smallestNumber = number;


            }

        }
        JOptionPane.showInputDialog(null,"The smallest number is", smallestNumber);
        JOptionPane.showInputDialog(null,"The largest number is", largestNumber);

    }
}
