package chapter03.exercise;

import java.util.Scanner;

public class Exercise31 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째숫자: ");
		int firstNum = scanner.nextInt();
		System.out.print("두번째숫자: ");
		int secondNum = scanner.nextInt();
		
		int bigNum = ((firstNum + secondNum) + Math.abs(firstNum - secondNum))/2;
		int smallNum = ((firstNum + secondNum) - Math.abs(firstNum - secondNum))/2;
		
		System.out.printf("몫 : %d, 나머지 : %d",bigNum/smallNum,bigNum%smallNum);

	}

}
