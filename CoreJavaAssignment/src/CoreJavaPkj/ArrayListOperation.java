package CoreJavaPkj;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class ArrayListOperation {

	public static void main(String[] args) {
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		for(int i=200;i<=500;i++) {
			myArray.add(i);
		}
		System.out.println("ArrayList: "+ myArray);

	
		HashSet<Integer> mySet = new HashSet<Integer>();
		for(int i=200;i<=500;i++) {
			mySet.add(i);
		}
		System.out.println("HashSet: " +mySet);
		
		TreeSet<Integer> myTrSet = new TreeSet<Integer>();
		for(int i=200;i<=500;i++) {
			myTrSet.add(i);
		}
		System.out.println("TreeSet: " +myTrSet);

		
	}

}
