package chapter08.exercise;

public class SavingsAccount extends BankAccount {
	private double interestRate;
	private int balance;

	public SavingsAccount(int balance, double interestRate) {
		//super(balance);
		this.balance = balance;
		this.interestRate = interestRate;
	}

//	public void updateBalance(int period) {
//		super.deposit((int) (super.getBalance() * interestRate * period));
//	}

	@Override
	public String getAccountType() {
		return "저축예금";
	}

	@Override
	public String toString() {
		return "SavingsAccount [balance=" + balance + "]";
	}
	
	

}
