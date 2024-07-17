package CoreJavaPkj;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CurrentDate {
	
	String CurrDate() {
		LocalDate CurrDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String Current = CurrDate.format(formatter);
		
		return Current;
	}

	public static void main(String[] args) {
		
		CurrentDate obj = new CurrentDate();
		System.out.println("Current Date is: "+obj.CurrDate());
		

	}

}
