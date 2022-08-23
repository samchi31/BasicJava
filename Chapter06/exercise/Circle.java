package chapter06.exercise;

public class Circle {
	double radius;
	double x;
	double y;

	public Circle() {

	}

	public double getRadius() {
		return radius;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setRadius(int radius) {
		if(radius <= 0) {
			radius = 0;
		}
		this.radius = radius;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}

	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
}
