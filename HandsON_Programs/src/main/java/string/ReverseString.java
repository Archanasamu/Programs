package string;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {
	
	public void mthd1SB(String text) {
		
		StringBuffer sb = new StringBuffer(text);
		sb.reverse();
	System.out.println(sb);
		
	}
	
	public void mthd2Iteration(String text){
		char[] ch = text.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
			
		}	
	}
	
	public void mthd3list(String text) {
		char[] ch = text.toCharArray();
		List<Character> str = new ArrayList<Character>();
		
		for(Character c : ch) {
			str.add(c);
		}
		
		Collections.reverse(str);
		
		Iterator ls = str.listIterator();
		while(ls.hasNext()) {
		
			System.out.print(ls.next());
		}
	}

	public static void main(String[] args) {
		
		ReverseString obj = new ReverseString();
		
	//	obj.mthd1SB("Archana");
		obj.mthd2Iteration("Archana");
	//	obj.mthd3list("Archana");
		
	}
}
