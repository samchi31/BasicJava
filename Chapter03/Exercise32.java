package Chapter03;

import java.util.Scanner;

public class Exercise32 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("수도입니까?(수도:1, 수도아님:0) : ");
		int city = scanner.nextInt();

		System.out.print("총 인구?(만): ");
		int total = scanner.nextInt();

		System.out.print("연소득 1억 이상 인구?(만): ");
		int people = scanner.nextInt();

//		String result = (city == 1 && total >= 100) || people >= 50 ? 
//				"이 도시는 메트로폴리스" : "메트로폴리스 아님";

		String result = "";
//		if (city == 1 && total >= 100) {
//			result = "메트로폴리스";
//		} else if (people >= 50) {
//			result = "메트로폴리스";
//		} else {
//			result = "아님";
//		}
		if (city == 1 && total >= 100 || people >= 50) {
			result = "메트로폴리스";
		} else {
			result = "아님";
		}

		System.out.println(result);
	}

}
