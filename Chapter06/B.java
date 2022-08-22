package chapter06;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;	// default 같은 패키지이므로 접근 가능
		//a.field3 = 1;	// private 접근 불가
		
		a.method1();
		a.method2();
		//a.method3();
	}
}
