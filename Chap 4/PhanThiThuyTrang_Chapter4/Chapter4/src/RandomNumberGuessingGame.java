import java.util.Scanner;

import java.util.Random;
public class RandomNumberGuessingGame {
    public static void main(String[] args) {
        Scanner kw = new Scanner (System.in);
        System.out.println("THE NUMBER IS");
        int number = kw.nextInt();

        Random kb = new Random();

        int randomNumber = kb.nextInt(10);


        while (randomNumber!=number) {
            if (randomNumber < number) {
                System.out.println("Too high, try again ");
                 number = kw.nextInt();
            }
             else {
                System.out.println("Too low, try again ");
                 number = kw.nextInt();

            }
        }
            if (number == randomNumber) {
                System.out.println("correct ");

            }


    }


}
