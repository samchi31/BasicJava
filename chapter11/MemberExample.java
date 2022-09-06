package chapter11;

public class MemberExample {
	private String id;
	private String name;
	public MemberExample(String id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return String.format("%s : %s", id, name);
	}
	
	
}
