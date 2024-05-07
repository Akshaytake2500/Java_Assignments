package tester;

import java.util.Scanner;

import core.BankAccount;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account number");
		int accNo = sc.nextInt();
		System.out.println("Enter account holder name");
		String accName = sc.next();
		System.out.println("Enter account balance");
		double accBalance = sc.nextDouble();
		BankAccount account = new BankAccount(accNo, accName, accBalance);

		while (true) {
			System.out.println("1>Deposit 2>Withdraw 3>Current Balance");
			System.out.println("Enter your choice: ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter how much money you want to deposit");
				double depositAmount = sc.nextDouble();
				account.deposit(depositAmount);
				break;
			case 2:
				System.out.print("Enter the amount to withdraw: ");
				double withdrawAmount = sc.nextDouble();
				account.withdraw(withdrawAmount);
				break;
			case 3:
				account.checkBalance();
				break;
			default:
				break;
			}
		}
	}
}
