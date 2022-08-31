package chapter08.exercise;

public class BankTest {
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		Customer customer1 = new Customer("Tony", "Stark");
		SavingsAccount customer1SavingsAccount = new SavingsAccount(2000, 0.01);
		customer1.addAccount(customer1SavingsAccount);
		customer1.addAccount(new CheckingAccount(3000, customer1SavingsAccount));
		bank.addCustomer(customer1);
		
		Customer customer2 = new Customer("Peter", "Parker");
		customer2.addAccount(new CheckingAccount(2000));
		bank.addCustomer(customer2);
		
		Customer customer3 = new Customer("Steve", "Rogers");
		SavingsAccount customer3SavingsAccount = new SavingsAccount(2000, 0.03);
		customer3.addAccount(customer3SavingsAccount);
		customer3.addAccount(new CheckingAccount(1000, customer3SavingsAccount));
		bank.addCustomer(customer3);
		
		System.out.println();
		printCustomers(bank.getCustomers());
	}
	private static void printCustomers(Customer[] customers) {
		for (Customer customer : customers) {
			if(customer != null) {
				//System.out.println("["+customer+"]"+"계좌의수:"+customer.getNumberOfAccounts());
				System.out.println(customer);
				for(int i=0;i<customer.getNumberOfAccounts();i++) {
					System.out.println("계좌종류:"+ customer.getAccount(i).getAccountType() 
							+ " 잔고: "+customer.getAccount(i));
				}
				System.out.println();
			}
		}
	}
	
}
