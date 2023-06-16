import java.util.Scanner;
public class SalePrediction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int totalSales = scanner.nextInt();
        double saleGenerate =  totalSales* 0.62;
        System.out.println (saleGenerate);


    }
}
