import java.util.Scanner;

public class PensionContributionCalculator {
    public static final double CONSTANT_EMPLOYEECONTRIBUTIONUPTO45 = 0.2;
    public static final double CONSTANT_EMPLOYERCONTRIBUTIONUPTO45 = 0.17;
    public static final double CONSTANT_EMPLOYEECONTRIBUTIONUPTO55 = 0.13;
    public static final double CONSTANT_EMPLOYERCONTRIBUTIONUPTO55 = 0.13;
    public static final double CONSTANT_EMPLOYEECONTRIBUTIONOVER55 = 0.055;
    public static final double CONSTANT_EMPLOYERCONTRIBUTIONOVER55 = 0.075;

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("ENTER YOUR MONTHLY SALARY");
        int monthSalary = kb.nextInt();
        System.out.println("ENTER YOUR AGE");
        int age = kb.nextInt();
        PensionContribution(monthSalary,age);
    }
    public static void PensionContribution (double monthlySalary, double age) {
        double moneyOfEmployee=0;
        double moneyOfEmployer=0;

        if (monthlySalary > 7000) {
            if (age > 0 && age <= 45) {
                moneyOfEmployee = 7000 * CONSTANT_EMPLOYEECONTRIBUTIONUPTO45;
                moneyOfEmployer = 7000 * CONSTANT_EMPLOYERCONTRIBUTIONUPTO45;
            }
            if (age >= 46 && age <= 55) {
                 moneyOfEmployee = 7000 * CONSTANT_EMPLOYEECONTRIBUTIONUPTO55;
                 moneyOfEmployer = 7000 * CONSTANT_EMPLOYERCONTRIBUTIONUPTO55;
            }
            if (age > 55) {
                moneyOfEmployee = 7000 * CONSTANT_EMPLOYEECONTRIBUTIONOVER55;
                moneyOfEmployer = 7000 * CONSTANT_EMPLOYERCONTRIBUTIONOVER55;
            }

        }
        if (monthlySalary < 7000) {
            if (age > 0 && age <= 45) {
                 moneyOfEmployee = monthlySalary * CONSTANT_EMPLOYEECONTRIBUTIONUPTO45;
                 moneyOfEmployer = monthlySalary * CONSTANT_EMPLOYERCONTRIBUTIONUPTO45;
            }
            if (age >= 46 && age <= 55) {
                 moneyOfEmployee = monthlySalary * CONSTANT_EMPLOYEECONTRIBUTIONUPTO55;
                 moneyOfEmployer = monthlySalary * CONSTANT_EMPLOYERCONTRIBUTIONUPTO55;
            }
            if (age > 55) {
                moneyOfEmployee = monthlySalary * CONSTANT_EMPLOYEECONTRIBUTIONOVER55;
                moneyOfEmployer = monthlySalary * CONSTANT_EMPLOYERCONTRIBUTIONOVER55;
            }

        }
            System.out.println("The employee contribution is "+moneyOfEmployee );
            System.out.println("The employer contribution is "+moneyOfEmployer );
            System.out.println("The total contribution is "+  (moneyOfEmployee+moneyOfEmployer));
    }

}
