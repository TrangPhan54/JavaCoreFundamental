package shiftsupervisor;

public class Main {
    public static void main(String[] args) {
        ShiftSupervisor leader = new ShiftSupervisor("Sebastian","345-AD","1/1/2000",10000,5000);
        System.out.println("the name of leader is "+leader.getEmployeeName());
        System.out.println("the number  of leader is "+leader.getEmployeeNumber());
        System.out.println("the hire date of leader is "+leader.getHireDate());
        System.out.println("the annual salary of leader is "+leader.getAnnualSalary());
        System.out.println("the bonus commission of leader is "+leader.getBonusComission());





    }
}
