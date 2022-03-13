package collections;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class LearnMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(1, "Archana");
		map.put(2, "Boopathi");
		map.put(3, "Samyukta");
		map.put(4, "Jivika");
		map.put(5, "Pranavi");
		
		System.out.println("Print entry as Map");
		
		System.out.println(map);
		
		System.out.println("Print entry as seperate records");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for(Entry eachEntry:entrySet ) {
			System.out.println(eachEntry);
		}
		
		System.out.println("Print Value alone from the set");
		
		for(Entry<Integer,String> eachEntry : map.entrySet()) {
			System.out.println(eachEntry.getValue());
		}
		
		System.out.println("Print Key Alone from the set");
		
		for(Entry<Integer,String> eachEntry : map.entrySet()) {
			System.out.println(eachEntry.getKey());
		}
		
		System.out.println("Key Set");
		Set<Integer> keySet = map.keySet();
		for(int i: keySet) {
			System.out.println(i);
		}
		
		System.out.println("Collection Values");
		
		Collection<String> values = map.values();
		for(String s:values) {
			System.out.println(s);
		}
		
		System.out.println("To get the particular value");
		
		System.out.println(map.get(2));
		
		// To verify if an entry is available in map using key/value
		
		boolean containsKey = map.containsKey(2);
		System.out.println("************");
		
		if(containsKey) {
			System.out.println("The key is avaliable");
		}
		else {
			System.out.println("Key is not avaliable");
		}
		
		boolean containsValue = map.containsValue("Pranavi");
		
		if(containsValue) {
			System.out.println("Value is avaliable");
		}
		else {
			System.out.println("Value is not avaliable");
		}
		
		System.out.println("To remove an entry from map");
		map.remove(5);
		System.out.println(map);
		
		System.out.println("To clear entier map");
		map.clear();
		System.out.println("Map cleared");
		System.out.println(map);
		
		boolean empty = map.isEmpty();
		
		if(empty) {
			System.out.println("Map is empty");
		}
		else {
			System.out.println("Map is not empty");
		}
	}

}
