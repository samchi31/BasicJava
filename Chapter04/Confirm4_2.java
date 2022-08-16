package Chapter04;

import java.util.Random;
import java.util.Scanner;

public class Confirm4_2 {
	public static void main(String[] args) {
//		int sum=0;
//		for(int i=1;i<=100;i++) {
//			if(i%3 == 0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);

//		Random random = new Random();
//		int x = 0;
//		int y = 0;
//		while (x + y != 5) {
//			x = random.nextInt(6) + 1;
//			y = random.nextInt(6) + 1;
//			//System.out.println("(" + x + "," + y + ")");
//		}
//		System.out.println("(" + x + "," + y + ")");

//		int x=0, y=0;		
//		for (x=1;x<=10;x++) {
//			for(y=1;y<=10;y++) {
//				if (4*x +5*y==60) {
//					System.out.println("(" + x + "," + y + ")");
//				}
//			}
//		}

//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.print("\n");
//		}

//		for (int i = 4; i > 0; i--) {
//			for (int j = i; j > 0; j--) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < 5 - i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

		boolean run = true;
		int balance = 0;
		int deposit = 0;
		int withdraw = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.print("선택 > ");
			int choice = scanner.nextInt();		//숫자타입, 문자타입 바꿔가며 입력받으면 버그생김

			switch (choice) {
			case 1:
				System.out.print("예금액 > ");
				deposit = scanner.nextInt();				
				break;
			case 2:
				System.out.print("출금액 > ");
				withdraw = scanner.nextInt();
				if (balance < withdraw) {
					System.out.print("출금실패");
					withdraw = 0;
				}
				break;
			case 3:
				System.out.println("잔고 > " + balance);
				break;
			case 4:
				//break loop;
				run = false;
				break;
			default:
				break;
			}			
			balance = deposit - withdraw;
		}
		System.out.println("종료");
	}
}
