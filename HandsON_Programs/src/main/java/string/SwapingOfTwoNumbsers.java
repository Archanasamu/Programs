package string;

public class SwapingOfTwoNumbsers {
	
	public static void main(String[] args) {
		int a=10, b=20;
		
		System.out.println("Before swaping a:  "+a+ " b: "+b);
		
		/*// Logic1 using temp variable
		 * int t=a; // t=10 a=b; // a=20 b=t; // b =10
		 */		
		
		/*// Logic2 without using temp variable & using add/sub
		 * a=a+b; //10+20 = 30 b=a-b;// 30-20 = 10 a=a-b; // 30-10 = 20
		 */		
		
		/*
		 * // Logic3 without using temp variable & using multip/div - any values is 0
		 * means we can use a=a*b;// 10*20=200 b=a/b;// 200/20 = 10 a=a/b; // 200/10 =
		 * 20
		 */		
		//Logic4 in single statement
		
		b=a+b-(a=b);
		
		System.out.println("After swaping of a:"+a+" and b:"+b);
	}

}
