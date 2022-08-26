package chapter7;

public class InstanceofExample {
	private static void method1(Parent parent) {
		if(parent instanceof Child) {		// 자식객체인지 확인
			Child child = (Child) parent;
			child.name = "대한민국";
			System.out.println(child.name);
		} else {
			System.out.println("강제변환 불가");
		}
	}
	
	public static void main(String[] args) {
		method1(new Child());
		method1(new Parent()); 	//에러발생 : 강제 캐스팅 하려면 자동 변환된 타입을 다시 자신의 원래 타입으로 변환만 가능
								// instanceof 를 사용하여 부모자식관계확인하는 걸로 수정
	}
}
