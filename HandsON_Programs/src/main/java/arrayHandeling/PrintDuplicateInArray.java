package arrayHandeling;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateInArray {
	
	public static void method1() {
		
		int [] arr = {14, 12, 13, 11, 15, 14, 18, 16, 17, 14, 19, 18, 17, 20 };
		
		for (int i =0; i <= arr.length - 1; i++) {
			int count = 0;
			for (int j = i+1; j <= arr.length - 1; j++) {
				if (arr[i] == arr[j]) {
					count++;
					
				}
			}
			if (count > 0) { 
				System.out.println("Duplictaed no is : " + arr[i]);
			}
		}

	}
	
	public static void method2(){
		//int [] arr = {14, 12, 13, 11, 15, 14, 18, 16, 17, 14, 19, 18, 17, 20 };
		int[] arr = {12, 2, 4,2,10, 6, 8, 10};
		
		Set<Integer> num = new HashSet<Integer>();
		
		boolean flag = false;
		for(int i:arr) {
			//System.out.println(num.add(i));
			
			if(num.add(i) == false) {
				System.out.println("Duplicate Element found: "+ i);
				flag=true;
			}
		}
		
		  if(flag==false) { 
			  System.out.println("No Duplicate"); }
		 
	}
	
	public static void main(String[] args) {
		method1();
		method2();
	}
}


