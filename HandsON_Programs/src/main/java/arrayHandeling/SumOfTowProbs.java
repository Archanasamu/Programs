package arrayHandeling;

public class SumOfTowProbs {
	
	public static void main(String[] args) {
		int a[] =  {7, 2, 8, 3, 9};
		int target = 9;
		
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length;j++) {
				if(a[i]+a[j] == target&&(i!=j)) {
					System.out.println("[" + i + "," + j + "]");
					System.out.println(" num1:"+ a[i]);
					System.out.println(" num2:"+ a[j]);
				}
			}
		}
		
	}

}
