package chapter06;

public class Car {
	// 필드
	String company = "현대자동차";
	String model;// = "그랜저";
	String color;// = "검정";
	int maxSpeed;// = 350;
	int gas;
	private int speed; // 초기값이 없지만 객체 생성 시 자동으로 default 초기값 삽입
	private boolean stop;

	// 생성자
	Car() {
	}

	Car(String model) {
		this(model, "은색", 250);
	}

	Car(String model, String color) {
		this(model, color, 250);
	}

	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	// 메소드
	void setGas() {
		this.gas = gas;
	}

	boolean isLeftGas() {
		return false;
	}

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다" + gas);
				gas--;
			} else {
				System.out.println("멈춥니다" + gas);
				return; // 메소드 종료 시킬 때 사용
			}
		}
	}

	// getter setter
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
