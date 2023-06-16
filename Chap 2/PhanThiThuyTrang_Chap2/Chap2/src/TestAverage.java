import java.util.Scanner;
public class TestAverage {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        System.out.println ("Math score is ");
        double mathScore = keyboard.nextDouble();
        System.out.println ("English score is ");
        double engScore = keyboard.nextDouble();
        System.out.println ("Biology score is ");
        double biologyScore = keyboard.nextDouble();
        System.out.println ("Average score is "+ (mathScore+engScore+biologyScore)/3);


    }
}
