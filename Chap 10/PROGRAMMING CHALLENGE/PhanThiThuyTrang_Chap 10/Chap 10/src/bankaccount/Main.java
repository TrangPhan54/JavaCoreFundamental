package bankaccount;

public class Main {
    public static void main(String[] args) {
        BankAccount  bankAccount = new SavingAccount(200,1.5);
        System.out.println("balance: $"+bankAccount.getBalance()+"\ninterest rate: "+bankAccount.getAnnualInterestRate()+"\ndeposit: $"
                +bankAccount.getAnnualInterestRate()+"\nwithdrawal:$"+bankAccount.getWithdrawal());
    }
}
