package PayRoll;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int [] idOfEmployee = {5658845 , 4520125 ,7895122, 8777541,
                8451277, 1302850 ,7580489};
        int [] hour = new int [7];
        double [] payRate = new double [7];
        PayRoll payRoll = new PayRoll();

        Scanner sc = new Scanner (System.in);

        for (int i = 0; i<hour.length;i++){
                System.out.println("enter the number of hour  of employee "+ idOfEmployee[i]);
                hour [i] = sc.nextInt();
                if (hour[i]<0){
                    System.out.println("hour must be greater than 0");
                    hour[i]=sc.nextInt();
                }
                System.out.println("enter the pay rate "+ idOfEmployee[i]);
                payRate [i] =sc.nextInt();
                if (payRate [i]<6){
                    System.out.println("pay rate must be greater than 6");
                    payRate [i] = sc.nextInt();
                }

            }
        payRoll.setHours(hour);
        payRoll.getHours();
        payRoll.setPayRate(payRate);
        payRoll.getPayRate();
        int idEm = sc.nextInt();
        payRoll.findEmployee(idEm);


        }


    }
