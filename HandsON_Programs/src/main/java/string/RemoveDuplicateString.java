package string;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateString {
	
	public 	String text ="We learn java basics as part of java sessions sessions in java week1";
	
	public void method1() {
		String[] words = text.split("\\s");
		
		
		  for (int i = 0; i < words.length; i++) { 
			  for (int j = i+1; j < words.length;j++) {
				  if(words[i].equalsIgnoreCase(words[j])) {
					  words[j]=""; 
					  }
				  } 
			  }
		 
		System.out.println("Srings without Duplicate: ");
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i]+" ");
			
		}
		
	}
	
	public void method2() {
		
		String[] splitArray = text.split(" ");
		
		Set<String> str = new LinkedHashSet<String>();
		
		for(String s : splitArray) {
			str.add(s);
		}
		
		Iterator<String> itr = str.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
}
	
	public static void main(String[] args) {
		
		RemoveDuplicateString obj = new RemoveDuplicateString();
		obj.method2();
	}
}
