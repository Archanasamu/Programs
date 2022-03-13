package numeric;

public class FabanocciSeries {

	public static void main(String[] args) {
		
		int sum =0;
		int firstNum =0;
		int secNum =1;
		
		int range =8; 	
		
		for(int i=1;i<range;i++) {
			sum = firstNum + secNum;
			System.out.println(sum);
			firstNum = secNum;
			secNum = sum;
		}
	}
}
