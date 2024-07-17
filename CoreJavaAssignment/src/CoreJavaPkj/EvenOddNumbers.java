package CoreJavaPkj;

import java.util.Scanner;

public class EvenOddNumbers {
	
	public static void OddEven(int n) {
		
		if(n%2 == 0)
			System.out.println("Given number is an EVEN number!!!");
		else
			System.out.println("Given number is an ODD number!!!");
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num= scn.nextInt();
		
		OddEven(num);
		
		

	}

}
