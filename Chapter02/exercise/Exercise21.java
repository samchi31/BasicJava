package chapter02.exercise;

import java.util.Scanner;

public class Exercise21 {

	public static void main(String[] args) {
		//#1

		double width=0;

		double height=0;

		double area=0;

		double perimeter=0;

		 

		Scanner scanner = new Scanner(System.in);

		 

		System.out.print("가로의 길이는?(단위: m): ");

		width = scanner.nextDouble();

		 

		System.out.print("가로의 길이는?(단위: m): ");

		height = scanner.nextDouble();

		 

		area = width * height;

		perimeter = 2*width + 2*height;

		System.out.println("직사각형의 넓이 : " + area );

		System.out.println("직사각형의 둘레 : " + perimeter );

		 

	}

}
