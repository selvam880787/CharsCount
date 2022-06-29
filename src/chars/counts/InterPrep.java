package chars.counts;

import java.util.LinkedHashMap;
import java.util.Map;

public class InterPrep {

	public static void main(String[] args) {
		String s = "selenium";
		Map<Character,Integer> mp = new LinkedHashMap<Character,Integer>();
		int count = 1 ;
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			
			for (int j = 0; j < c.length; j++) {
				
				if(c[i]==c[j]) {
					
					if(mp.containsKey(c[i])) {
						mp.put(c[i], count+1);
					}else {
						mp.put(c[i], count);
					}
				}
			}
			
		}
		for (char d : mp.keySet()) {
			System.out.println(d+":"+mp.get(d));
		}
		}

	}


