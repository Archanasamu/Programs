package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParagraphintoArrayList {
	public static void main(String[] args) {
		
		String paragraph = " I Wish to clear my interview and got the job ";
		String str[] = paragraph.split(",");
		List<String> al = new ArrayList<String>();
		al = Arrays.asList(str);
		for(String s:al) {
			System.out.println(s);
		}
		
		
	}

}
