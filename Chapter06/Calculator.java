package chapter06;

public class Calculator {
	//정적 필드
	//필드에 static 붙이면 보안에 위험하니 최대한 자제
	static double pi = 3.141592;
	
	void powerOn() {
		System.out.println("전원 켜기");
	}
	
	//정적 메소드
	//정적 메소드 안에 this, 인스턴스 필드, 메서드 사용 불가
	static int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	static int minus(int x, int y) {
		return x-y;
	}
	
	static int multiply(int x, int y) {
		return x*y;
	}
	
	double divide(int x, int y) {
		double result = (double)x + (double)y;
		return result;
	}
	
	double avg(int x, int y) {
		return (double)(x+y)/2;
	}
	
	void execute() {
		double result = avg(7,10);
		System.out.println("실행결과:"+result);
	}
	
	void powerOff() {
		System.out.println("전원 끄기");
	}
}
