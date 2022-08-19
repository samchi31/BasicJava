import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		int count = 0;
		for (int i = 1; i <= num; i++) {
			int temp = i;
			if (i / 100 == 0) {	
				temp = function(i);
				//if(temp)
			}
			count++;
		}
		// System.out.println(function(num));
	}

	public static int function(int num1) {
		int tmp = num1;
		tmp = tmp % 10;
		return num1 - function(tmp);
	}
}
