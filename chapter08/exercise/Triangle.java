package chapter08.exercise;

public class Triangle extends Shape{
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

	@Override
	public String toString() {
		return String.format("Triangle [area()=%.2f , perimeter()=%.2f", area(),perimeter());
	}

}
