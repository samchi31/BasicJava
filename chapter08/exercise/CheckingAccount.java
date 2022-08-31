package chapter08.exercise;

public class CheckingAccount extends BankAccount{
	private int balance;
	private SavingsAccount protectedBy;
	
	public CheckingAccount(int balance) {
		//super(balance);
		this.balance = balance;
	}
	
	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		//super(balance);
		this.balance = balance;
		this.protectedBy = protectedBy;
	}
	
	@Override
	public String getAccountType() {
		return "당좌예금";
	}

	@Override
	public String toString() {
		return "CheckingAccount [balance=" + balance + "]";
	}
	

}
