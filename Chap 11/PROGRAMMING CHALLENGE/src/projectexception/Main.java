package projectexception;

import payroll.InvalidPay;

public class Main {
    public static void main(String[] args) {
        try {
            Employee employee = new Employee("mike", "123", "1/1/2000");
            employee.getEmployeeNumber();

        } catch (InvalidEmployeeNumber e) {
            System.out.println(e.getMessage());
        }
        try {
            ProductionWorker production = new ProductionWorker("mike", "123B", "23", 2, -23.4);

        } catch (InvalidEmployeeNumber | InvalidPayRate | InvalidShift f){
            System.out.println(f.getMessage());
        }


    }
}
