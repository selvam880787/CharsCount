package chars.counts;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterOccurences {
	public static void main(String[] args) {
		String s = "Selenium with java";
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)=='e') {
				count++;
			}
			
		}
		System.out.println("Character 'e' repeats "+count+" times");

		String string = "Selenium with java";
		int counts;
		char ch;
		Map<Character, Integer> hashmap = new LinkedHashMap<Character, Integer>();
		for (int j = 0; j < string.length(); j++) {
			ch = string.charAt(j);
			if (hashmap.containsKey(ch)) {
				counts = hashmap.get(ch);
				counts++;
				hashmap.replace(ch, counts);
			} else {
				hashmap.put(ch, 1);
			}
		}
		for (Character key : hashmap.keySet()) {
			System.out.println(key + " = " + hashmap.get(key));
		}
	}

}
