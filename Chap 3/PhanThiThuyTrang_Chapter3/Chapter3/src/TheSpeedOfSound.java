import java.util.Scanner;
public class TheSpeedOfSound {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        System.out.println ("THE SPEED OF SOUND IN AIR IS ");
        double air = kb.nextDouble();
        System.out.println ("THE DISTANCE");
        double distance = kb.nextDouble();
        double time = distance/1100;
        System.out.printf ("THE AMOUNT OF TIME IS: %.2f HOURS.\n", time);
        System.out.println ("THE SPEED OF SOUND IN WATER IS ");

        double water = kb.nextDouble();
        System.out.println ("THE DISTANCE");
        double distance1 = kb.nextDouble();
        double time1 = distance/4900;
        System.out.printf ("THE AMOUNT OF TIME IS: %.2f HOURS.\n", time);
        System.out.println ("THE SPEED OF SOUND IN STEEL IS ");

        double steel = kb.nextDouble();
        System.out.println ("THE DISTANCE");
        double distance2 = kb.nextDouble();
        double time2 = distance/16400;
        System.out.printf ("THE AMOUNT OF TIME IS: %.2f HOURS.\n", time);








    }
}
