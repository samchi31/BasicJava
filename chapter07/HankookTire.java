package chapter07;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation) {
		super(location,maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "HankookTire:" + (maxRotation - accumulatedRotation));
			return true;
		} else {
			System.out.println("HankookTire 펑크 "+ location);
			return false;
		}
		
	}
}
