package chapter05.Exercise;

import java.util.Random;

public class Exercise54 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] arr = new int[10000];
		int i = 0;
		int[] count = new int[6];
		while (i < 10000) {
			arr[i] = random.nextInt(6);
			count[arr[i]]++;
			i++;
		}
//		for(int j=0;j<10000;j++) {
//			count[random.nextInt(6)]++;
//		}
		System.out.println("면\t빈도\n");
		for(int j=0;j<count.length;j++) {
			System.out.println((j+1)+"\t"+count[j]);
		}
	}
}
