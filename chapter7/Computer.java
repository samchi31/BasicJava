package chapter7;

public class Computer extends Calculator {
	@Override
	public double areaCircle(double r) {
		System.out.println(super.name);
		super.areaCircle(r);
		System.out.println("Computer 객체 areaCircle()");
		return Math.PI * r * r;
	}
}
