package chapter04.exercise;

public class JAVA06 {
	public static void main(String[] args) {
		String str = "12345";
		int sum =0;
		
		for(int i =0; i<str.length();i++) {
			//System.out.println(str.charAt(i));
			sum += Integer.parseInt(""+str.charAt(i));
		}
		
		System.out.println("sum:"+sum);
	}
}
