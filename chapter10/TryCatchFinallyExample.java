package chapter10;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		String[] strArr = {"10", "2a"};
		int value = 0;
		
		for(int i=0;i<=2;i++) {
			try {
				value = Integer.parseInt(strArr[i]);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 초과");
			} catch(NumberFormatException e) {
				System.out.println("숫자 변환안됨");
			} finally {
				System.out.println(value);
			}
		}
	}
}
