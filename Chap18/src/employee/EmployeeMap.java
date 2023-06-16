package employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeMap {

    public static void main(String[] args) {
        Map<String, Employee> carMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the employee number");
        String empNum = sc.nextLine();

        // Create some Car objects.
        Employee Anna = new Employee("1111", "Anna Karenina");
        Employee Billy = new Employee("1112", "Billy Jones");
        Employee Jack = new Employee("1113", "Jack Dawson");
        Employee Rose = new Employee("1114", "Rose Dawson");

        carMap.put(Anna.getEmployeeNumber(), Anna);
        carMap.put(Billy.getEmployeeNumber(), Billy);
        carMap.put(Jack.getEmployeeNumber(), Jack);
        carMap.put(Rose.getEmployeeNumber(), Rose);

        System.out.println("\nSearching for the employee with " +
                " employee number  " + (Anna.getEmployeeNumber()));
        Employee foundEmp = carMap.get(Anna.getEmployeeNumber());

        // If the car was found, display it.
        if (foundEmp != null)
            System.out.println(foundEmp);
        else
            System.out.println("This employee is NOT in the set.");

        // Search for another VIN. This one is not in the set.
        System.out.println("\nSearching for the employee with employee number " +
                empNum);
        foundEmp = carMap.get(empNum);

        // If the car was found display it.
        if (foundEmp != null)
            System.out.println(foundEmp);
        else
            System.out.println("That employee is NOT in the set.");
    }
}
