package arrayHandeling;

public class FindInterSection {
	
	public static void main(String[] args) {
	
	int a1[] = {1,3,5,7,9,11,13,2};
	int a2[] = {2,3,6,8,11,13,2};


	for(int i=0;i<a1.length;i++) {
		for(int j=0; j<a2.length;j++) {
			if(a1[i] == a2[j]) {
				System.out.println("InterSection number are: "+ a1[i]);
			}
		}	
	}
}
	
}
