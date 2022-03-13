package numeric;

public class PrintPattern {
	
	public static void main(String[] args) {
		
		int row =6;
		
		method2(row);
	}

	public static void method1(int row) {
		for(int i=1;i<=row;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
	}
	
	public static void method2(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int star=1;star<= (2*i)-1;star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		}
}
