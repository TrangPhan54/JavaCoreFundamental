package SumOfNumInAString;

import java.util.Scanner;

public class GetSumOfNum {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter a series of numbers separated by commas: ");
        String string = kb.nextLine();
        String[] componentStr = string.split(",");
        int sum = 0;
        for (String s : componentStr) {
            sum += Integer.parseInt(s);
        }

        System.out.println("Sum of numbers in the string is: " + sum);
    }
}
