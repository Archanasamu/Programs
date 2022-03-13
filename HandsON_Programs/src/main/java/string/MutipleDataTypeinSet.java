package string;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MutipleDataTypeinSet {
	
	public static void main(String[] args) {
		
		Set<Object> obj = new LinkedHashSet<Object>();
		
		obj.add("Archana");
		obj.add(12);
		obj.add(11.11);
		System.out.println(obj);
		System.out.println(obj.size()); 
		
	}

}
