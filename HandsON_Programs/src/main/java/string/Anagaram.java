package string;

import java.util.Arrays;

public class Anagaram {
	
	public static void main(String[] args) {
		
		String text1 ="stops";
		String text2 ="potss";
		
		int tl1 = text1.length();
		int tl2 = text2.length();
		
		char[] ch1 =text1.toCharArray();
		char[] ch2 = text2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if (tl1 == tl2) {
			if(Arrays.equals(ch1, ch2)) {
				System.out.println("Anagram");
			}
			else {
				System.out.println("No Anagram");
			}
		}
		else {
			System.out.println("Not Valid String");
				
		}
		
	}

}
