package chapter07.exercise;

public class Customer {
	private String firstName;
	private String lastName;
	//private BankAccount account;
	private BankAccount[] account;
	private int numberOfAccount;

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		account = new BankAccount[5];
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public BankAccount getAccount(int num) {
		return account[num];
	}

//	public void setAccount(BankAccount account) {
//		this.account = account;
//	}
	
	public void addAccount(BankAccount account) {
		this.account[numberOfAccount] = account;
		numberOfAccount++;
	}
	
	public int getNumberOfAccounts() {
		return numberOfAccount;
	}

	public String toString() {
		//return firstName + lastName + " : " + account.getBalance();
		return firstName + lastName + ", 계좌 갯수 : " + numberOfAccount;
	}

}
