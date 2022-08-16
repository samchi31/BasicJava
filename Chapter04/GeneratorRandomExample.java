package Chapter04;

import java.util.Random;

public class GeneratorRandomExample {
	public static void main(String[] args) {
		/*
		 * 랜덤(random) => 난수 컴퓨터 랜덤 : 가짜 랜덤(pseudo random) 
		 * 난수표 Math.random(); => 0.0 ~ 1.0미만 double타입 실수 반환 
		 * 공식 (int)(Math.random()*9)+0
		 * Random 클래스(객체)를 사용
		 */

		Random random = new Random(/*seed*/);
		random.nextInt(/* Boundary */10); 	// 0~9
		int a = random.nextInt(10)+1;				//1~10
		int b = random.nextInt(6)+1;				//1~6
		
		/* Random(seed)
		 * 시드 값이 같으면 같은 랜덤 값 생성
		 * 
		 * 보안 강화 랜덤 SecureRandom
		 */
	}
}
