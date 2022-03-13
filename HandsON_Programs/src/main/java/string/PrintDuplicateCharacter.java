package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintDuplicateCharacter {
	
	public static void method1(String text) {
		
		if(text == null) {
			System.out.println("String is null");
			return;
		}
		
		if(text.isEmpty()) {
			System.out.println("String is empty");
			return;
		}
		
		if(text.length() == 1) {
			System.out.println("Single char String");
			
		}
		
		char[] ch = text.toCharArray();
		
		Map<Character,Integer> duplicateCharCount = new HashMap<Character,Integer>();
		
		for(Character c:ch) {
			if(duplicateCharCount.containsKey(c)) {
				duplicateCharCount.put(c, duplicateCharCount.get(c)+1);
			}
			else {
				duplicateCharCount.put(c, 1);
			}
		}
		
		Set<Entry<Character, Integer>> duplicateChar = duplicateCharCount.entrySet();
		
		for(Entry<Character,Integer> x: duplicateChar) {
			
			if(x.getValue()>1) {
				System.out.println(x.getKey()+":"+x.getValue());
			}			
		}
	}
	
	/*
	 * public static void method2(String text) {
	 * 
	 * char[] ch = text.toCharArray(); int length = text.length();
	 * 
	 * for(int i=0; i<length;i++) { for(int j=i+1;i<length;j++) { if(ch[i]==ch[j]) {
	 * System.out.println("Duplicate character: "+ch[i]); break; } } }
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
		
		method1("A");
		method1("");
		method1(null);
		method1("archana");
		//method2("Archana");
	}
}
