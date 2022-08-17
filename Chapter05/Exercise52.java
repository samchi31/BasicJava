package Chapter05;

import java.util.Random;

public class Exercise52 {
	public static void main(String[] args) {
		int[] arr = new int[6];

		Random random = new Random();

		for (int i = 0; i < arr.length; i++) {
			int num = random.nextInt(45) + 1;
			arr[i] = num;
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
//					arr[i] = random.nextInt(45) + 1;
					i--;
				}
			}
			
//			System.out.println("로또번호" + (i + 1) + " : " + arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println("로또번호" + (i + 1) + " : " + arr[i]);
		}

	}
}
