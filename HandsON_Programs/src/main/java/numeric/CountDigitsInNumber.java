package numeric;

import java.lang.management.ManagementFactory;

public class CountDigitsInNumber {
	
	public static void main(String[] args) {
		
		int num = 1467834;
		int count=0;
		
		while(num >0) 
		{	
			num = num/10;
			count ++;
		}
		System.out.println(count);

	}
	

}
