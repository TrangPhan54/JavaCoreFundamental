import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        System.out.println ("Miles that I have driven ");
        double milesDriven  = keyboard.nextInt();
        System.out.println ("Gallons that I have used ");
        double gallonsUsed = keyboard.nextInt();
        System.out.println (" MPG = "+milesDriven/gallonsUsed);






    }
}
