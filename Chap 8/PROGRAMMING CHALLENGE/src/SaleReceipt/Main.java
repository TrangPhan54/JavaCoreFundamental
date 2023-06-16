package SaleReceipt;

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.io.IOException;
public class Main {
    public static void main  (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter price");
        double price = sc.nextDouble();
        System.out.println("enter quantity");
        int quantity = sc.nextInt();
        RetailItem item = new RetailItem(price);
        SaleReceipt receipt = new SaleReceipt(item,quantity);
        item.setPrice(price);
        receipt.setQuantity(quantity);
        PrintWriter pw = new PrintWriter("TrangPhan.txt","UTF-8");
        pw.println("SALES RECEIPT");
        pw.println("Unit Price: $" + item.getPrice());
        pw.println("quantity: "+receipt.getQuantity());
        pw.println("Subtotal: $ "+receipt.subTotal(item));
        pw.println("Tax: $ "+receipt.getTax(item));
        pw.println("Total: $ "+receipt.totalSale(item));
        pw.close();


    }
}
