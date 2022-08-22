package chapter02;

public class VariableUseExample {
	public static void main(String[] args) {
		
		int hour = 3;		
		int minute = 5;	
		
		System.out.println( hour + "시간" + minute + "분");		// 출력 확인
		
		int totalMinute = ( hour * 60 ) + minute;
		
		System.out.println("총 "+ totalMinute + "분");		//System.out 컴퓨터 자원 많이 씀
															//디버깅용으로 사용금지
	}
}
