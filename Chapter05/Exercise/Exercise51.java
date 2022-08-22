package chapter05.Exercise;
//
public class Exercise51 {
	public static void main(String[] args) {
		int[] arr = new int[] { 39, 94, 16, 3, 76, 94, 82, 47, 59, 8 };

		int max = Integer.MIN_VALUE; //	int max = arr[0];	으로 내부값끼리 비교 가능
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (max <= arr[i]) {
				max = arr[i];
			}
			if (min >= arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최댓값:" + max + ",최솟값:" + min);
	}
}
