package chapter08;
public class Television implements RemoteControl, Searchable {	// 다중 인터페이스

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV 켜기");
	}

	@Override
	public void turnOff() {
		System.out.println("TV 끄기");
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

	@Override
	public void search(String word) {
		System.out.println(word);
	}

}
