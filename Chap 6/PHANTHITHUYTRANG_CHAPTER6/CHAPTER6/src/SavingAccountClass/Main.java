package SavingAccountClass;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        System.out.println("Enter month");
//        double month = sc.nextDouble();
//        account.setMonth(month);
//        System.out.println(account.getMonth());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your starting balance");
        double balance = sc.nextDouble();
        SavingsAccount account = new SavingsAccount(balance);

        System.out.println("Enter month");
        double month = sc.nextDouble();
        account.setMonth(month);
        System.out.println(account.getMonth());
        System.out.println("Enter annual interest rate");
        double rate = sc.nextDouble();
        for (int i =1; i<=account.getMonth();i++) {

            System.out.println("Enter your deposit per month");
            double money = sc.nextDouble();
            System.out.println("Enter your withdrawal");
            double withdraw = sc.nextDouble();
//            System.out.println("Enter annual interest rate");
//            double rate = sc.nextDouble();
            account.setAnnualInterestRate(rate);
            System.out.println(account.getBalance());

            System.out.println(account.getAnnualInterestRate());

            System.out.println(account.withdrawal(withdraw));
            System.out.println(account.deposit(money));
            System.out.println(account.lastBalance());
        }

//        System.out.println("Enter month");
//        double month = sc.nextDouble();
//        account.setMonth(month);
//        System.out.println(account.getMonth());





    }
}
