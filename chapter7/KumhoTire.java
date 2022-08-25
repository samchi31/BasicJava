package chapter7;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		super(location,maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "KumhoTire:" + (maxRotation - accumulatedRotation));
			return true;
		} else {
			System.out.println("KumhoTire 펑크 "+ location);
			return false;
		}
		
	}
}
