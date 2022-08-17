package Chapter05;

import java.util.Random;
import java.util.Scanner;

enum RockScissorPaper {
	ROCK, SCISSOR, PAPER
//	ROCK("바위", 0), SCISSOR("가위", 1), PAPER("보", 2);
//
//	RockScissorPaper(String str, int num) {
//		this.str = str;
//		this.num = num;
//	}
//
////	RockScissorPaper(int num) {
////		this.num = num;
////		if (num == 0) {
////			this.str = "바위";
////		} else if (num == 1) {
////			this.str = "가위";
////		} else if (num == 2) {
////			this.str = "보";
////		}
////	}
////	
////	RockScissorPaper(String str) {
////		this.str = str;
////		if (str.equals("바위")) {
////			this.num = 0;
////		} else if (str .equals("가위")) {
////			this.num = 1;
////		} else if (str.equals("보")) {
////			this.num = 2;
////		}
////	}
//
//	String str = "바위";
//	int num = 0;
}

public class Exercise53 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("가위바위보 입력 : ");
		String str = scanner.nextLine();
		
		Random random = new Random();
		int rand = random.nextInt(3);
		String[] arrStr = new String[] {"가위","바위","보"};
		
		

		String result = "";
		if (str.equals(arrStr[rand])) {
			result = "비김";
		} else if ((str.equals("바위") && arrStr[rand].equals("가위"))
				|| (str.equals("가위") && arrStr[rand].equals("보"))
				|| (str.equals("보") && arrStr[rand].equals("바위"))) {
			result = "user 이김";
		} else {
			result = "com 이김";
		}

		System.out.println("user : " + str);
		System.out.println("com : " + arrStr[rand]);
		System.out.println(result);

	}
}
