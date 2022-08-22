package chapter03.exercise;

import java.util.Scanner;

public class Confirm3_2 {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("첫:");
//		String x = scanner.next();
//		System.out.println("두:");
//		String y = scanner.next();
//	
//		String result = Double.parseDouble(y) != 0? (Double.parseDouble(x)/Double.parseDouble(y))+"":"무한대";
//		System.out.println("결과:"+result);

//		int top=5;
//		int bottom =10;
//		int h=7;
//		double area = (double)(top+bottom)/2*h;
//		System.out.println(area);

//		int var1 = 10;
//		int var2 = 3;
//		int var3 = 14;
//		double var4 = var1*var1*Double.parseDouble(var2+"."+var3);
//		System.out.println(var4);

		Scanner scanner = new Scanner(System.in);
		System.out.println("아이디:");
		String name = scanner.nextLine();

		System.out.println("비밀:");
		String strPass = scanner.nextLine();

		int password = Integer.parseInt(strPass);

//		String nameTest = "java";
//		System.out.println(nameTest == "java");		//nameTest는 주소값이 같다 (== 연산자는 주소값을 비교)
//		System.out.println(name == "java");			//scanner로 받은 name은 주소 값이 다름

		if (name.equals("java")) {					//변수 값을 비교하기 위해 equals 사용
			if (password == 12345) {
				System.out.println("로그인");
			} else {
				System.out.println("err1");
			}
		} else {
			System.out.println("err2");
		}

	}

}
