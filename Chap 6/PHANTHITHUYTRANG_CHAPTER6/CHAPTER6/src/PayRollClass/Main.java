package PayRollClass;

public class Main {
    public static void main(String[] args) {
        PayRoll salary = new PayRoll("Trang",123456);
        System.out.println("I can earn $ " +salary.payGrossPay()+" per week");
        System.out.println(salary);
    }
}
