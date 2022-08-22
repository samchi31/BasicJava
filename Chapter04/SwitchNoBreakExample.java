package chapter04;

import java.util.Random;

public class SwitchNoBreakExample {
	public static void main(String[] args) {
		Random random = new Random();
		int time = random.nextInt(4)+8;
		System.out.println("[현재 시각: "+time + "시]");
		
		switch (time) {
		case 8:
			System.out.println("출근");
		case 9:
			System.out.println("회의");
		case 10:
			System.out.println("업무");
			break;
		default:
			System.out.println("외근");
			break;
		}
	}
}
