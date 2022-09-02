package chapter10.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isRun = true;
		while (isRun) {
			try {
				System.out.println("어떤 수로 나누시겠습니까 >");
				int num1 = Integer.parseInt(scanner.nextLine());
				
				System.out.println("어떤 수를 나누시겠습니까 >");
				int num2 = Integer.parseInt(scanner.nextLine());

				System.out.println(num1 + "/" + num2 + " = " + num1 / num2);
				break;
			} catch (NumberFormatException e) {
				System.out.println("잘못된 입력. 다시 입력");
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌수 없다");
			}
		}
	}
}
