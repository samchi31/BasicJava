package chapter11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateExample {
	public static void main(String[] args) {
		//현재 지역 시간
		System.out.println(LocalDateTime.now());
		
		//chaining 방식
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh/mm/ss")));
		
	}
}
