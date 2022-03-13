package string;

public class IdentifytheDataType {

	public static void main(String[] args) {
		
		String text = "$$ Hap5p7y Le#arning* " ;
		
		int letter=0;
		int number=0;
		int splChar=0;
		int space=0;
		
		char[] ch = text.toCharArray();
		
		for(int i=0;i<text.length();i++) {
			if(Character.isLetter(ch[i])) {
				letter++;
			}
			else if(Character.isSpaceChar(ch[i])) {
				space++;
			}
			else if(Character.isDigit(ch[i])) {
				number++;
			}
			else {
				splChar++;
			}
		}
		
		System.out.println("Count of letters: "+letter);
		System.out.println("Count of space: "+space);
		System.out.println("Count of number: "+number);
		System.out.println("Count of splChar: "+splChar);
	}
}
