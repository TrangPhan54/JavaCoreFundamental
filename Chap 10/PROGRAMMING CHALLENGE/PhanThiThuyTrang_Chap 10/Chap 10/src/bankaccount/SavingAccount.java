package bankaccount;

public class SavingAccount extends BankAccount {
    private boolean isActive;

    public SavingAccount(double balance, double annualInterestRate) {
        super(balance, annualInterestRate);
        isActive = super.getBalance() >= 25;
    }

    public void withdrawal(double amount) {
        if (super.getBalance() < 25) {
            System.out.println("Your balance is too low.");
            isActive = false;
        } else {
            super.withdrawal(amount);
        }

    }

    public void deposit(double amount) {
        super.deposit(amount);
        if (super.getBalance() >= 25) {
            System.out.println("your account is active");
            isActive = true;
        }
    }

    public void monthlyProcess() {
        if (super.getWithdrawal() > 4) {
            super.monthlyServiceCharge += 1;
        }
        if (super.getBalance() < 25) {
            System.out.println("the account is inactive. Your balance is less than 25$");
            isActive = false;

        }
    }
}
