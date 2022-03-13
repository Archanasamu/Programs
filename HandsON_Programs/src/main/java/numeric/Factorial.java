package numeric;

public class Factorial {
	
	public static void main(String[] args) {
		
		int range = 6; 
		
		int fact =1;
		
		for(int i=1; i<=range;i++) {
			
			fact = fact*i;
		}
		
		System.out.println(fact);
	}

}
