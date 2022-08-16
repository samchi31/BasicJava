package Chapter04;

public class JAVA03 {
	public static void main(String[] args) {
		int sum = 0;
		int i=1;
		int j=1;
		while(true) {						
			
			if(i%2 == 0 ) {
				j = i * -1;
			}
			else {
				j=i;
			}
			sum += j;
						
			System.out.println("i:"+i+",sum:"+sum);
			
			if(sum>=100) {
				break;
			}
			
			i++;		
		}
		System.out.println(sum+","+i);
	}
}
