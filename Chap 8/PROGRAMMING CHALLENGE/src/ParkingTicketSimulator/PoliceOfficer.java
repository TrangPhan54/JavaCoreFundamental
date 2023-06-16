package ParkingTicketSimulator;

public class PoliceOfficer {
    private String name;
    private String badgeNum;

    public PoliceOfficer(String inputName, String badgeNumber, ParkedCar parkCarOb, ParkingMeter parkMeterOb) {
        this.name = inputName;
        this.badgeNum = badgeNumber;
        checkingParkCar(parkCarOb, parkMeterOb);

    }
    public boolean checkingParkCar(ParkedCar car, ParkingMeter meter) {
        return car.getTimeParking() > meter.getParkingTimePurchase();
    }

    public ParkingTicket setTicket(ParkedCar car, ParkingMeter meter) {
        return new ParkingTicket(car, meter, getName(), getBadgeNum());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBadgeNum() {
        return badgeNum;
    }

    public void setBadgeNum(String badgeNum) {
        this.badgeNum = badgeNum;
    }

    @Override
    public String toString() {
        return "PoliceOfficer{" +
                "name='" + name + '\'' +
                ", badgeNum='" + badgeNum + '\'' +
                '}';
    }
    public void displayParkingTicket(ParkedCar car, ParkingMeter meter) {
        if (checkingParkCar(car, meter)) {
            ParkingTicket ticketDetail = setTicket(car, meter);
            System.out.println(ticketDetail.toString());
        }
        else {
            System.out.println("you cannot be fined");
        }
    }
}
