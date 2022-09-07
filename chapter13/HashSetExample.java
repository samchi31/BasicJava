package chapter13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");

		int size = set.size();
		System.out.println(size);

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println("\t" + iterator.next());
		}

		set.remove("JDBC");
		set.remove("iBATIS");

		System.out.println(set.size());

		iterator = set.iterator();
		for (String element : set) {
			System.out.println("\t" + element);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비엇음");
		}
	}
}
