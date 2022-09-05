package chapter11;

import java.util.Objects;

// VO(Value Object) : 데이터를 저장하는 객체
// DTO(Data Transfer Object) : 데이터를 전달하는 객체
// Bean => 자바 커피 원두(bean) => 데이터를 자장하는 객체를 표현
// Item, Model 등과 같은 접미사를 붙이기도 함
// Lombok
// Kotlin 언어 : jetBrain에서 만든 언어
public class Member {
	private int id;
	private String name;
	
	// 객체 생성시  권장 메서드
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Member)) {
			return false;
		}
		Member other = (Member) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return String.format("Member [id=%s, name=%s]", id, name);
	}	
	// apache => commons 라이브러리

	
}
