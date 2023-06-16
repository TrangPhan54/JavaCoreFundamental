package DaysInMonth;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE MONTH");
        int month = sc.nextInt();
        System.out.println("ENTER THE YEAR");
        int year = sc.nextInt();

        MonthsDay numberOfday = new MonthsDay(month,year);
        System.out.println(numberOfday.numberOfDays()+" days");

    }

}
