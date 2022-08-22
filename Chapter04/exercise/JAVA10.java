package chapter04.exercise;

public class JAVA10 {
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		int result = 0;
		
		while (tmp != 0) {
			result = Integer.parseInt(""+ result +tmp % 10);
			tmp /= 10;				
			//System.out.println(result);
		}
		
		if (number == result)
			System.out.println(number + "는 회문수");
		else
			System.out.println(number + "는 회문수 아님");
	}
}
