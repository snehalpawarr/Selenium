package CoreJavaPkj;

public class ConstructProg {

	public static void main(String[] args) {
	        // Create an instance of ClassB
	        B objB = new B();
	        
	        // Call/print the integer variable from ClassB before resetting
	        System.out.println("Value of number in ClassB before reset: " + objB.number);
	        
	        // Reset the value of number in ClassB using constructor
	        objB.setNumber(42);
	        
	        // Call/print the integer variable from ClassB after resetting
	        System.out.println("Value of number in ClassB after reset: " + objB.number);
	    }

	}



