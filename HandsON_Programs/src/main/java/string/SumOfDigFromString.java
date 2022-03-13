package string;


public class SumOfDigFromString {

	public static void main(String[] args) {
		
		String str = "12Arch5an73a551";
		int sum =0;
		
		char[] ch = str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(Character.isDigit(ch[i])) {
				int numch = Character.getNumericValue(ch[i]);
				System.out.println(numch);
				sum = sum+numch;
			}
		}
	System.out.println("The sum of Numeric in the String: "+sum);
	}	
		
}
