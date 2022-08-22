package chapter03;

import java.util.Scanner;

class ConditionalOperationExample {

	public static void main(String[] args) {

		int score = 85;
		char grade = score > 90 ? 'A' : (score > 80 ? 'B' : 'C');
		System.out.println(score + ":" + grade);

		Scanner scanner = new Scanner(System.in);
		System.out.println("점수: ");
		score = scanner.nextInt();
		grade = score > 90 ? 'A' : 
			(score > 80 ? 'B' : 
				(score > 70 ? 'C' : 
					(score > 60 ? 'D' : 'F')));
		System.out.println(score + ":" + grade);
		
	}

}
