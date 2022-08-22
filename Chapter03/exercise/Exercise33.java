package chapter03.exercise;

import java.util.Scanner;

public class Exercise33 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("윤년인지 확인할 연도 입력 : ");
		int year = scanner.nextInt();
		
		String result = (year % 4 ==0 && year % 100 !=0) || year % 400 == 0 ? "윤년" : "윤년아님";
		
		System.out.println(result);

	}

}
