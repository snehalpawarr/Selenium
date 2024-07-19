package com.maveric.selenium.TextBoxDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.maveric.selenium.SeleniumDemo.DriverFactory;

public class GitHubDemo {

	public static void main(String[] args) {
		WebDriver driver =  DriverFactory.getDriver();
		driver.get("https://www.GitHub.com/login");
		
		//Enter Username
		By by = By.id("login_field");
		WebElement element = driver.findElement(by);
		element.sendKeys("snehald");
		
		//Enter Password
		By by1 = By.id("password");
		WebElement element1 = driver.findElement(by1);
		element1.sendKeys("Sneh@123");
		
		//Click on submit button
		By by2 = By.name("commit");
		WebElement element2 = driver.findElement(by2);
		element2.submit();
		
		driver.close();


  
	}

}
