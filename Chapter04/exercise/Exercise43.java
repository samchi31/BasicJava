package chapter04.exercise;

import java.util.Scanner;

public class Exercise43 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("성적 입력");
		System.out.print("프로그래밍 기초:");
		int basic = scanner.nextInt();
		System.out.print("데이터베이스:");
		int db = scanner.nextInt();
		System.out.print("화면구현:");
		int ui = scanner.nextInt();
		System.out.print("애플리케이션 구현:");
		int application = scanner.nextInt();
		System.out.print("머신러닝:");
		int machineLearning = scanner.nextInt();

		int total = basic + db + ui + application + machineLearning;
		double avg = (double) total / 5;
		
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
		
		switch ((int)avg/10) {
		case 10:
		case 9:
			System.out.println("학점: A");
			break;
		case 8:
			System.out.println("학점: B");
			break;
		case 7:
			System.out.println("학점: C");
			break;
		case 6:
			System.out.println("학점: D");
			break;
		default:
			System.out.println("학점: F");
			break;
		}

	}
}
