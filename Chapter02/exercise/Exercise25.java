package chapter02.exercise;

import java.util.Scanner;

public class Exercise25 {

	public static void main(String[] args) {
		// #4

		Scanner scanner = new Scanner(System.in);

		System.out.print("500원 갯수 : ");

		int countFiveHundred = scanner.nextInt();

		System.out.print("100원 갯수 : ");

		int countOneHundred = scanner.nextInt();

		System.out.print("50원 갯수 : ");

		int countFifty = scanner.nextInt();

		System.out.print("10원 갯수 : ");

		int countTen = scanner.nextInt();

		int money = 500 * countFiveHundred + 100 * countOneHundred + 50 * countFifty + 10 * countTen;

		System.out.println("저금통 동전 총 액수 : " + money);

	}

}
