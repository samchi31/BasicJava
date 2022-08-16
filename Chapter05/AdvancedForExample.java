package Chapter05;

public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = { 95,71,84,93,87};
		
		int sum =0;
		// 향상된 for문 : foreach
		for(int score : scores) {
			sum +=score;
		}
		System.out.println("총합 : "+ sum);
		
	}
}
