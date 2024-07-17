package CoreJavaPkj;


class AgeOutOfRangeException extends Exception {
    public AgeOutOfRangeException(String message) {
        super(message);
    }
}



class CheckAge{
private int age;

public void setAge(int age) throws AgeOutOfRangeException {
    if (age < 25 || age > 55) {
        throw new AgeOutOfRangeException("Age should be between 25 and 55");
    }
    this.age = age;
}

public int getAge() {
    return age;
}
}



public class AgeException {
	
	 public static void main(String[] args) {
	        CheckAge person = new CheckAge();

	        try {
	            // Try setting age below 25
	            person.setAge(20);
	            System.out.println("Age set successfully: " + person.getAge());
	        } catch (AgeOutOfRangeException e) {
	            System.out.println("Age error: " + e.getMessage());
	        }

	        try {
	            // Try setting age above 55
	            person.setAge(65);
	            System.out.println("Age set successfully: " + person.getAge());
	        } catch (AgeOutOfRangeException e) {
	            System.out.println("Age error: " + e.getMessage());
	        }

	        try {
	            // Try setting age within valid range
	            person.setAge(34);
	            System.out.println("Age set successfully: " + person.getAge());
	        } catch (AgeOutOfRangeException e) {
	            System.out.println("Age error: " + e.getMessage());
	        }
	    }

}
