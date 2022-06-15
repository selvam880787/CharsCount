package chars.counts;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharsCounts {

	public static void main(String[] args) {
		String s = "selenium";
		int count = 0;
		int a = 0;
		HashMap<Character, Integer> h = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					a = i;
					count++;
				}
			}
			System.out.println(s.charAt(a) + ":" + count);
			h.put(s.charAt(i), count);
			count = 0;
		}

		for (Character st : h.keySet()) {
			System.out.println(st);
		}

		String name = "SelvaManikandan";

		char[] ch = name.toCharArray();

		Map<Character, Integer> counts = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < ch.length; i++) {

			if (counts.containsKey(ch[i])) {
				counts.put(ch[i], counts.get(ch[i]) + 1);
			} else {
				counts.put(ch[i], 1);
			}

		}

		for (char chararray : counts.keySet()) {
			System.out.println("Character is " + chararray + " count is " + counts.get(chararray));
		}
	}
}
