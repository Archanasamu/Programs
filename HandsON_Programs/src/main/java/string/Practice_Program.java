package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;


public class Practice_Program {
	
		public static void printDuplicate(String str) {
			
			str = str.toLowerCase();
			
			String[] words = str.split(" ");
			
			//Create HashMap
			
			Map<String, Integer> wordsCount = new HashMap<String, Integer>();
			
			// To check each word in the array
			for(String word: words) {
				//if word is present
				if(wordsCount.containsKey(word)) {
					wordsCount.put(word, wordsCount.get(word)+1);
				}
				else {
					wordsCount.put(word, 1);
				}
			}
			
			// to extract all the keys
			Set<String> wordsInString = wordsCount.keySet();
			
			// loop thorough all the counts in wordsCount
			for(String s: wordsInString) {
				if(wordsCount.get(s)>1) {
					System.out.println(s+":"+wordsCount.get(s));
				}
			}
			
		}
		
		public static void palindorme(String str) {
			
			String orgStr = str;
			String rev ="";
			
			for(int i = str.length()-1;i>=0;i--) {
				
				rev = rev + str.charAt(i);
			}
			
			if(orgStr.equalsIgnoreCase(rev)) {
				System.out.println("Palindrome");
			}
			else
			{
				System.out.println("Not Palindrome");
			}
			

		}
		
		public static void secondLargestNumber(int[] a) {
			
			int highest = a[0];
			int secondhighest = a[0];
			
			for(int i=0;i<a.length;i++) {
				if(a[i] >highest) {
					secondhighest = highest;
					highest = a[i];
				}
				
				if(a[i]<highest && a[i]>secondhighest) {
					secondhighest = a[i];
				}
			}
			
			System.out.println("Second Largest number: "+ secondhighest);
			
		}
		
		public static int[] moveAllZerotoEnd() {
			
			int [] a = {0,1,5,0,8,11,0,9,22,0,7,0};
			
			int [] newArray = new int[a.length];
			int count=0;
			
			for(int i: a) {
				if(i != 0) {
					newArray[count] = i; 
					count++;
				}
			}
			
			return newArray;
		}
		
		

	public static void main(String[] args) {
		//printDuplicate("Learning selenium is not easy with java over python but selenium with java is better than python");
		//removeVowels("Archana Testing");
		//palindorme("madam");
		
		//int[] arr = {2, 5, 8, 9, 11, 11, 8};
		//secondLargestNumber(arr);
		
		System.out.println(Arrays.toString(moveAllZerotoEnd()));
		
	}
	
	
	}