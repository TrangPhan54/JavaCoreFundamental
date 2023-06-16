import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int number = scanner.nextInt();
        if (number > 0 && number <= 9) {
            System.out.println("Sum of digits is " + number);
        }
        if (number > 9) {
            while (number > 9) {
                int lastNumber = number % 10;
                number = number / 10;
                sum += lastNumber;
            }
            System.out.println("Sum of digits is " + (sum + number));

        }
        if (number<0 && number>=-9){
            System.out.println("Sum of digits is " + number*(-1));

        }
        if (number<-9){
            int secondNumber = number*(-1);
            while(secondNumber>9) {
                int lastSecondNumber = secondNumber % 10;
                secondNumber = secondNumber / 10;
                sum += lastSecondNumber;
            }
            System.out.println("Sum of digits is " + (sum + secondNumber));

        }
        }
    }

