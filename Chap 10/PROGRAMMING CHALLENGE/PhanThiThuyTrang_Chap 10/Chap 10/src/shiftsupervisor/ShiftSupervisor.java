package shiftsupervisor;

public class ShiftSupervisor extends Employee {
    private double annualSalary;
    private double bonusComission;

    public ShiftSupervisor(String employeeName, String employeeNumber, String hireDate, double annualSalary, double bonusComission) {
        super(employeeName, employeeNumber, hireDate);
        this.annualSalary = annualSalary;
        this.bonusComission = bonusComission;
    }
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getBonusComission() {
        return bonusComission;
    }

    public void setBonusComission(double bonusComission) {
        this.bonusComission = bonusComission;
    }
}
