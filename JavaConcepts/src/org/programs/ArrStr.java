package org.programs;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ArrStr {

	static int index;

	private static void subMe() {

		String[] str = { "india", "nepal", "INDIA" };

		List<String> l = new LinkedList<>();

		for (int i = 0; i < str.length; i++) {
			String str1 = str[i].toLowerCase();
			l.add(str1);
			for (int j = 0 + 1; j < l.size(); j++) {

				if (l.get(i).equals(l.get(j))) {
					index = j;
				}
			}
		}
		System.out.println(index);

		Set<String> s = new LinkedHashSet<>();
		s.addAll(l);
		System.out.println(s);
	}
	public static void main(String[] args) {
		subMe();
	}

}
