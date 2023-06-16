package payroll;

public class PayRoll {
    private String name;
    private int idNumber;
    private int hourPayRate;
    private int numberHoursWorked;

    public PayRoll(String name, int idNumber, int hourPayRate, int numberHoursWorked) throws EmptyString, NegativeId, InvalidPay, InvalidHour {
        if (name.isEmpty( )) {
            throw new EmptyString("name cannot be empty");
        }
        if (idNumber <=0){
            throw new NegativeId("id number must be greater than 0");
        }

        if (hourPayRate<0 || hourPayRate>25){
            throw new InvalidPay("pay rate per hour must be greater than 0 and less than or equal 25");
        }
        if (numberHoursWorked<0|| numberHoursWorked>84){
            throw new InvalidHour("pay rate per hour must be greater than 0 and less than or equal 84");

        }
        this.name = name;
        this.idNumber = idNumber;
        this.hourPayRate = hourPayRate;
        this.numberHoursWorked = numberHoursWorked;
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
        this.hourPayRate = hourPayRate;
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
