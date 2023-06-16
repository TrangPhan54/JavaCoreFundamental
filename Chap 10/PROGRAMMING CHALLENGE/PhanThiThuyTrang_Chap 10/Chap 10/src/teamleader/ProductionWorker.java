package teamleader;

import employeeandproduction.Employee;

public class ProductionWorker extends Employee {
    private int shift;
    private double payRate;


    public ProductionWorker(String employeeName, String employeeNumber, String hireDate, int shift, double payRate) {
        super(employeeName, employeeNumber, hireDate);
        this.shift = shift;
        this.payRate = payRate;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        if (shift == 1 | shift == 2) {
            this.shift = shift;
        } else {
            System.out.println("shift can only be 1 or 2 ");
        }
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        if (payRate < 0) {
            System.out.println("pay rate must be greater than 0 ");
        } else {
            this.payRate = payRate;
        }
    }
}
