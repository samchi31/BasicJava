package chapter7;

public class Tire {
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
		
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + ":" + (maxRotation - accumulatedRotation));
			return true;
		} else {
			System.out.println("Tire 펑크 "+ location);
			return false;
		}
	}
}
