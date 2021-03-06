package com.bankDetail;

import java.util.Scanner;

public class AccountDetails {

	public Account getAccountDetails(int accountId, String accountType, int balance) {

		Account a = new Account();
		a.setAccountId(accountId);
		a.setAccountType(accountType);
		a.setBalance(balance);

		return a;

	}

	public int getWithdrawAmount(int widAmount) {
		if (widAmount <= 0) {
			return 0;
		} else {
			return widAmount;
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter accountId");
		int accountId = s.nextInt();
		System.out.println("AccountId: " + accountId);
		System.out.println("Enter account type");
		String accountType = s.next();
		System.out.println("account type: " + accountType);
		System.out.println("Enter balance");
		int balance = 0;
		while (balance <= 0) {
			balance = s.nextInt();
			if (balance <= 0) {
				System.out.println("Balance should be positive");
			}
		}
		System.out.println("Enter balance: " + balance);
		System.out.println("Enter amout to be withdrawn");
		int withdrawn = 0;
		while (withdrawn <= 0) {
			withdrawn = s.nextInt();
			if (withdrawn <= 0) {
				System.out.println("Amount should be positive");
			}
		}
		
		s.close();
		System.out.println("Enter amount to be withdrawn: " + withdrawn);

		AccountDetails ad = new AccountDetails();
		Account a = ad.getAccountDetails(accountId, accountType, balance);

		int widAmount = ad.getWithdrawAmount(withdrawn);

		if (a != null) {
			boolean check = a.withdraw(widAmount);
			if (check == false) {
				System.out.println("Sorry!!! No enough balance");
			}

		}

	}
}
