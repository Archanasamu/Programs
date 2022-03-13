package string;

public class EqualsOption {
	
	public static void main(String[] args) {
		
		String str1 = "I am Learning Selenium";
		String str2 = "I am learning selenium";
		
		if(str1 == str2) {
			System.out.println("Compare the memory both are same text");
		}
		else {
			System.out.println("Compare the memory both are different");
		}
		
		if(str1.equals(str2)) {
			System.out.println("Compare String value with case sentivity both are same");
		}
		else {
			System.out.println("Compare String value with case sentivity both are different");
		}
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("Compare string with ignore case sentivity both are same");
		}
		else {
			System.out.println("Default Value");
		}
		
		String sentence = "I am working with 8java";
		
		String replace = sentence.replaceAll("\\d", "11");
		System.out.println("Replaced 8 with 11: "+replace);
		System.out.println(replace.concat("#"));
		System.out.println(replace.substring(5, 11));
		
	}

}
