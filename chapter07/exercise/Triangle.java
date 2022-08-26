package chapter07.exercise;

public class Triangle extends Shape {
	private double side;
	
	public Triangle(double side) {
		this.side = side;
	}
	
	@Override
	public double area() {
		return this.side * this.side * Math.sqrt(3) / 4;
	}
	@Override
	public double perimeter() {
		return 3 * this.side;
	}
	public String toString() {
		return "삼각형:"+this.perimeter()+", "+this.area();
	}
}
