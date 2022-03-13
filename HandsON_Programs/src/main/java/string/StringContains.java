package string;

public class StringContains {
	
	public static void main(String[] args) {
		
		String text = "The quick brow dog jumb overs the lazy dog and the fox";
		
		String text1 = "dog";
		
		if(text.indexOf(text1) != -1) {
			System.out.println("Found the word "+text1+" in the index:"+text.indexOf(text1));
		}
		else {
			System.out.println("Not found the word: "+text1);
		}
		
		if(text.contains(text1)) {
			System.out.println("Found the word dog");
		}
	}

}
