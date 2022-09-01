package chapter10;

public class CatchOrderExample {
	public static void main(String[] args) {
		try {
			String data1 =  args[0];	//a
			String data2 =  args[1];	//100
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			int result = value1 + value2;
			System.out.println(result);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족");
		} catch(NumberFormatException e) {
			System.out.println("숫자 변환 불가");
		}finally {
			System.out.println("다시 실행");
		}
	}
}
