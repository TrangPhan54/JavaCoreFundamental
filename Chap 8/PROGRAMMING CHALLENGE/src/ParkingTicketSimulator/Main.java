package ParkingTicketSimulator;
import java.util.Scanner;
public class Main {
    public static ParkedCar parkCarInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter car make");
        String make = sc.nextLine();
        System.out.println("enter car model");
        String model = sc.nextLine();
        System.out.println("enter color");
        String color = sc.nextLine();
        System.out.println("enter license number");
        int license = sc.nextInt();
        System.out.println("enter time parking");
        int timeParking = sc.nextInt();
        ParkedCar newParkCar = new ParkedCar(make, model, color, license, timeParking);
        return newParkCar;
    }
    public static ParkingMeter parkMeter (){
        Scanner s = new Scanner (System.in);
        System.out.println("enter the minute purchase");
        int time = s.nextInt();
        ParkingMeter meter = new ParkingMeter(time);
        return meter;
    }
    public static PoliceOfficer policeInfo(ParkedCar car,ParkingMeter meter){
        Scanner kb = new Scanner (System.in);
        System.out.println("enter the name of police");
        String name = kb.nextLine();
        System.out.println("enter the badge number of the police");
        String badgeNum = kb.nextLine();
        PoliceOfficer police = new PoliceOfficer(name,badgeNum,car,meter);
        return police;
    }

    public static void main(String[] args) {
        ParkedCar car = parkCarInfo();
        ParkingMeter meter = parkMeter();
        PoliceOfficer police = policeInfo(car,meter);
        police.displayParkingTicket(car,meter);

    }
}
