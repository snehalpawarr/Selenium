package CoreJavaPkj;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StringQ9 {
	
	static String Print_SubString(String a) {

		String b= a.substring(5);
		return b;
	
		
	}
	

	public static void main(String[] args) {
		String aa="ABCDE12345";
		
		String result=Print_SubString(aa);
		System.out.println(result);
	
	}
	
}
