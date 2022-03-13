package string;

public class ReverseEvenString {
	
	public static void main(String[] args) {
		
		String str = "Want to become an automation engineer always";
		
		String[] words = str.split(" ");
		
		for(int i=0;i<words.length;i++) {
			
			if((i%2) == 0) {
				//System.out.println(words[i]);
				
				char[] ch = words[i].toCharArray();
				
				for(int j=ch.length-1;j>=0;j--) {
					System.out.print(ch[j]);
				}
			System.out.print(" ");
			}
			else {
				System.out.print(words[i]+ " " );
			}
		}
		
	}

}
