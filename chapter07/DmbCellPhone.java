package chapter07;

public class DmbCellPhone extends CellPhone {
	int channel;
	
	DmbCellPhone(String model, String color, int channel){
		//super(); //부모생성자 생략
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println(channel);
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println(channel);
	}
	void turnOffDmb() {
		System.out.println("DMB 수신 멈춤");
	}
}
