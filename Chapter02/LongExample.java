package Chapter02;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 =20L;
		//long var3 = 1000000000000;		// int 타입으로 인식 -> 범위 over 에러
		//long var3 = 1_000_000_000_000; 	// 언더 바 숫자에 보기 편하게 표시 가능 컴파일 상관 x
		long var4 = 1000000000000L;		// java에서는 L 로 long 타입인지 알려줘야함
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		
		
	}

}
