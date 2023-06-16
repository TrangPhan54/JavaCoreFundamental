package PatientCharges;

public class Procedure {
    private String nameOfProcedure;
    private String dateOfProcedure;
    private String nameOfPractioner;
    private double charges;

    public Procedure(String nameOfProcedure, String dateOfProcedure, String nameOfPractioner, double charges) {
        this.nameOfProcedure = nameOfProcedure;
        this.dateOfProcedure = dateOfProcedure;
        this.nameOfPractioner = nameOfPractioner;
        this.charges = charges;
    }

    public String getNameOfProcedure() {
        return nameOfProcedure;
    }

    public void setNameOfProcedure(String nameOfProcedure) {
        this.nameOfProcedure = nameOfProcedure;
    }

    public String getDateOfProcedure() {
        return dateOfProcedure;
    }

    public void setDateOfProcedure(String dateOfProcedure) {
        this.dateOfProcedure = dateOfProcedure;
    }

    public String getNameOfPractioner() {
        return nameOfPractioner;
    }

    public void setNameOfPractioner(String nameOfPractioner) {
        this.nameOfPractioner = nameOfPractioner;
    }

    public double getCharges() {
        return charges;
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }

    @Override
    public String toString() {
        return "Procedure{" +
                "nameOfProcedure='" + nameOfProcedure + '\'' +
                ", dateOfProcedure='" + dateOfProcedure + '\'' +
                ", nameOfPractioner='" + nameOfPractioner + '\'' +
                ", charges=" + charges +
                '}';
    }
}
