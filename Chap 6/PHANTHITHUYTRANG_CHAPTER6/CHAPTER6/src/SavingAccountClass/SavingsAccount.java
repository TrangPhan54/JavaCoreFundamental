package SavingAccountClass;

public class SavingsAccount {
    private double annualInterestRate ;
    private double balance;

    private double month;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }



    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMonth() {
        return month;
    }

    public void setMonth(double month) {
        this.month = month;
    }

    public double withdrawal(double withdrawal){
        balance-=withdrawal;
        return balance;

    }
    public double deposit (double deposit){
        balance+=deposit;
        return balance;
    }
    public double lastBalance(){
        double lastBalance = balance + balance*annualInterestRate/12;
        return lastBalance;
    }
}
