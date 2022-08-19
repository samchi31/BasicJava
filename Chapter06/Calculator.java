package Chapter06;

public class Calculator {
	void powerOn() {
		System.out.println("전원 켜기");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
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
