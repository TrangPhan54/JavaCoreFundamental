package employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Susan Meyers",47899,"Accounting","Vice President");
        System.out.println(employee.toString());

        Employee employeeOne = new Employee("Mark Jones",39119,"IT","Programmer");
        System.out.println(employeeOne.toString());

        Employee employeeTwo = new Employee("Joy Rogers",81774,"Manufacturing","Engineer");
        System.out.println(employeeTwo.toString());


    }
}
