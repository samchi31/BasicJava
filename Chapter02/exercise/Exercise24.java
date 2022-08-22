package chapter02.exercise;

import java.util.Scanner;

public class Exercise24 {

	public static void main(String[] args) {
		// #3

		double r = 0;

		double h = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("원기둥 밑변 반지름 : ");

		r = scanner.nextDouble();

		System.out.print("원기둥 높이 : ");

		h = scanner.nextDouble();

		double area = r * r * Math.PI;

		double volume = area * h;

		System.out.println("원기둥 밑변 넓이는 " + area + "이고, 원기둥 부피는" + volume);

	}

}
