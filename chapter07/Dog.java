package chapter07;

public class Dog extends Animal{
	public Dog() {
		this.kind = "포유류";
	}
	//추상 클래스를 override 해야한다.
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
