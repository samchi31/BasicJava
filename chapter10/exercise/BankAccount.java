package chapter10.exercise;

public abstract class BankAccount {
	// private int balance;
	protected int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return this.balance;
	}

	/**
	 * 입금 메서드
	 * 
	 * @param amount 입금 금액
	 */
	public void deposit(int amount) {
		this.balance += amount;
	}

	/**
	 * 출금 메서드
	 * 
	 * @param amount 출금 금액
	 * @return 출금 성공 여부
	 */
	public boolean withdraw(int amount) {
		if (this.balance - amount <= 0) {
			return false;
		}
		this.balance -= amount;
		return true;
	}

	public boolean transfer(int amount, BankAccount otherAccount)
			throws NullPointerException, IllegalArgumentException {
//		if (withdraw(amount)) {
//			otherAccount.deposit(amount);
//			return true;
//		}
		if (this.balance - amount <= 0) {
			throw new IllegalArgumentException();
		}
		this.balance -= amount;
		otherAccount.deposit(amount);
		return true;
	}

	public String toString() {
		return "잔고:" + this.balance;
	}

	public abstract String getAccountType();
}
