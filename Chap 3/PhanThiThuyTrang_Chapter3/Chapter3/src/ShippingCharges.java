import java.util.Scanner;
public class ShippingCharges {
    public static void main(String[] args) {
        System.out.println("THE WEIGHT OF PACKAGE IS: ");
        Scanner kb = new Scanner(System.in);
        int weight = kb.nextInt();
        System.out.println("THE DISTANCE IS: ");
        int distance = kb.nextInt();
        if (distance > 500 && weight <= 2) {
            System.out.println("THE SHIPPING CHARGES IS 2.2$");
        }
        if (distance <= 500 && weight <= 2) {
            System.out.println("THE SHIPPING CHARGES IS 1.1$");
        }
        if (distance <= 500 && weight > 2 && weight < 6) {
            System.out.println("THE SHIPPING CHARGES IS 2.2$");
        }
        if (distance > 500 && weight > 2 && weight < 6) {
            System.out.println("THE SHIPPING CHARGES IS 4.4$");
        }
        if (distance <= 500 && weight > 6 && weight < 10) {
            System.out.println("THE SHIPPING CHARGES IS 3.7$");
        }
        if (distance > 500 && weight > 6 && weight < 10) {
            System.out.println("THE SHIPPING CHARGES IS 7.4 $");

        }
        if (distance <= 500 && weight > 10){
            System.out.println("THE SHIPPING CHARGES IS 3.8 $");

        }
        if (distance > 500 && weight > 10){
            System.out.println("THE SHIPPING CHARGES IS 7.6 $");

        }
    }
}
