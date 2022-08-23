package chapter06.exercise;

public class Plane {
	private String manufacture;
	private String model;
	private int maxNumberOfPassengers;
	static private int numberOfPlanes = 0;
	
	public Plane() {
		numberOfPlanes++;
	}
	public Plane(String manufacture, String model, int maxNumberOfPassengers) {
		this.manufacture = manufacture;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfPassengers;
		
		numberOfPlanes++;
	}
	public String getManufacture() {
		return manufacture;
	}
	public String getModel() {
		return model;
	}
	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}
	
	public void setManufacture(String m) {
		this.manufacture = m;
	}
	public void setModel(String m) {
		this.model = m;
	}
	public void setMaxNumberofPassengers(int n) {
		if(n<=0) {
			n=0;
		}
		this.maxNumberOfPassengers = n;
	}
	
	public static int getNumberOfPlanes() {
		return numberOfPlanes;
	}
}
