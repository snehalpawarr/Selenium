package com.maveric.selenium.TextBoxDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.maveric.selenium.SeleniumDemo.DriverFactory;

public class Googlesearch {

	public static void main(String[] args) {
		
		//Set the ChromeDriver and open URL
		WebDriver driver =  DriverFactory.getDriver();
		driver.get("https://www.google.co.in");
		
		
		By byName= By.name("q");
		WebElement element = driver.findElement(byName);
		element.sendKeys("Selenium Java");
		
		WebElement SubmitButton = driver.findElement(By.name("btbK"));
		SubmitButton.submit();
		driver.close();
		

	}

}
