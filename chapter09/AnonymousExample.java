package chapter09;

import chapter08.Vehicle;

public class AnonymousExample {
	public static void main(String[] args) {
//		Vehicle v = new Vehicle() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
//		v.run();
		
		new Vehicle() {			
			@Override
			public void run() {
				System.out.println("자동차 달림");
			}
		}.run();
	}
}
