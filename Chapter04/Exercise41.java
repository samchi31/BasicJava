package Chapter04;

import java.util.Scanner;

public class Exercise41 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("삼각형 첫번째 변 길이 입력:");
		int firstNum = scanner.nextInt();
		System.out.print("삼각형 두번째 변 길이 입력:");
		int secondNum = scanner.nextInt();
		System.out.print("삼각형 세번째 변 길이 입력:");
		int thirdNum = scanner.nextInt();

		if (firstNum <= secondNum + thirdNum 
				|| secondNum <= firstNum + thirdNum 
				|| thirdNum <= secondNum + firstNum) {
			System.out.println("삼각형 가능");
		} else {
			System.out.println("삼각형 불가능");
		}
	}

}
