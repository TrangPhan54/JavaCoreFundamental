import java.util.Scanner;
public class SalesTax {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        System.out.println ("Amount Of Purchase is ");


        int amountOfPurchase = kb.nextInt();




        double statesSalesTax = amountOfPurchase * 0.04;
        double countySalesTax = amountOfPurchase * 0.02;
        double totalOfTheSaleTax = statesSalesTax + countySalesTax;
        double totalOfTheSale = totalOfTheSaleTax + amountOfPurchase;


        System.out.println ("States Sales Tax is "+statesSalesTax);
        System.out.println ("County Sales Tax is " + countySalesTax);
        System.out.println ("Total Of The Sales Tax is " + totalOfTheSaleTax);
        System.out.println ("Total Of The Sales is " + totalOfTheSale);










    }
}
