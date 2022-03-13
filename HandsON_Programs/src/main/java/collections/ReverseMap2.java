package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ReverseMap2 {
	
	public static void main(String[] args) {
		
		Map<Integer,String> map = new TreeMap();
		
		map.put(1, "Archana");
		map.put(2, "Boopathi");
		map.put(3, "Samyukta");
		
		Set<Integer> keySet = map.keySet();
		//System.out.println(keySet);
		
		List<Integer> keyList = new ArrayList<Integer>(keySet);
		//System.out.println(keyList);
		
		Collections.reverse(keyList);
		System.out.println(keyList);
		
		Map<Integer,String> reverseMap = new LinkedHashMap<Integer,String>();
		
		for(Integer integer : keyList) {
			String string = map.get(integer);
			reverseMap.put(integer, string);
		}
		
		System.out.println(reverseMap);
		
		
	}

}
