package string;

public class ContCatString {
	
	public static void main(String[] args) {
		
		String str1 = "Happy Day Ever";
		int a =10;
		int b =3;
		String c= "11";
		
		String concat = str1.concat(c);
		System.out.println(concat);
		
		System.out.println(a+b);
		System.out.println(a+c);
		
		
		  String str2 ="42 Buses"; 
		  String str3 = str2.replaceAll("[^0-9]", "");// seperating the number alone from the string and store it to a string 
		  String str4 = str2.replaceAll("[^a-z]", ""); 
		  System.out.println(str4);
		  System.out.println(str3); 
		  int num =100; int strNum = Integer.parseInt(str3); // to convert the string number to integer use ParseInt
		  
		  System.out.println("Prase Int"+ strNum);
		  
		  int result = strNum+num;
		  
		  System.out.println(result);
		 
				
		String ab = "32";
		int cd =10;
		
		int ef = Integer.parseInt(ab);
		
		int r = ef+cd;
		System.out.println("addition of ef and cd is: "+r);
	}

}
