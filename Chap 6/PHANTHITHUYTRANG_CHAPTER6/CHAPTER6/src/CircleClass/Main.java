package CircleClass;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        CircleClass circle = new CircleClass();

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE RADIUS");
        double radius = sc.nextDouble();
        circle.setRadius(radius);
        System.out.println("CIRCLE DIAMETER= "+ circle.diameter());
        System.out.println("CIRCLE CIRCUMFERENCE= "+ circle.circumference());
        System.out.printf("CIRCLE AREA= %.2f",circle.area());




    }
}
