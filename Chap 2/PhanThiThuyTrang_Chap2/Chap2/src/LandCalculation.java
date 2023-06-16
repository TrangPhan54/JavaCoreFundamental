import java.util.Scanner;
public class LandCalculation {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        System.out.println ("value of square feet");


        double squareFeet = keyboard.nextDouble();
        System.out.println ("value of square acres");




        double acres = keyboard.nextDouble();
        System.out.println ( squareFeet +" square feet =" +  squareFeet/acres + acres);
    }
}
