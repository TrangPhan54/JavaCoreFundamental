package stockmap;

import employee.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StockMap  {

    public static void main(String[] args) {
        Map<String, Stock> stockMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the stock symbol");
        String empNum = sc.nextLine();

        Stock Anna = new Stock ("1111a", 10000);
        Stock Billy = new Stock ("1112b", 130000);
        Stock Jack = new Stock ("1113c", 125000);
        Stock Rose = new Stock ("1114d", 98000);

        stockMap.put(Anna.getSymbol(), Anna);
        stockMap.put(Billy.getSymbol(), Billy);
        stockMap.put(Jack.getSymbol(), Jack);
        stockMap.put(Rose.getSymbol(), Rose);

        System.out.println("\nSearching for the stock with " +
                " stock symbol  " + (Anna.getSymbol()));
        Stock foundStock = stockMap.get(Anna.getSymbol());

        if (foundStock != null)
            System.out.println(foundStock);
        else
            System.out.println("This stock is NOT in the set.");

        System.out.println("\nSearching for the stock with stock symbol " +
                empNum);
        foundStock = stockMap.get(empNum);

        if (foundStock  != null)
            System.out.println(foundStock );
        else
            System.out.println("That stock is NOT in the set.");
    }
}
