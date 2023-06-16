import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Your weight is :");
        double weight = kb.nextDouble();
        System.out.println("Your height is :");
        double height = kb.nextDouble();
        double BMI = weight * 703 / Math.pow(height, 2);
        if (BMI > 25) {
            System.out.println("Your BMI is " + BMI + " . You are overweight");
        } else if (BMI < 18.5) {
            System.out.println("Your BMI is " + BMI + " . You are underweight");
        } else {
            System.out.println("Your BMI is " + BMI + " . You are optimalweight");
        }
    }
}
