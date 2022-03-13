package arrayHandeling;

import java.util.Arrays;

public class SmallestDuplicateNum {
	
	public static void main(String[] args) {
		
		int num [] = {2,3,6,8,2,8,2,3,3,1};
		Arrays.sort(num);
		
		for(int i =0; i<num.length;i++) {
			if(num[i] == num[i+1]) {
				System.out.println("Smalles Duplicate Number in an array: "+num[i]);
				break;
			}
		}
	}

}
