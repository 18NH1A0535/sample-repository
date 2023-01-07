package com.capg;

public class Bank {
	private int accountNumber;
	private String customerName;
	private int balance;
	private int withdrawal;
	private boolean accountStatus;
	public Bank() {}
	public Bank(int accountNumber, String customerName, int balance, int withdrawal, boolean accountStatus) {
	    super();
	    this.accountNumber = accountNumber;
	    this.customerName = customerName;
	    this.balance = balance;
	    this.withdrawal = withdrawal;
	    this.accountStatus = accountStatus;
	}
	public int getAccountNumber() {
	    return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
	    this.accountNumber = accountNumber;
	}
	public String getCustomerName() {
	    return customerName;
	}
	public void setCustomerName(String customerName) {
	    this.customerName = customerName;
	}

	public void setBalance(int balance) {
		if(this.accountStatus==false) {
	        System.out.println("Cannot withdraw , account inactive");
	        this.balance = balance;
	    }
	    else {

	    this.balance=balance-this.withdrawal;
	    }
	}
	public int getBalance() {
	    
	    return this.balance;
	}
	public int getWithdrawal() {
	    return withdrawal;
	}
	public void setWithdrawal(int withdrawal) {
	    this.withdrawal = withdrawal;
	}
	public boolean getAccountStatus() {
	    return accountStatus;
	}
	public void setAccountStatus(boolean accountStatus) {
	    this.accountStatus = accountStatus;
	}
	@Override
	public String toString() {
	    return "Bank [accountNumber=" + accountNumber + ", customerName=" + customerName + ", balance=" + balance
	            + ", withdrawal=" + withdrawal + ", accountStatus=" + accountStatus + "]";
	} 
	  
	  
	}

