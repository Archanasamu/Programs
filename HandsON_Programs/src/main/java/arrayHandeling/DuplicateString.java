package arrayHandeling;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateString {
	
	public static void method(String str) {
		
		str = str.toLowerCase();
		
		String[] split = str.split(" ");
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		for(String word:split) {
			
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}
			else {
				map.put(word, 1);
			}
		}
		
		Set<String> duplicateString = map.keySet();
		
		for(String s:duplicateString) {
			if(map.get(s)>1) {
				System.out.println(s+" "+map.get(s));
			}
		}
		
	}

	
	public static void main(String[] args) {
		
		String str = "Java is a program java used in selenium using selenium java automation";
		
		method(str);
		
	}
}
