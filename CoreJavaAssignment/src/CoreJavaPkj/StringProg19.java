package CoreJavaPkj;

import java.util.ArrayList;

public class StringProg19 {
	
	public void PrintFirstName( String str1) {
		String[] temp = str1.split(" ");
		
		System.out.println("First Name from String:  "+ temp[0]);
		
	}
	
	
	public static void PrintLastName( String str2) {
		String[] temp = str2.split(" ");
		
		System.out.println("Last Name from String: " + temp[1]);
		
	}

	public static void main(String[] args) {
		String string1 = "Sachin Tendulkar";
		String string2 = "Rahul Dravid";
		
		StringProg19 obj = new StringProg19();
		obj.PrintFirstName(string1);
		
		PrintLastName(string2);
	

	}

}
