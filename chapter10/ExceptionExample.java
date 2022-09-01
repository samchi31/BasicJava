package chapter10;

import java.util.Scanner;

import chapter08.Student;

public class ExceptionExample {
	public static void main(String[] args) {
		// 1. 일반 예외
		try {
			Class.forName("java.iang.String");
		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
			System.out.println("입력클래스 존재 안함");
		}
		
		// 2. 실행 예외
		Student student = null;
		student.compareTo(new Student("홍길동",10));
		
		// 3. 자원 반환 try catch		alt + shift + z
		try (Scanner scanner = new Scanner(System.in)) {
			
		}
		
	}
}
