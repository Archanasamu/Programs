package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ReverseMap {
	
	public static void main(String[] args) {
		
		Map<Integer,String> map = new TreeMap<Integer,String>();
		map.put(1, "Archana");
		map.put(2, "Boopathi");
		map.put(3, "Samyukta");
		
		//System.out.println(map);
		
		List<Integer> keysList = new ArrayList<Integer>();
		
		for(Entry<Integer,String> eachValue : map.entrySet()) {
			Integer key = eachValue.getKey();
			keysList.add(key);	
		}
		
		Collections.reverse(keysList);
		Map<Integer,String> reverseMap = new LinkedHashMap<Integer,String>();
		String valueList;
		
		for(int i=0; i<keysList.size();i++) {
			valueList= map.get(keysList.get(i));
			reverseMap.put(keysList.get(i), valueList);
		}
		System.out.println("Reverse Map: "+reverseMap);
	}

}
