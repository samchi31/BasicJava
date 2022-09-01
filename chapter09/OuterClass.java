package chapter09;

public class OuterClass {
	private int outerField;
	private InnerClass innerClass;
	public OuterClass() {
		
	}
	
	class InnerClass{
		private int innerField;
		public InnerClass() {
		}
		
		public int getInnerField() {
			return innerField;
		}
	}
	
	static class StaticInnerClass{
		private int staticinnerField;
		public StaticInnerClass() {
		}
		
		public int getInnerField() {
			return staticinnerField;
		}
	}
	
	public int getOutterField() {
		return outerField;
	}
	public void setOutterField() {
		
	}
}
