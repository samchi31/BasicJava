package chapter13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println(map.size());

		// 모든 요소 출력
		// 1. entry 이용
		// 반복문
		Iterator<Entry<String, Integer>> entryIterator = map.entrySet().iterator();
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		// foreach
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		// 2. key 이용
		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println("\t" + key + " : " + map.get(key));
		}

		Set<String> keyset = map.keySet();
		for (String key : keyset) {
			System.out.println(key + " : " + map.get(key));
		}

		// 3. value를 직접 이용
		Collection<Integer> values = map.values();
		for (Integer value : values) {
			System.out.println(value);
		}
		
		/*
		 * 반복문
		 * for i문
		 * for each문
		 * foreach 함수
		 */
		values.forEach(new Consumer<Integer>() {
			//consumer interface 익명객체
			@Override
			public void accept(Integer t) {
				// t 가 value
				System.out.println(t);
			}
		});		
		values.forEach(System.out::println);	

//		System.out.println(map.get("홍길동"));
//		System.out.println();
//
//		Set<String> keySet = map.keySet();
//		Iterator<String> keyIterator = keySet.iterator();
//		while (keyIterator.hasNext()) {
//			String key = keyIterator.next();
//			Integer value = map.get(key);
//			System.out.println("\t" + key + " : " + value);
//		}
//		System.out.println();	
//
//		map.remove("홍길동");
//		System.out.println(map.size());
//		
//		Set<Map.Entry<String, Integer>>	entrySet = map.entrySet();
//		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
//		
//		while (entryIterator.hasNext()) {
//			Map.Entry<String, Integer> entry = entryIterator.next();
//			String key = entry.getKey();
//			Integer value = entry.getValue();
//			System.out.println("\t" + key + " : " + value);
//		}
//		System.out.println();		
//		
//		map.clear();
//		System.out.println(map.size());
	}
}
