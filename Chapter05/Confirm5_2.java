package Chapter05;

import java.util.Arrays;
import java.util.Scanner;

public class Confirm5_2 {
	public static void main(String[] args) {
//		int max = 0;
//		int[] array = { 1, 5, 3, 8, 2 };
//
//		for (int i : array) {
//			if (max <= i) {
//				max = i;
//			}
//		}
//		
//		System.out.println(max);
		
//		int min = Integer.MAX_VALUE;
//		int[] array = { 1, 5, 3, 8, 2 };
//
//		for (int i : array) {
//			if (min >= i) {
//				min = i;
//			}
//		}
//		
//		System.out.println(min);

//		int[][] array = {
//				{95, 86},
//				{83, 92, 96},
//				{78, 83, 93, 87, 88}
//		};
//		
//		int sum =0;
//		double avg = 0.0;
//		int count = 0;
//		for (int[] arr1 : array) {
//			for (int arr2 : arr1) {
//				sum += arr2;
//				count++;
//			}
//		}
//		
//		avg = (double)sum/(array[0].length + array[1].length + array[2].length);
//		avg = (double)sum/count;		
//		System.out.println(sum);
//		System.out.println(avg);

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.print("선택>");

			//int selectNo = Integer.parseInt(scanner.nextLine()); 
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				System.out.print("학생 수>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]>");	
					scores[i] = scanner.nextInt();
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
			} else if (selectNo == 4) {
				int max =0;
				int sum =0;
				double avg =0;
				for (int score : scores) {
					if(max<=score) {
						max = score;
					}
					sum += score;
				}
				avg = (double)sum / scores.length;
				System.out.println("최고점수 : " + max);
				System.out.println("평균점수 : " + avg);
			} else if (selectNo == 5) {
				run = false;
			}
			
		}
		System.out.println("종료");

	}
}
