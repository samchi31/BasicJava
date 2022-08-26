package chapter07.exercise;

public class BankAccount {
	//private int balance;
	protected int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return this.balance;
	}

	public void deposit(int amount) {
		this.balance += amount;
	}

	public boolean withdraw(int amount) {
		if (this.balance - amount <= 0) {
			return false;
		}
		this.balance -= amount;
		return true;
	}

	public boolean transfer(int amount, BankAccount otherAccount) {
		if (this.balance - amount <= 0) {
			return false;
		}
		this.balance -= amount;
		otherAccount.deposit(amount);
		return true;
	}
	
	public String toString() {
		return "잔고:"+this.balance;
	}
}
