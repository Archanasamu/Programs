package arrayHandeling;

import java.util.Arrays;

public class MultipleMissingNumberInArray {
	
	public static void main(String[] args) {
		
		int[] arr = {0, 1, 2, 2, 3, 5, 6, 6, 6, 7, 9, 9, 9};
		
		int[] newArray = new int[arr.length];
		
		for(int i: arr) {
			
			newArray[i] = 1;
		}
		System.out.println(Arrays.toString(newArray));
		
		for(int i=1;i<newArray.length;i++) {
			if(newArray[i] == 0) {
				System.out.println("Missing Numbers are: "+i);
			}
		}
	}

}
