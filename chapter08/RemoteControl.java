package chapter08;

/*public abstract class RemoteControl{
	private int volume;
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
}*/

public interface RemoteControl {
	//private int volume;			// private error : 인터페이스에는 필드 선언 불가 상수만 가능
	public int MAX_VOLUME = 10;		// public static final 생략
	int MIN_VOLUME = 0;				// public 생략
	
	public abstract void turnOn();
	void turnOff();
	public abstract void setVolume(int volume);
}
