package com.raulminon.syncapp;

public class Customer implements Runnable {

	@Override
	public void run() {
		Bank bank = Bank.getInstance();
		BankAccount account = bank.getAccount(123456);
		// obtain a lock on the account before performing operations
		synchronized (account) {
			account.deposit(100);
			account.withdraw(200);
		}
	}
	
	
}
