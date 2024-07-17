package CoreJavaPkj;

public class CovertToCaseProg {
	
	
	public void ToUpperCase(String str1) {
		System.out.println("Given string in upper case:  "+ str1.toUpperCase());
			
	}

	public static void ToLowerCase(String str1) {
		System.out.println("Given string in lower case:  "+ str1.toLowerCase());
			
	}
	public static void main(String[] args) {
		CovertToCaseProg obj = new CovertToCaseProg();
		String string1="Naarendra Modi";
		obj.ToUpperCase(string1);
		ToLowerCase(string1);
		
		
		
		

	}

}
