import java.util.Scanner;
public class DistanceTravelModitification {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER SPEED");
        double speed = sc.nextInt();
        System.out.println("ENTER TIME");
        double time = sc.nextInt();
        System.out.println("time"+"\t"+"distance");
        System.out.println("--------------------");
        travelDistance (speed,time);

    }
    public static double travelDistance (double speed, double time){
        double distance = 0;
        for (int i =1;i<=time;i++){
            distance = i*speed;
            System.out.println(i+"\t\t"+distance);
        }
        return distance;
    }
}
