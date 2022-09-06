package chapter11;

public class WrapperExample {
	public static void main(String[] args) {
		int a = 10; // 기본타입
		Integer b = 100; // 참조타입 자동 박싱 Integer b = new Integer(100);

		long start = System.nanoTime();
		Integer sum = 0;
//		int sum = 0;
		for (int i = 1; i <= 100000; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		long end = System.nanoTime();
		
		System.out.println(end - start);
	}
}
