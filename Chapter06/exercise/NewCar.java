package chapter06.exercise;

public class NewCar {
	private double speed;
	private String color;
	private static final double MAX_SPEED = kiloToMile(200.0);

	public NewCar() {

	}

	public NewCar(String color) {
		this.color = color;
	}

	public double getSpeed() {
		return mileToKilo(speed);
	}

	public void setSpeed(double speed) {
		this.speed = kiloToMile(speed);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean speedUp(double speed) {
		speed = kiloToMile(speed);
		if (this.speed + speed < 0 || this.speed + speed > MAX_SPEED) {
			return false;
		} else {
			this.speed += speed;
			return true;
		}
	}

	public static double getMaxSpeed() {
		return mileToKilo(MAX_SPEED);
	}

	// 1mile = 1.6kilo
	private static double kiloToMile(double kilo) {
		return kilo * 1.6;
	}

	private static double mileToKilo(double mile) {
		return mile / 1.6;
	}

	public String toString() {
		return String.format("현재속력 %.2f이고 %s 색 자동차", mileToKilo(speed), color);
	}
}
