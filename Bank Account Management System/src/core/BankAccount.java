package core;

public class BankAccount {
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	public BankAccount(int accountNumber, String accountHolderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", balance="
				+ balance + "]";
	}	
	
	public void withdraw(double amt) {
		if (amt > 0 && amt <= getBalance()) {
			amt -= getBalance();
			System.out.println("Withdrawal of Rs " + amt + " successful.");
		} else {
			System.out.println("Limit Exceeds!!!");
		}
	}

	public void deposit(double amt) {
		if (amt > 0) {
			balance += amt;
			System.out.println("Deposit of $" + amt + " successful.");
		} else {
			System.out.println("Insufficient funds or invalid withdrawal amount.");
		}
	}
	
	public void checkBalance() {
		System.out.println("Current Balance: "+balance);
	}
}
