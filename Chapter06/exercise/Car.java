package chapter06.exercise;

public class Car {
	private double speed;
	private String color;
	// TODO 나중에 해야할 일
	private static final double MAX_SPEED = 200.0;

	public Car() {

	}

	public Car(String color) {
		this.color = color;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean speedUp(double speed) {
//		if (this.speed + speed < 0 || this.speed + speed > MAX_SPEED) {
//			return false;
//		} else {
//			this.speed += speed;
//			return true;
//		}
		double newSpeed = this.speed + speed;
		if(newSpeed > MAX_SPEED || newSpeed <0) {
			return false;
		}
		else {
			this.speed = newSpeed; 
			return true;
		}
	}

	public static double getMaxSpeed() {
		return MAX_SPEED;
	}

	public String toString() {
		return String.format("현재속력 %.2f이고 %s 색 자동차", speed, color);
	}
}
