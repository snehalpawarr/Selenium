package CoreJavaPkj;

import java.lang.reflect.Array;

public class StringSpaces {

	public static void main(String[] args) {
		String a="Welcome To Java";
		int TotalSpaces=0;
		
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)==' ')
				TotalSpaces++;	
		}
		System.out.println("Total no. of spaces= "+TotalSpaces);
		String[] myArray = a.split(" ");
		
			System.out.println(myArray[0]);

		
	}

}
