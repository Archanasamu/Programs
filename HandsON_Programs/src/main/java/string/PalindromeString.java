package string;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		String str = "welcome";
		String org_str = str;
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			rev = rev+str.charAt(i);
		}
		
		System.out.println(rev);
		
		if(org_str.equals(rev)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("Not Palindrome String");
		}
	}

}
