package ParkingTicketSimulator;

public class ParkingTicket {
    private ParkedCar car;
    private ParkingMeter meter;
    private double fine;
    private String policeOfficerName;
    private String policeOfficerBadgeNumber;
    public ParkingTicket (ParkedCar parkCar, ParkingMeter meterParking,
                          String name, String badgeNum){
        this.car = new ParkedCar(parkCar);
        this.meter = new ParkingMeter(meterParking);
        this.policeOfficerName = name;
        this.policeOfficerBadgeNumber = badgeNum;
        setParkingFine();

    }

    public void setParkingFine (){
        int diff = car.getTimeParking()-meter.getParkingTimePurchase();
        int hour = diff/60;
        int fine = 0;
        if (diff<60){
            fine = 25;
        }
        if (diff>60){
            if (diff%60==0){
                fine = 25 + (hour-1)*10;
            }
            else {
                fine = 25 + hour *10;
            }
        }
        this.fine = fine;
    }

    @Override
    public String toString() {
        return "ParkingTicket{" +
                "car=" + car +
                ", fine=" + fine +
                ", policeOfficerName='" + policeOfficerName + '\'' +
                ", policeOfficerBadgeNumber='" + policeOfficerBadgeNumber + '\'' +
                '}';
    }
}
