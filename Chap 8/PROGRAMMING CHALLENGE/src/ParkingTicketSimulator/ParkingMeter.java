package ParkingTicketSimulator;

public class ParkingMeter {
    private int parkingTimePurchase;
    public ParkingMeter (int parkingPurchase){
        this.parkingTimePurchase = parkingPurchase;
    }
    public int getParkingTimePurchase() {
        return parkingTimePurchase;
    }

    public void setParkingTimePurchase(int parkingTimePurchase) {
        this.parkingTimePurchase = parkingTimePurchase;
    }

    public ParkingMeter (ParkingMeter object){
        this.parkingTimePurchase = object.getParkingTimePurchase();
    }


}
