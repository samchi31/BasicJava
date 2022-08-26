package chapter07;

public abstract class Animal {	//추상클래스
	public String kind;
	
	public void breath() {
		System.out.println("숨쉰다");
	}
	public abstract void sound();
}
