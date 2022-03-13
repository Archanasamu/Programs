package arrayHandeling;

import java.util.Arrays;

public class SecondLargestNumber {
	
	public static void method1(int [] a) {
		
		Arrays.sort(a);
		
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("Second Largest Number: " +a[a.length-2]);
		
	}
	
	public static void method2(int a[]) {
		
		int n = a.length;
		
		int highest = a[0];
		int secondHighest = a[0];
		
		for(int i=0; i<n;i++) {
			
			if(a[i]>highest) {
				
				secondHighest = highest;
				highest = a[i];	
			}
			
			if(a[i] < highest && a[i] > secondHighest ) {
				secondHighest = a[i];
			}
		}
		
		System.out.println("Second Largest Num unStored: "+ secondHighest);
	}

	
	public static void main(String[] args) {
		
		int [] a = {-5,8,10,6,77,45,22,98,1,98};
		
		method1(a);
		method2(a);
	}
}
