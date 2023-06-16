package PayRollClass;

public class PayRoll {
    private String name;
    private int idNumber;
    private int hourPayRate;
    private int numberHoursWorked;

    public PayRoll(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.hourPayRate = 500;
        this.numberHoursWorked = 40;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getHourPayRate() {
        return hourPayRate;
    }

    public void setHourPayRate(int hourPayRate) {
        this.hourPayRate =hourPayRate ;
    }

    public int getNumberHoursWorked() {
        return numberHoursWorked;
    }

    public void setNumberHoursWorked(int numberHoursWorked) {
        this.numberHoursWorked = numberHoursWorked;
    }
    public int payGrossPay() {
        int payGrossPay = this.hourPayRate * this.numberHoursWorked;
        return payGrossPay;
    }

    @Override
    public String toString() {
        return "PayRoll{" +
                "name='" + name + '\'' +
                ", idNumber=" + idNumber +
                ", hourPayRate=" + hourPayRate +
                ", numberHoursWorked=" + numberHoursWorked +
                '}';
    }
}
