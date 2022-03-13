package string;

import java.util.Iterator;

public class CharacterOccurance {
	
	public void method1() {
		
		String text = "Learn Selenium";
		int count = 0;
		
		char[] ch = text.toCharArray();
		
		for(int i=0; i<ch.length;i++) {
			if(ch[i]=='e') {
				System.out.println("Index of e method1: " +i);
				count++;
			}
		}
		System.out.println("Count of e is method1: "+count);
	}
	
	public void method2() {
		String text = "Learn Selenium";
		int count =0;
		
		for(int i=0; i<text.length();i++) {
			if(text.charAt(i)=='e') {
				count++;
				System.out.println("Index of e Method2: "+i);
			}
		}
		System.out.println("Count of e in Method2: "+count);
	}
	
	public static void main(String[] args) {
		CharacterOccurance obj = new CharacterOccurance();
		obj.method1();
		obj.method2();
	}

}
