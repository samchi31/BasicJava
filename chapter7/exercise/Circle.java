package chapter7.exercise;

public class Circle extends Shape {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return this.radius * this.radius * Math.PI;
	}
	@Override
	public double perimeter() {
		return 2 * Math.PI * this.radius;
	}
	public String toString() {
		return "원:"+this.perimeter()+", "+this.area();
	}
}

