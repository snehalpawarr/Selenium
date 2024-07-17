package CoreJavaPkj;

public class JavaLoops {
	
	public void PrintUsingFor() {
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
	}

	
	
	public void PrintUsingWhile() {
		int count=1;
		while(count<=100) {
			System.out.print(count+" ");
			count++;
		}
		}
	
	public static void main(String[] args) {
		JavaLoops obj = new JavaLoops();
		System.out.println("Using For loop");
		obj.PrintUsingFor();
		
		System.out.println("\nUsing While loop");
		obj.PrintUsingWhile();
		
	}

}
