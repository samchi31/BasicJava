package chapter09;

import chapter09.OutterClass.InnerClass;
import chapter09.OutterClass.StaticInnerClass;

public class OutterClassExample {
	public static void main(String[] args) {
		OutterClass outter = new OutterClass();
		InnerClass inner = outter.new InnerClass();
		
		InnerClass inner2 = new OutterClass().new InnerClass();
		
		StaticInnerClass staticInnerClass = new OutterClass.StaticInnerClass();
		
	}
}
