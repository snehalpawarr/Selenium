package CoreJavaPkj;

public class ArithmeticOperation {
	
	public static int  Arithmetic(int i, int j, String operator) {
		int result=0;
		
		switch(operator) {
		case "add":
			result=i+j;
			break;
		case "subs":
			result= i-j;
			break;
		case "multiplication":
			result= i*j;
			break;
		case "division":
			if(j==0)
				System.out.println("Cannot divide by 0");
			else
				result=i/j;
			break;
		default:
			System.out.println("Invalid operator");	
		}
		return result;
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		
	// int sum=Arithmetic(3,5,"add");
	System.out.println(Arithmetic(3,5,"add"));
	System.out.println(Arithmetic(9,1,"subs"));
	System.out.println(Arithmetic(9,1,"multiplication"));
	System.out.println(Arithmetic(12,3,"division"));
		

	}

}
