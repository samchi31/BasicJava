package chapter05;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {
			System.out.println("12참조 같음");
		}
		else {
			System.out.println("12참조 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("12문자열 같음");
		}
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if(strVar3 == strVar4) {
			System.out.println("34참조 같음");
		}
		else {
			System.out.println("34참조 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("34문자열 같음");
		}
		
	}
}
