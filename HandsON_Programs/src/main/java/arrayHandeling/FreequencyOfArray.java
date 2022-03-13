package arrayHandeling;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FreequencyOfArray {
	
	public static 	void method1(int [] a) {
		
		Map<Integer,Integer> arrayCount = new HashMap<Integer,Integer>();
		
		for(int count : a) {
			
			if(arrayCount.containsKey(count)) {
				arrayCount.put(count, arrayCount.get(count)+1);
			}
			
			else {
				arrayCount.put(count, 1);
			}
			
		}
		
		Set<Integer> duplicateArray = arrayCount.keySet();
		
		for(int i : duplicateArray) {
			if(arrayCount.get(i)>1) {
				System.out.println(i + ":" + arrayCount.get(i));
			}
			
		}
	}
	
	public static void method2(int[] arr) {
		
		int[] fr = new int[arr.length];
		int visited = -1;

		for (int i = 0; i < arr.length; i++) {

			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;
					fr[j] = visited;

				}
			}
			if (fr[i] != visited)
				fr[i] = count;

		}
		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != visited)
				System.out.println("Frequency of Array " + arr[i] + " is:" + fr[i]);
		}

		 
	}

	public static void main(String[] args) {
		int [] arr = {1, 3, 3, 5, 8 ,6, 6,6,9,1,2,5,4,5,5};
		method1(arr);
		method2(arr);
	}
}
