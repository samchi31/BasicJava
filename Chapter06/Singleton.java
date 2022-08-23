package chapter06;

public class Singleton {
	// 하나만 주소 할당
	private static Singleton instance = new Singleton();
	
	// 외부에서 new 로 호출 못하게
	private Singleton() {
	}
	
	//외부에서 객체생성없이 메소드 접근 가능
	public static Singleton getInstance() {
		return instance;
	}
}
