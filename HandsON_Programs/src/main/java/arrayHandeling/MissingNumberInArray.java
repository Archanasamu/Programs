package arrayHandeling;

import java.util.Arrays;

public class MissingNumberInArray {
	
	public static void main(String[] args) {
		//int [] arr = {1, 2, 3, 4, 5,7,8, 9};
		
		int [] arr = {2,4,1,3,5,8,7,9};
		
		method1(arr);
		method2(arr,9);
		method3(arr);
		
	}
	
	public static void method1(int [] arr) {
		
		int sum1 =0;
		int sum2 =0;
		
		for(int i =0; i<arr.length;i++) {
			
			sum1 = sum1+ arr[i];
		}
		System.out.println("Sum1: "+sum1);
	
		for(int j=1;j<=9;j++) {
			sum2 = sum2+j;
		}
		System.out.println("Sum2: "+ sum2);
		
		System.out.println("Missing Number is: "+(sum2-sum1));
	}

	public static void method2(int[] arr, int total) {
		
		int actualTotal =0;
		
		total = (total * (total+1)) /2;
		System.out.println(total);
		
		for(int i=0; i<arr.length;i++) {
			actualTotal += arr[i];
		}
		System.out.println(actualTotal);
		
		
		System.out.println("Missing Number method2: "+(total-actualTotal));
		
	}
	
	public static void method3(int[] a) {
		Arrays.sort(a);
		//System.out.println("Missing Number is");
		
		for (int j = a[0]; j < a.length; j++) {
			//System.out.println("j :" +j);
			//System.out.println("[j-1]: " + (j-1));
			System.out.println("a[j-1]: " +a[j-1]);
			 
			if(j != a[j-1]) {
				System.out.println("The missing Element is :" +j);
				break;
			}
			}
	}
}
