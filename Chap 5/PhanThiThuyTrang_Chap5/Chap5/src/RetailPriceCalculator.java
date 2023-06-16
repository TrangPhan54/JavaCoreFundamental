import java.util.Scanner;
public class RetailPriceCalculator {
    public static void main(String[] args) {
        Scanner product = new Scanner(System.in);
        double wholeSale, markupPercentage;
        System.out.println("ENTER WHOLESALE OF PRODUCT");
        wholeSale = product.nextDouble();
        System.out.println("ENTER MARKUP PERCENTAGE");
        markupPercentage = product.nextDouble();


        retailCalculator(wholeSale,markupPercentage);

    }

    public static double retailCalculator(double wholeSale, double markupPercentage) {

        double retailPrice = wholeSale + wholeSale*markupPercentage;
        System.out.println("THE RETAIL PRICE IS "+ retailPrice);
        return retailPrice;
    }


}