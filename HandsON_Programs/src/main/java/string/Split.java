package string;

public class Split {
	
	public static void main(String[] args) {
		String text = "Learning Selenium is not easy";
		
		System.out.println("String into Character Array");
		
		char[] ch = text.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		
		System.out.println("Split the String");
		
		String[] split = text.split(" ");
		
		for(int i=0;i<split.length;i++) {
			System.out.println(split[i]);
		}
		
		System.out.println("Split Array String Lenght");
			
		for(int i=split.length-1;i>=0;i--) {
			System.out.println("Value of i: "+i);
			System.out.println(split[i]);
		}
		}
		
	}


