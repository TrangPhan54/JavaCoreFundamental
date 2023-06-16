package ParkingTicketSimulator;

public class ParkedCar {
    private String make;
    private String model;
    private String color;
    private int licenseNumber;
    private int timeParking;
    public ParkedCar (String inputMake, String inputModel, String inputColor,
                      int licenseNum, int timeParkCar){
        this.make = inputMake;
        this.model = inputModel;
        this.color = inputColor;
        this.licenseNumber = licenseNum;
        this.timeParking = timeParkCar;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getTimeParking() {
        return timeParking;
    }

    public void setTimeParking(int timeParking) {
        this.timeParking = timeParking;
    }

    public ParkedCar (ParkedCar object){
        this.make = object.getMake();
        this.model = object.getModel();
        this.color = object.getColor();
        this.licenseNumber = object.getLicenseNumber();
        this.timeParking = object.getTimeParking();
    }

    @Override
    public String toString() {
        return "ParkedCar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", licenseNumber=" + licenseNumber +
                ", timeParking=" + timeParking +
                '}';
    }
}
