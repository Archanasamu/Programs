package collections;

import java.util.Map;
import java.util.TreeMap;

public class OccuranceInArray {
	
	public static void main(String [] args) {
	
		int a[] = {5,6,7,2,8,2,5,-1,9,7,-1,9};
		
		Map<Integer,Integer> occurance = new TreeMap<Integer,Integer>();
		
		for(int i: a) {
			if(occurance.containsKey(i)) {
				occurance.put(i, occurance.get(i)+1);
			}
			else {
				occurance.put(i, 1);
			}
		}
		
		System.out.println(occurance);
	}

}
