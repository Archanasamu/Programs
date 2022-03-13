package string;

import java.util.HashSet;
import java.util.Set;

public class RemoveVowels {
	
	
	public void method1(String str) {
		
		String replaceAll = str.replaceAll("[aeiouAEIOU]","");
		
		System.out.println("Vowels Removed String: "+replaceAll);
		
	}
	
	public void method2(String str) {
		
		Set<Character> vowels = new HashSet<Character>();
		
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		
		StringBuffer result = new StringBuffer();
		
		char[] ch = str.toCharArray();
		for(Character c: ch) {
			if(!vowels.contains(c)) {
				result.append(c);
			}
		}
		System.out.println("Method2 String: "+result);
		
	}

	public static void main(String[] args) {
		
		String str ="Archana testing";
		
		RemoveVowels obj = new RemoveVowels();
		
		obj.method2(str);
		obj.method1(str);
		
		
	}
}
