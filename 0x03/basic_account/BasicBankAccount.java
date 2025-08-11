package basic_account;

import basic_account.exceptions.InvalidOperationException;

public class BasicBankAccount {
    private String accountNumber;
    private double balance;
    private double annualInterestRate;

    public BasicBankAccount(String accountNumber, double annualInterestRate) {
        this.accountNumber = accountNumber;
        this.annualInterestRate = annualInterestRate;
        this.balance= 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void deposit(double value) throws InvalidOperationException {
        if(value>=0){
            balance+=value;
        }else{
            throw new InvalidOperationException("Deposit amount must be greater than 0");
        }
    }
    public void withdraw(double value) throws InvalidOperationException {
        if (value <= 0) {
            throw new InvalidOperationException("Withdrawal amount must be greater than 0");
        }
        if (value > balance) {
            throw new InvalidOperationException("Withdrawal amount must be less than the current balance");
        }
        balance -= value;
    }

    public double calculateMonthlyFee(){
        return Math.min(10.00, balance * 0.10);
    }

    public double calculateMonthlyInterest(){
        if (balance < 0) {
            return 0.0;
        }
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        return balance * monthlyInterestRate;
    }
    public void applyMonthlyUpdate(){
        balance= balance - calculateMonthlyFee() + calculateMonthlyInterest();
    }


}
