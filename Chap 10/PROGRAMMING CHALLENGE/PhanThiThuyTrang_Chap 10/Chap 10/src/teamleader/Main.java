package teamleader;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter training hours that require");
        double requireHour = sc.nextDouble();
        System.out.println("enter training hour that leader attend");
        double hourAttend = sc.nextDouble();
        System.out.println("enter money bonus amount");
        double money = sc.nextDouble();
        ProductionWorker productionWorker = new ProductionWorker("Catarina","123AC","2/2/2002",1,3000);
        TeamLeader teamleader = new TeamLeader(productionWorker.getEmployeeName(),productionWorker.getEmployeeNumber(), productionWorker.getHireDate(), productionWorker.getShift(), productionWorker.getPayRate());
        teamleader.setMonthlyBonusAmount(money);
        teamleader.setRequiredTrainingHour(requireHour);
        teamleader.setTrainingHourAttend(hourAttend);
        if (teamleader.getTrainingHourAttend()>=teamleader.getRequiredTrainingHour()){
            System.out.println("team leader name "+teamleader.getEmployeeName()+" can get bonus money $"+teamleader.getMonthlyBonusAmount());
        }
        else {
            System.out.println("team leader cannot get bonus money");
        }








    }
}
