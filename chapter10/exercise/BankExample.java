package chapter10.exercise;

public class BankExample {
	public static void main(String[] args) {
		CheckingAccount tonyAccount = new CheckingAccount(3000);
		CheckingAccount steveAccount = new CheckingAccount(4000);	
		
		try {
			tonyAccount.transfer(5000, steveAccount);
			System.out.println("송금완료");
		} catch(NullPointerException e) {
			System.out.println("해당 계좌 없음");
			System.out.println("송금실패");
		}catch(IllegalArgumentException e) {
			System.out.println("해당 금액 보낼수 없음");
			System.out.println("송금실패");
		}
		
		
		try {
			tonyAccount.transfer(2000, null);
			System.out.println("송금완료");
		} catch(NullPointerException e) {
			System.out.println("해당 계좌 없음");
			System.out.println("송금실패");
		}catch(IllegalArgumentException e) {
			System.out.println("해당 금액 보낼수 없음");
			System.out.println("송금실패");
		}
	}
}
