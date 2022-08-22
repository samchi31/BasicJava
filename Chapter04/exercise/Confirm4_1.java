package chapter04.exercise;

import java.util.Scanner;

public class Confirm4_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수 : ");
		int score = scanner.nextInt();
		System.out.print("등급 : ");
		
		switch (score/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
			break;
		}
	}
}
