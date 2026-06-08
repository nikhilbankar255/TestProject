package stringProgram;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDuplicateStringAndChar {

	static void findDuplicateCharacters(String ch) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (int i = 0; i < ch.length(); i++) {

			char c = ch.charAt(i);
			if (hm.get(c) != null) {
				hm.put(c, hm.get(c) + 1);

			} else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
	}

//	static void findDuplicateString(String str) {
//		HashMap<String, Integer> hm = new HashMap<String, Integer>();
//
//		String[] s = str.split(" ");
//
//		for (String ss : s) {
//			// System.out.println(ss);
//			if (hm.get(ss) != null) {
//				hm.put(ss, hm.get(ss) + 1);
//			} else {
//				hm.put(ss, 1);
//			}
//		}
//		System.out.println(hm);
//
//		Iterator<String> ss = hm.keySet().iterator();
//		while (ss.hasNext()) {
//			String temp = ss.next();
//			if (hm.get(temp) > 1) {
//				System.out.println("The Word " + temp + " Appeard " + hm.get(temp) + " no of times");
//			}
//		}
//
//	}

	public static void main(String[] args) {

		//findDuplicateString("My My name is is Nikhil");
		findDuplicateCharacters("NNikhhhil");

	}

}
