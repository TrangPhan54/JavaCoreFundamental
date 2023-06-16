import java.util.Scanner;
public class KineticEnergy {
    public static void main(String[] args) {
        double mass=0, velocity=0;
        System.out.println(kineticEnergy(mass,velocity));


    }
    public static double kineticEnergy (double mass, double velocity){
        Scanner scanner = new Scanner (System.in);
        System.out.println("ENTER MASS");
        mass = scanner.nextDouble();
        System.out.println("ENTER VELOCITY");
        velocity = scanner.nextDouble();
        double KE = mass*Math.pow (velocity,2);
        return KE;
    }
}
