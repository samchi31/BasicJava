package chapter11;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVal1 = new String("신민철");
		String strVal2 = "신민철";
		
		if(strVal1 == strVal2) {
			System.out.println("같은객체참조");
		} else {
			System.out.println("다른객체참조");
		}
		
		if(strVal1.equals(strVal2)) {
			System.out.println("같은문자열");
		} else {
			System.out.println("다른문자열");
		}
	}
}
