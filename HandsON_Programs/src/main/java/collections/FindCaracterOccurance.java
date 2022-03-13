package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FindCaracterOccurance {
	
	public static void main(String[] args) {
		
		String text = "javava";
		
		method2(text);
		method1(text);
		
	}
	
	public static void method1(String text) {
		
		char[] ch = text.toCharArray();
		
		Map<Character,Integer> occurance = new HashMap<Character,Integer>();
		
		for(char c: ch) {
			if(occurance.containsKey(c)) {
				occurance.put(c, occurance.get(c)+1);
			}
			else {
				occurance.put(c, 1);
			}
		}
		
		  Set<Character> occur = occurance.keySet();
		  
		  for(char x: occur) 
		  { 
			  if(occurance.get(x)>1) 
			  { 
				  System.out.println(x + ":" + occurance.get(x));
				  } 
			  }
		System.out.println(occurance);
	}
	
	public static void method2(String text) {
		
		char [] ch =text.toCharArray();
		
		Map<Character, Integer> map = new TreeMap<Character,Integer>();
		
		for(int i =0; i<ch.length;i++) {
			
			if(! map.containsKey(ch[i])) {
				map.put(ch[i], 1);
			}
			else {
				map.put(ch[i], map.get(ch[i])+1);
			}
		}
		
		System.out.println(map);
		
	}

}
