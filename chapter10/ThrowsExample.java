package chapter10;

public class ThrowsExample {
	public static void main(String[] args) /*throws ClassNotFoundException*/ {
		try {
			method1();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void method1() throws ClassNotFoundException {
		Class.forName("java.lang.String");
	}
}
