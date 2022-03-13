package string;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PrintDuplicateString {
	
	public String str = "Learning java is not smiple as python but java is good laungage as python";
	public int count;
	public void mth1() {
		/*
		 * Scanner in = new Scanner(System.in);
		 * System.out.println("Enter the String: "); String str= in.nextLine();
		 */
	
		str = str.toLowerCase();
		
		String[] split = str.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			count=1;
			for (int j = i+1; j < split.length; j++) {
				if(split[i].contentEquals(split[j])) {
					count++;
					split[j] = "0"; // 0 position is already visited not need to visit again - avoid printing visited word    
				}
			}
			
			if(count>1  && split[i] !="0") {
				System.out.println(split[i]+ " ");
			}
		}
		
	}
	
	public void mth2() {
		
		str= str.toLowerCase();
		
		String[] words = str.split(" ");
		
		Map <String, Integer> duplicateStringcount = new HashMap<String, Integer>();
		count=1;
		for(String s:words) {
			if(duplicateStringcount.containsKey(s)) {
				duplicateStringcount.put(s, duplicateStringcount.get(s)+1);
			}
			else {
				duplicateStringcount.put(s, count);
			}
		}
		
		Set<String> duplicateString = duplicateStringcount.keySet();
		
		for(String x:duplicateString) {
			if(duplicateStringcount.get(x)>1) {
				System.out.println(x+ ":"+duplicateStringcount.get(x));
			}
		}
	}
	
	public static void main(String[] args) {
		
		PrintDuplicateString obj = new PrintDuplicateString();
		obj.mth2();
	}

}
