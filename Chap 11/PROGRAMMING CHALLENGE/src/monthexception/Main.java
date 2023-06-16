package monthexception;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number of the month");
            int num = sc.nextInt();
//            System.out.println("enter the name of the month");
//            String monthName = sc.nextLine();
            Month month = new Month(num);
//            Month month1 = new Month(monthName);
        } catch (InvalidNumberOfMonth i) {
            System.out.println(i.getMessage());
        }
        try {
            Scanner sc = new Scanner (System.in);
            System.out.println("enter the name of the month");
            String monthName = sc.nextLine();
            Month month1 = new Month(monthName);


        }
        catch (WrongNameOfMonth j){
            System.out.println(j.getMessage());
        }
    }
}
