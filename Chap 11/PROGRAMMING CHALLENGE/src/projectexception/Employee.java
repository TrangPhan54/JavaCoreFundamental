package projectexception;

public class Employee {
    private String employeeName;
    private String employeeNumber;
    private String hireDate;


    public Employee(String employeeName, String employeeNumber, String hireDate) throws InvalidEmployeeNumber{
        this.employeeName = employeeName;
        if (employeeNumber.length() != 4) {

            throw new InvalidEmployeeNumber ("length of employee number must has 4 chars");
        } else {
            String part1 = employeeNumber.substring(0, 3);
            String part2 = employeeNumber.substring(3);
            if (part1.matches("^[0-9]*") && part2.matches("^[A-M]*")) {
                this.employeeNumber = employeeNumber;
            }
            else {
                throw new InvalidEmployeeNumber ("invalid employee number");


            }
        }
//        this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }


}
