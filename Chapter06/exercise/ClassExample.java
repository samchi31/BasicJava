package chapter06.exercise;

public class ClassExample {
	public static void main(String[] args) {
		NewCar c1 = new NewCar("blue");
		System.out.println(c1.getColor());
		System.out.println(c1.getMaxSpeed());
		
		if(c1.speedUp(-100.0)) {
			System.out.println("가");
		} else {
			System.out.println("불");
		}
		
		if(c1.speedUp(210.0)) {
			System.out.println("가");
		} else {
			System.out.println("불");
		}
		
		if(c1.speedUp(100.0)) {
			System.out.println("가");
		} else {
			System.out.println("불");
		}
		System.out.println(c1.getSpeed());
		System.out.println(c1);
	}
}
