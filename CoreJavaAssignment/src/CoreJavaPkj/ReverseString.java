package CoreJavaPkj;

public class ReverseString {
	
	static String ReverseFun() {
		String result = null;
		String Original="Welcome To Java";

		for(int i=Original.length()-1; i>=0; i--) {
			result=result+Original.charAt(i);
		}
		
		return result;
		
		
	}

	public static void main(String[] args) {
		String rev= ReverseFun();
		System.out.println("Reversed string is:"+ rev);
		

	}

}
