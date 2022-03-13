package arrayHandeling;

public class SmallesAndLargest {
	
	public static void main(String[] args) {
		
		int num [] = {12, 2, 5, 1, 88, 97, 214, 1, 5};
		
		int smallest = num[0];
		int largest = num[0];
		
		for(int i=0; i<num.length;i++) {
			if(num[i]>largest) {
				largest=num[i];
			}
			else if(num[i]<smallest) {
				smallest=num[i];
			}
		}
		
		System.out.println("Largest number in an array: "+largest);
		System.out.println("Smallest number in an array: "+smallest);
	}
}
