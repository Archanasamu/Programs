package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUnique {

	public static void main(String[] args) {
		
		String str ="archana";
		
		char ch[] = str.toCharArray();
		
		Set<Character> unique = new LinkedHashSet<Character>();
		
		for(char c: ch) {
			unique.add(c);
		}
		System.out.println("Unique letters: "+ unique);
	}
}
