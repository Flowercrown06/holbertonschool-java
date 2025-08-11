package special_account;

import basic_account.exceptions.InvalidOperationException;

public class FeeBasedBankAccount extends BasicBankAccount {
    private int transactionCount;

    public FeeBasedBankAccount(String accountNumber, double annualInterestRate) {
        super(accountNumber, annualInterestRate);
        this.transactionCount = transactionCount;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    @Override
    public void deposit(double value) throws InvalidOperationException {
        super.deposit(value);
        transactionCount++;
        double newBalance= getBalance() - 0.10;
        setBalance(newBalance);
    }

    @Override
    public void withdraw(double value) throws InvalidOperationException {
        super.withdraw(value);
        transactionCount++;
        double newBalance= getBalance() - 0.10;
        setBalance(newBalance);
    }
}
