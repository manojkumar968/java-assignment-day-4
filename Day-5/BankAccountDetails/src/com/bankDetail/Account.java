package com.bankDetail;

public class Account {

	private int accountId;
	private String accountType;
	private int balance;
	
	void setAccountId(int accountId) {
		this.accountId=accountId;
	}
	
	int getAccountId() {
		return accountId;
	}
	
	void setAccountType(String accountType) {
		this.accountType=accountType;
	}
	
	String getAccountType() {
		return accountType;
	}
	
	void setBalance(int balance) {
		this.balance=balance;
	}
	
	int getBalance() {
		return balance;
	}
	public boolean withdraw(int wid) {
		if(wid>0&&wid<=balance) {
			balance-=wid;
			System.out.println("Balance amount after withdraw: "+balance);
			return true;
		}
		else {
			return false;
		}
	}
}
