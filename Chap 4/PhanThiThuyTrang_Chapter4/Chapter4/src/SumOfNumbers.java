import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        System.out.println ("Enter A Number:");

        int number = kb.nextInt();
        int sum  = 0;
        for (int i=1; i <= number; i++) {
            sum+=i;
        }

        System.out.println ("RESULT OF SUM FROM 1 TO " + number+ " IS " +sum);


    }
}