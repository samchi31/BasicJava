package chapter7.exercise;

public class CheckingAccount extends BankAccount {
	private SavingsAccount protectedBy;

	public CheckingAccount(int balance) {
		super(balance);
	}

	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}

	@Override
	public boolean withdraw(int amount) {
		int money = super.balance - amount;
		if (money <= 0) {
			super.balance = 0;
			protectedBy.withdraw(Math.abs(money));
			return false;
		}
		super.balance -= amount;
		return true;
	}
}
