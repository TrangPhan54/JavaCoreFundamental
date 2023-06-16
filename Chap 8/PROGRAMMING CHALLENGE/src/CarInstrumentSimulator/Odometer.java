package CarInstrumentSimulator;

public class Odometer {
    private int milage;
    private int startingMilage;
    private FuelGauge fuelAmount;


    public Odometer(int milage, FuelGauge fuelAmount) {
        this.milage = milage;
        this.startingMilage = startingMilage;
        this.fuelAmount = fuelAmount;
    }

    public int getMilage() {
        return milage;
    }
    public void currentMilage() {
        if (this.milage <= 999999) {
            this.milage++;
        } else {
            this.milage = 0;
        }
        int usedMilage = startingMilage - milage;
        if (usedMilage % 24 == 0) {
            fuelAmount.gettingFuel();

        }
    }
}
