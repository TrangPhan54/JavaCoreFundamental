import java.util.Scanner;
public class MassAndWeight {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println ("THE OBJECT'S MASS IS :");
        double mass = kb.nextDouble();
        double weight =  mass * 9.8;

        if (weight > 1000){
            System.out.println ("THE OBJECT'S WEIGHT IS "+ weight+" The object is too heavy ");
        }
        else if (weight < 10){
            System.out.println ("THE OBJECT'S WEIGHT IS "+ weight+" The object is too light ");

        }

    }
}
