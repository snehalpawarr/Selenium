package CoreJavaPkj;

public class PrivateDemo {

	public static void main(String[] args) {
		PrivateDemoClass obj = new PrivateDemoClass();
		
		obj.setName("Snehal");
		obj.setAge(25);
		System.out.println("Name is: "+ obj.getName());
		System.out.println("Age is: "+ obj.getAge());

	}

}
