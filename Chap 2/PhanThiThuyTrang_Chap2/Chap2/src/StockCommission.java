import java.util.Scanner;
public class StockCommission {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        System.out.println ( "Amount of paid is ");
        double amountOfPaid = keyboard.nextDouble();
        System.out.println ( "Amount of commission is ");


        double amountOfCommission = keyboard.nextDouble();
        System.out.println ( "Total amount is "+ (amountOfPaid + amountOfCommission));




    }
}
