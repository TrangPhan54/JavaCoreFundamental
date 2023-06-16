package teamleader;

public class TeamLeader extends ProductionWorker{
    private double monthlyBonusAmount;
    private double requiredTrainingHour;
    private double trainingHourAttend;

    public TeamLeader(String employeeName, String employeeNumber, String hireDate, int shift, double payRate) {
        super(employeeName, employeeNumber, hireDate, shift, payRate);
    }

    public TeamLeader(String employeeName, String employeeNumber, String hireDate, int shift, double payRate, double monthlyBonusAmount, double requiredTrainingHour, double trainingHourAttend) {
        super(employeeName, employeeNumber, hireDate, shift, payRate);
        this.monthlyBonusAmount = monthlyBonusAmount;
        this.requiredTrainingHour = requiredTrainingHour;
        this.trainingHourAttend = trainingHourAttend;
    }

    public double getMonthlyBonusAmount() {
        return monthlyBonusAmount;
    }

    public void setMonthlyBonusAmount(double monthlyBonusAmount) {
        this.monthlyBonusAmount = monthlyBonusAmount;
    }

    public double getRequiredTrainingHour() {
        return requiredTrainingHour;
    }

    public void setRequiredTrainingHour(double requiredTrainingHour) {
        this.requiredTrainingHour = requiredTrainingHour;
    }

    public double getTrainingHourAttend() {
        return trainingHourAttend;
    }

    public void setTrainingHourAttend(double trainingHourAttend) {
        this.trainingHourAttend = trainingHourAttend;
    }
}
