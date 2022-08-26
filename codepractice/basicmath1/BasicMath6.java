package codepractice.basicmath1;
//부녀회장이 될꺼야
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicMath6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		int[] result = new int[test];
		for (int i = 0; i < test; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());

		}
	}

	public static int method(int k, int num) {
		
		for(int i =0;i<k;i++) {
			
		}
		return method(k-1, num-1) + num;
	}
}
