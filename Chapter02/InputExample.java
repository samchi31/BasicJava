package Chapter02;

import java.util.Scanner;

public class InputExample {

	public static void main(String[] args) {

		// new Scanner() 입력 후 ctrl + 1
		Scanner scanner = new Scanner(System.in);
		// ctrl + shift + c 또는 ctrl + / => 한줄주석
		// ctrl + shift + / => 여러줄 주석
		/*
		 * int inputNum = scanner.nextInt(); // 콘솔에서 입력한 숫자 변수에 저장
		 * 
		 * double inputDouble = scanner.nextDouble();
		 * 
		 * System.out.println("첫번째 숫자: " + inputNum); System.out.println("두번째 숫자: " +
		 * inputDouble);
		 */
		System.out.println("이름 입력 : ");
		String inputName = scanner.next();

		System.out.println("당신 이름 : " + inputName + "입니다.");

		scanner.close();
	}

}
