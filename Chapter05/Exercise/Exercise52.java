package chapter05.Exercise;

import java.util.Random;

public class Exercise52 {
	public static void main(String[] args) {
		int[] arr = new int[6];

		Random random = new Random();
		// 첫번째 방법 : 랜덤 뽑고나서 이전에 뽑은 숫자들과 비교해서 중복 값이면 다시 뽑기
//		for (int i = 0; i < arr.length; i++) {
//			int num = random.nextInt(45) + 1;
//			arr[i] = num;
//			for (int j = 0; j < i; j++) {
//				if (arr[j] == arr[i]) {
//					//arr[i] = random.nextInt(45) + 1;
//					i--;
//				}
//			}			
//			//System.out.println("로또번호" + (i + 1) + " : " + arr[i]);
//		}

		// 두번째 방법 : 1~45 배열을 만들고 순서를 랜덤으로 섞어서 배열앞에서부터 6자리 뽑기
		int[] lotto = new int[45];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}
		for (int i = 0; i < lotto.length; i++) {
			int num = random.nextInt(45);
			int tmp;
			tmp = lotto[num];
			lotto[num] = lotto[i];
			lotto[i] = tmp;
		}

//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("로또번호" + (i + 1) + " : " + arr[i]);
//		}
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.println("로또번호" + (i + 1) + " : " + lotto[i]);
		}

	}
}
