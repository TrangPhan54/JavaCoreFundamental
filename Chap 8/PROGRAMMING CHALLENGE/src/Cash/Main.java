package Cash;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the price for each item");
        double price = sc.nextDouble();
        RetailItem item = new RetailItem("shoes",9,price);

        System.out.println("enter the quantity ");
        int quantity = sc.nextInt();
        CashRegister item1 = new CashRegister (item,quantity);
        double subTotal = item1.subTotal(item);
        System.out.println("the sub total is $ "+subTotal);
        double tax= item1.getTax(item);
        System.out.println("the tax is $ "+tax);
        double totalPay = item1.totalSale(item);
        System.out.println("the total sale is $ "+totalPay);




    }
}
