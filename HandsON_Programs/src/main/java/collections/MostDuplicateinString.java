package collections;

import java.util.Map;
import java.util.TreeMap;

public class MostDuplicateinString {

	public static void method1(String str) {
		
		char ch[] = str.toCharArray();
		int maxValue =0;
		char  maxOccurance = ch[0];
		
		Map<Character,Integer> map = new TreeMap<Character, Integer>();
		
		for(char c: ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
			
			Integer value = map.get(c);
			if(value>maxValue) {
				maxValue = value;
				maxOccurance = c;
			}
		}
		
		System.out.println("Max: "+ maxOccurance);
		System.out.println(maxValue);
	}
	
	public static void main(String[] args) {
		String name = "babba";
		method1(name);
	}

}

