package chapter09;

public class OutterClass {
	private int outterField;
	private InnerClass innerClass;
	public OutterClass() {
		
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
		return outterField;
	}
	public void setOutterField() {
		
	}
}
