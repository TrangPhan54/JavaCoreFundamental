package employee;

import java.util.Objects;

public class Employee {
    private String employeeNumber;
    private String name;

    public Employee(String employeeNumber, String name) {
        this.employeeNumber = employeeNumber;
        this.name = name;
    }

    public Employee(Employee object) {
        this.employeeNumber = object.employeeNumber;
        this.name = object.name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeNumber.equals(employee.employeeNumber) && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeNumber, name);
    }

    @Override
    public String toString() {
        return
                "employeeNumber = " + employeeNumber +
                "\nname = " + name
                ;
    }



}
