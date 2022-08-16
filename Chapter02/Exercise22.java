package Chapter02;

public class Exercise22 {
	public static void main(String[] args) {
		// #2

		double distance = 40e12;
		double speed = 300000;
		
		//double time = distance / 300000;
		double time = distance / (double)speed/3.154e+7/*/60/60/24/365*/;

		System.out.println("빛의속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은 " +

				time + "광년이다");
	}
}
