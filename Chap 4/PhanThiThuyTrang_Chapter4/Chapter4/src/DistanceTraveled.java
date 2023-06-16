import java.util.Scanner;
public class DistanceTraveled {
    public static void main ( String [] args){
        Scanner kb = new Scanner (System.in);
        System.out.println ("THE SPEED (MPH) IS");
        double speed = kb.nextDouble();
        System.out.println ("THE TIME (HOURS) IS");
        double time = kb.nextDouble();
        System.out.println ("Hour       Distance Traveled");
        System.out.println ("----------------------------------");
        for (time =1; time <=3; time++){
            System.out.println (time +"\t\t\t"+ time*speed);

        }






    }


}
