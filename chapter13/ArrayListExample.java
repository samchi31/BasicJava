package chapter13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		// Generic 제네릭 <E>
		/*
		 * 클래스의 필드를
		 * Object로 타입을 선언시 객체 타입을 자유롭게 선언 가능하지만 
		 * 강제캐스팅해야하는 번거로움이 있다.
		 * <T> 를 써서 생성 시 객체타입을 받아서 T 타입으로 선언하여 사용
		 * 타입 안정성 측에서 좋다
		 * <T extends E>도 가능
		 */
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println(size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println(skill);
		System.out.println();
		
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			
			System.out.println(str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			
			System.out.println(str);
		}
	}
}
