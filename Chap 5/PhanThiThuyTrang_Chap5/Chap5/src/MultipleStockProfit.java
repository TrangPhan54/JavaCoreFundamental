import java.util.Scanner;
public class MultipleStockProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER NUMBER OF SHARE");
        double numberOfShare = sc.nextDouble();
        System.out.println("ENTER PURCHASE PRICE PER SHARE");
        double purchasePrice = sc.nextDouble();
        System.out.println("ENTER PURCHASE COMMISSION PAID");
        double purchaseCommission = sc.nextDouble();
        System.out.println("ENTER SALE PRICE PER SHARE");
        double salePrice= sc.nextDouble();
        System.out.println("ENTER SALE COMMISSION PAID");
        double saleCommission = sc.nextDouble();
        double money = (numberOfShare*salePrice-saleCommission)-(numberOfShare*purchasePrice+purchaseCommission);
        if (money > 0){
            gainProfit ( numberOfShare,purchasePrice,purchaseCommission, salePrice,saleCommission);
        }
        if (money < 0){
            lossProfit ( numberOfShare,purchasePrice,purchaseCommission, salePrice,saleCommission);
        }


    }


    public static double gainProfit (double numberOfShare,double purchasePrice,double purchaseCommission, double salePrice,double saleCommission){
        double moneyGain = (numberOfShare*salePrice-saleCommission)-(numberOfShare*purchasePrice+purchaseCommission);
        System.out.println("you gain $ "+moneyGain);
        return moneyGain;
    }
    public static double lossProfit (double numberOfShare,double purchasePrice,double purchaseCommission, double salePrice,double saleCommission){
        double moneyLoss = (numberOfShare*salePrice-saleCommission)-(numberOfShare*purchasePrice+purchaseCommission);
        System.out.println("you loss $ "+moneyLoss);
        return moneyLoss;

}
}
