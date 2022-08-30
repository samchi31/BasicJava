package chapter08;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc; 		// 추상메소드, 인터페이스 생성자 호출 불가
		rc = new Television();
		rc.turnOn(); 			// Television의 turnOn 메소드
		rc.setVolume(5);
		//rc.search();			//RemoteControl타입이라서 불가능
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(10);
		
		//Searchable tv = new Televison();
		//tv.search("홍길동");
		Television tv = new Television();
		RemoteControl control = tv;
		Searchable searchable = tv;
		control.turnOn();
		control.setVolume(5);
		searchable.search("abc");
	}
}
