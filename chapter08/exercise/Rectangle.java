package chapter08.exercise;

public class Rectangle extends Shape {
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double area() {
		return width * height;
	}

	@Override
	public double perimeter() {
		return 2 * (width + height);
	}

	@Override
	public String toString() {
		return String.format("Rectangle [area()=%.2f , perimeter()=%.2f", area(),perimeter());
	}	

}
