package Chapter04;

public class IfElseIfElseExample {
	public static void main(String[] args) {
		int score = 75;
		
		if(score>=90) {
			System.out.println("점수 100~90");
			System.out.println("등급 A");
		}
		else if(score >= 80) {
			System.out.println("점수 89~80");
			System.out.println("등급 B");
		}
		else if(score >= 70) {
			System.out.println("점수 79~70");
			System.out.println("등급 C");
		}
		else {
			System.out.println("점수 69~60");
			System.out.println("등급 D");
		}
	}
}
