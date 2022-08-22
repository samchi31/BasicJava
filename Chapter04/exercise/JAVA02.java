package chapter04.exercise;

public class JAVA02 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				sum=sum+j;
			}
		}
		System.out.println(sum);
	}
}
