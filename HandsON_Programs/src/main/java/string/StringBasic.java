package string;

public class StringBasic {
	
	public static void main(String[] args) {
		
		String text = "Happy Days Ever-for us";
		
		System.out.println("String Length");
		
		int length = text.length();
		System.out.println("String Length: "+length);
		
		System.out.println("String Index");
		
		int index = text.indexOf('s');
		System.out.println("Index of S: "+index);
		
	    int lastIndex = text.lastIndexOf('s');
	    System.out.println("Last Index of S: "+lastIndex);

	    System.out.println("SubString position");
	    String substring = text.substring(7); //trim the before character
	    System.out.println(substring);
	    String substring2 = text.substring(6,12); // includes the start index, excludes the end index
	    System.out.println(substring2);
	
	    System.out.println("***Split***");
	    String[] split = text.split(" ");
	    
		/*
		 * for(int i=0;i<split.length;i++) { System.out.println(split[i]); }
		 */
	    
	    for(String s:split) {
	    	System.out.println(s);
	    }
	    System.out.println(split[2]);
	}
	

}
