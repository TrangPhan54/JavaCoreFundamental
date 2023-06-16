package cargocruiseship;

public class CruiseShip extends Ship {
    private int maxNumberPassenger;

    public CruiseShip(String name, String year, int maxNumberPassenger) {
        super(name, year);
        this.maxNumberPassenger = maxNumberPassenger;
    }

    public int getMaxNumberPassenger() {
        return maxNumberPassenger;
    }

    public void setMaxNumberPassenger(int maxNumberPassenger) {
        this.maxNumberPassenger = maxNumberPassenger;
    }

    @Override
    public String toString() {
        return "CruiseShip{" +"name: "+super.getName()+","+
                "MaxNumberPassenger= " + maxNumberPassenger +
                '}';
    }
}
