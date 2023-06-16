import java.util.Scanner;
public class MobileServiceProvider {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("THE NAME OF PACKAGE IS:");
        String packages = kb.nextLine();
        System.out.println("THE MINUTES U USED:");

        int minutes = kb.nextInt();
        double packageAMore = 39.99+ (minutes - 450)*0.45;
        double packageBMore = 59.99+ (minutes - 900)*0.45;


        if (packages.equals("A")) {
            if (minutes <= 450) {
                System.out.println("You have to pay $39.99 per month");
            }
            else {
                System.out.println("You have to pay $"+ packageAMore + "per month");
            }

        }
        if (packages.equals("B")) {
            if (minutes <= 900) {
                System.out.println("You have to pay $59.99 per month");
            } else {
                System.out.println("You have to pay $" + packageBMore + "per month");
            }
        }
        if (packages.equals("C")) {

                System.out.println("You have to pay $69.99 per month");
            }


    }

}
