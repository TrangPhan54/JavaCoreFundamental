package payroll;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the name of employee");
        String name = sc.nextLine();
        System.out.println("enter employee Id");
        int id = sc.nextInt();
        System.out.println("enter the pay rate for this employee");
        int payRate = sc.nextInt();
        System.out.println("enter hour working of this employee");
        int hour = sc.nextInt();

        try{
            PayRoll payRoll;
            payRoll = new PayRoll (name,id,payRate,hour);


        } catch (EmptyString i) {
            System.out.println(i.getMessage());

        }
         catch (NegativeId j){
        System.out.println(j.getMessage());

        } catch (InvalidPay k ){
            System.out.println(k.getMessage());

        } catch (InvalidHour l){
            System.out.println(l.getMessage());
        }


    }
}
