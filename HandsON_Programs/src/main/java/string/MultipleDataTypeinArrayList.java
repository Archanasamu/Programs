package string;

import java.util.ArrayList;

public class MultipleDataTypeinArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<Object>();
		
		list.add("Archana");
		list.add(15);
		list.add('e');
		list.add(12.12);
		list.add(1800L);
		list.add(6.0D);
		list.add(12.13F);
		
		System.out.println(list);
		
		list.set(0, 2);
		list.set(1, "Samu");
		list.set(4, 'F');
		
		System.out.println("After Modification:"+list);
		
		
		  for (int i = 0; i < list.size(); i++) { 
			  System.out.println(list.get(i)); }
		 
		
	}
	

}
