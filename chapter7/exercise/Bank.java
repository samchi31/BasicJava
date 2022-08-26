package chapter7.exercise;

public class Bank {
	private Customer[] customers;
	private int numberOfCustomers;
	
	public Bank() {
		customers = new Customer[10];
	}

	public void addCustomer(Customer customer) {
		customers[numberOfCustomers] = customer;
		numberOfCustomers++;
	}
	
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	
	public Customer[] getCustomers() {
		return customers;
	}
	
	public Customer getCustomer(int num) {
		return customers[num];
	}
	
}
