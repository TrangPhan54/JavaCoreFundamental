import java.util.Scanner;
public class MagicDates {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        System.out.println ("THE NUMBER OF DAY IS:");
        int day = kb.nextInt();
        System.out.println ("THE NUMBER OF MONTH IS:");
        int month = kb.nextInt();
        System.out.println ("THE NUMBER OF YEAR IS:");
        int year = kb.nextInt();
        if (day*month == year){
            System.out.println ("The date is magic");

        }
        else {
            System.out.println ("The date is not magic");


        }

    }
}
