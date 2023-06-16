package bankaccount;

public abstract class BankAccount {
    private double balance;
    private double deposit;
    private double withdrawal;
    private double annualInterestRate;
    protected double monthlyServiceCharge;

    public BankAccount(double balance,  double annualInterestRate) {
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(double withdrawal) {
        this.withdrawal = withdrawal;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyServiceCharge() {
        return monthlyServiceCharge;
    }

    public void setMonthlyServiceCharge(double monthlyServiceCharge) {
        this.monthlyServiceCharge = monthlyServiceCharge;
    }

    public void deposit (double deposit){
        balance = balance + deposit;
        this.deposit++;

    }
    public void withdrawal (double withdrawal){
        balance = balance - withdrawal;
        this.withdrawal++;

    }
    public void calInterest(){
        double monthlyInterestRate = (annualInterestRate/12);
        monthlyInterestRate = balance * monthlyInterestRate;
        balance = balance + monthlyInterestRate;
    }

    public void monthlyProcess (){
        this.balance -=monthlyServiceCharge;
        this.deposit = 0;
        this.withdrawal = 0;
        this.monthlyServiceCharge = 0;
    }


}
