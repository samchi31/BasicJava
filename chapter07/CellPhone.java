package chapter07;

public class CellPhone {
	String model;
	String color;
	
	void powerOn() {
		System.out.println("전원 켜기");
	}
	void powerOff() {
		System.out.println("전원 끄기");
	}
	void bell() {
		System.out.println("벨");
	}
	void sendVoice(String message) {
		System.out.println("자기 : " + message);
	}
	void receiveVoice(String message) {
		System.out.println("상대방 : " + message);
	}
	void hangUp() {
		System.out.println("전화 끊기");
	}
}
