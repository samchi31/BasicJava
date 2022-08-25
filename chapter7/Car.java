package chapter7;

public class Car {
	Tire frontLeft= new Tire("앞왼쪽",6);
	Tire frontRight= new Tire("앞오른쪽",2);
	Tire backLeft= new Tire("뒷왼쪽",3);
	Tire backRight= new Tire("뒷오른쪽",4);
	
	int run() {
		System.out.println("자동차 달림");
		if(frontLeft.roll()==false) {
			stop();	return 1;
		}
		if(frontRight.roll()==false) {
			stop();	return 2;
		}
		if(backLeft.roll()==false) {
			stop();	return 3;
		}
		if(backRight.roll()==false) {
			stop();	return 4;
		}
		return 0;
	}
	
	void stop() {
		System.out.println("자동차 멈춤");
	}
}
