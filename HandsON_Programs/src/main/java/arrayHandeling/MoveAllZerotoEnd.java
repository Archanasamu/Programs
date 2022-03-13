package arrayHandeling;

import java.util.Arrays;

public class MoveAllZerotoEnd {

	public static int[] method1(int a[]) {
		
		if(a.length == 1) {
		return a;
		}
		
		int newArray[] = new int[a.length];
		int count=0;
		for( int number :a) {
			if(number !=0) {
				newArray[count]= number;
				count++;
			}
		}
		return newArray;
			
		}
	
	public static void method2(int[] num) {
		
		int length = num.length;
		int count = 0;

		for (int i = 0; i < length; i++) {
			if (num[i] != 0) {
				// count value is initially 0
				// after the process, then it is incremented by 1
				 num[count] = num[i];
				 count++;
				//System.out.println(" Count :" + count);
				//System.out.println("num[" + i + "]:" + num[i]);
			}
		}

		while (count < length) {
			num[count++] = 0;
		}

		for (int j = 0; j < num.length; j++) {

			System.out.print(num[j] + " ");

		}


	}
	
	public static void main(String[] args) {
		
		int arr[] = new int[] {2, 0, 3, 5, 0, 9, 11, 14, 0, 2};
		//System.out.println("Method1: "+ method1(arr));
		//String zeroToEnd = Arrays.toString(method1(arr));
		/*
		 * System.out.println(Arrays.toString(method1(arr)));
		 * 
		 * arr = new int[] {0, 2, 0, 3, 5, 0, 9, 11, 14, 0, 2};
		 * System.out.println("Zero in the 1st: "+Arrays.toString(method1(arr)));
		 * 
		 * arr = new int[] {2, 3, 5, 9, 11, 14, 2};
		 * System.out.println("No Zero in the array: "+Arrays.toString(method1(arr)));
		 * 
		 * arr = new int[] {0};
		 * System.out.println("Only 0 in the array: "+Arrays.toString(method1(arr)));
		 * 
		 * arr = new int[] {2, 3, 5, 0, 0, 0}; System.out.println("All 0 at the end: "+
		 * Arrays.toString(method1(arr)));
		 * 
		 * arr = new int[] {2}; System.out.println("Only one element: "+
		 * Arrays.toString(method1(arr)));
		 */
		method2(arr);
	}

}
