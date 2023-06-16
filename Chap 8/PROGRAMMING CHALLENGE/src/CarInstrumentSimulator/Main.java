package CarInstrumentSimulator;

public class Main {
    public static void main(String[] args) {
        FuelGauge fuelGauge = new FuelGauge();
        Odometer odo = new Odometer(0,fuelGauge);
        for (int i = 0; i<15;i++){
            fuelGauge.puttingFuel();
        }
        while (fuelGauge.getAmountOfFuel()>0){
            odo.currentMilage();
            System.out.println("Miles: " +odo.getMilage()+ "\nFuel level: "+fuelGauge.getAmountOfFuel());

        }
//        odo.getMilage();
//        odo.fuelEconomy(fuelGauge);

    }
}
