package Chapter04;

import java.util.Scanner;

public class Exercise44_test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위바위보 게임");
		System.out.print("철수 :");
		String player1 = scanner.next();
		System.out.print("영희 :");
		String player2 = scanner.next();

		if ((player1.equals("가위") && player2.equals("바위")) 
				|| (player1.equals("바위") && player2.equals("보"))
				|| (player1.equals("보") && player2.equals("가위"))) {
			System.out.println("결과 : 영희 승리");
		} else if((player1.equals("바위") && player2.equals("가위")) 
				|| (player1.equals("보") && player2.equals("바위"))
				|| (player1.equals("가위") && player2.equals("보"))) {
			System.out.println("결과 : 철수 승리");
		}
		else {
			System.out.println("결과 : 무승부");
		}
		//정답
		if(player1.equals(player2)) {
			//무승부
		}
		else if((player1.equals("가위") && player2.equals("바위")) 
				|| (player1.equals("바위") && player2.equals("보"))
				|| (player1.equals("보") && player2.equals("가위"))) {
			//영희 승리
		}
		else {
			//철수 승리
		}

	}

}
