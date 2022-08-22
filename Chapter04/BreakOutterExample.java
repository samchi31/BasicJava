package chapter04;

import java.util.Scanner;

public class BreakOutterExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("멈출 단 입력:");
		int dan = scanner.nextInt();

		Outter:for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (dan+1 == i) {
					//break;		//for 문 한번만 나감
					break Outter;
				}
				
				System.out.println(i + "*" + j + "=" + i * j);
				
			}
		}
	}
}
