package chapter08;

public class Audio implements RemoteControl {

	private int volume;
	@Override
	public void turnOn() {
		System.out.println("Audio 켜기");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio 끄기");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if (volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println(this.volume);
	}

}
