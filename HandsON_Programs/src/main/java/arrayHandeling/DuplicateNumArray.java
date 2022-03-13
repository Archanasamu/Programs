package arrayHandeling;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumArray {
	
	public static void method1() {
		
		int arr[] = {4, 11, 17, 5, 9, 3, 7};
		
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i] == arr[j]) {
					System.out.println("Method2: Duplicate Element found: "+arr[j]);
					flag=true;
				}				
			}
		}
		if(flag==false) {
			System.out.println("Method1: No duplicate element found");
		}
	}
	
	public static void method2() {
		
		int arr[] = {4, 11, 3, 17, 5, 9, 3, 7};
		
		Set<Integer> mySet = new HashSet<Integer>();
		
		boolean flag=false;
		
		for(Integer i: arr) {
			//System.out.println(mySet.add(i));
			
			if(mySet.add(i)==false) {
				System.out.println("Method2: Duplicate Element Found");
				flag=true;
			}
		}
		
		if(flag == false) {
			System.out.println("Method2: No Duplicate Element");
		}
		
	}
	
	public static void main(String[] args) {
		method1();
		method2();
	}

}
