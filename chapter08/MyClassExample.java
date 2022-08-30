package chapter08;

public class MyClassExample {
	public static void main(String[] args) {
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		
		MyClass myClass2 = new MyClass(new Audio());
		
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());
	}
}
