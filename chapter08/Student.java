package chapter08;

public class Student implements Comparable<Student> { // <T> Generic
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("Student [name=%s, age=%s]", name, age);
	}

	@Override
	public int compareTo(Student o) {
//		// age 기준 정렬
//		if (this.age > o.age) {
//			return 1;	//바꿀거면 양수
//		} else if (this.age < o.age) {
//			return -1;	//그대로면 음수
//		} else {
//			return 0;
//		}
		
		// name 기준 정렬
		return this.name.compareTo(o.name);
		//return -this.name.compareTo(o.name); 	//내림차순
	}
}
