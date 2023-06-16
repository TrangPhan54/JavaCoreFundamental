package CarInstrumentSimulator;

public class FuelGauge {
    private int amountOfFuel;

    public FuelGauge() {
    }

    public FuelGauge(int amountOfFuel) {
        if (this.amountOfFuel <= 15){
            this.amountOfFuel = amountOfFuel;
    } else {
            this.amountOfFuel = 15;

        }
    }
    public int getAmountOfFuel() {
        return amountOfFuel;
    }

    public void setAmountOfFuel(int amountOfFuel) {
        this.amountOfFuel = amountOfFuel;
    }

    public int puttingFuel () {
         if (this.amountOfFuel<=15) {
            this.amountOfFuel++;
        }
         else {
             System.out.println("fuel is full");
         }
        return this.amountOfFuel;
    }
    public int gettingFuel(){
        if (this.amountOfFuel>0) {
            this.amountOfFuel--;
        }
        else {
            System.out.println("run out of fuel");

        }
        return this.amountOfFuel;
    }
}
