package numeric;

public class AdditionofNumber {
	
	public static void main(String[] args) {
		
		int num=12345;
		
		int sum=0;
		
		while(num>0)
		{
			sum = sum+num%10;
			num=num/10;
		}
		
		System.out.println("Addition of number: "+sum);
		
		AdditionofNumber.addnum();
	}

	
	public static void addnum() {
		int a=13;
		int b=2;
		
		int c;
		
		c=a%b;
		System.out.println(c);
		
	}
}
