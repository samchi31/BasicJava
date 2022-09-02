package chapter10;

import java.util.Random;
import java.util.Scanner;

public class UpDownGameWithException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Random random = new Random();
		int correctNum = random.nextInt(100)+1;
		boolean run = true;
		
		//System.out.println(correctNum);
		while (run) {
			try {
				System.out.print("1부터 100사이 정수 입력 :");
				int num = scanner.nextInt();
				
				if(correctNum < num) {
					throw new GreaterNumberException("더 큰 수를 입력함");
				} else if(correctNum > num) {
					throw new LessNumberException("더 작은 수를 입력함");
				}
				else {
					System.out.println("정답");
					System.out.println("게임 종료");
					break;
				}
			} /*catch (GreaterNumberException e) {
				//e.printStackTrace();
				System.out.println(e.getMessage());
			} catch (LessNumberException e) {
				//e.printStackTrace();
				System.out.println(e.getMessage());
			}*/
			catch (GreaterNumberException | LessNumberException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
