package employeeandproduction;

public class Main {
    public static void main(String[] args) {
        ProductionWorker production = new ProductionWorker("Mike","123AB","21/12/2022",1,120);
        System.out.println("The employee name is "+ production.getEmployeeName());
        System.out.println("The employee number is "+production.getEmployeeNumber());
        System.out.println("The employee pay rate is "+production.getPayRate());

    }
}

