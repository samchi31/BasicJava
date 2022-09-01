package chapter09;

import chapter09.OuterClass.InnerClass;
import chapter09.OuterClass.StaticInnerClass;

public class OuterClassExample {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		InnerClass inner = outer.new InnerClass();
		
		InnerClass inner2 = new OuterClass().new InnerClass();
		
		StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
		
	}
}
