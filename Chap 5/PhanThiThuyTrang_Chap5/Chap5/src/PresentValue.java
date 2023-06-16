import java.util.Scanner;
public class PresentValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER FUTURE VALUE");
        double futureValue = sc.nextDouble();
        System.out.println("ENTER ANNUAL INTEREST RATE");
        double annualInterestRate = sc.nextDouble();
        System.out.println("ENTER NUMBERS OF YEARS");
        double numberOfYears = sc.nextDouble();
        presentValue (futureValue, annualInterestRate, numberOfYears );

    }
    public static void presentValue (double futureValue, double annualInterestRate, double numberOfYears ){
        double deposit = futureValue/Math.pow((1+annualInterestRate), numberOfYears);
        System.out.println("your deposit is" + deposit);
    }
}
