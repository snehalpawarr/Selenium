package CoreJavaPkj;

public class AddFloatNums {
	
	public static float AddFloat(float i, float j) {
		float sum = i+j;
		return sum;
		
	}

	public static void main(String[] args) {
		
		float a = 8.6f;
		float b= 9.7f;
		float result = AddFloat(a,b);
		System.out.println("Sum = "+result);
		
		

	}

}
