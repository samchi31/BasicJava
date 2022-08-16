package Chapter04;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Random random = new Random();
		int correctNum = random.nextInt(100)+1;
		boolean run = true;
		
		//System.out.println(correctNum);
		while (run) {
			System.out.print("1부터 100사이 정수 입력 :");
			int num = scanner.nextInt();
			
			if(correctNum < num) {
				System.out.println("정답은 더 작은 수");
			} else if(correctNum > num) {
				System.out.println("정답은 더 큰 수");
			}
			else {
				System.out.println("정답");
				System.out.println("게임 종료");
				break;
			}
		}
	}
}
