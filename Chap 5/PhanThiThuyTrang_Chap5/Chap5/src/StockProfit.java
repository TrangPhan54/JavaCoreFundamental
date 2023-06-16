import java.util.Scanner;
public class StockProfit {
    public static void main(String[] args) {
        double numberOfShare = 0;
        double purchasePrice=0;
        double purchaseCommission=0;
        double salePrice=0;
        double saleCommission=0;
        stockProfit(numberOfShare,purchasePrice,purchaseCommission, salePrice,saleCommission);

    }
    public static double stockProfit (double numberOfShare, double purchasePrice, double purchaseCommission, double salePrice, double saleCommission){
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER NUMBER OF SHARE");
        numberOfShare = sc.nextDouble();
        System.out.println("ENTER PURCHASE PRICE PER SHARE");
        purchasePrice = sc.nextDouble();
        System.out.println("ENTER PURCHASE COMMISSION PAID");
        purchaseCommission = sc.nextDouble();
        System.out.println("ENTER SALE PRICE PER SHARE");
        salePrice = sc.nextDouble();
        System.out.println("ENTER SALE COMMISSION PAID");
        saleCommission = sc.nextDouble();
        double money = (numberOfShare*salePrice-saleCommission)-(numberOfShare*purchasePrice+purchaseCommission );
        System.out.println(money);
        return money;

    }
}
