package com.maveric.selenium.TextBoxDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.maveric.selenium.SeleniumDemo.DriverFactory;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  DriverFactory.getDriver();
		driver.get("http://www.rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
		
		Actions actionn = new Actions(driver);
		WebElement hover1= driver.findElement(By.xpath("//button[@id='mousehover']"));
		WebElement hover2= driver.findElement(By.xpath("//a[normalize-space()='Reload']"));
		
		actionn.moveToElement(hover1).moveToElement(hover2).click().perform();
		
		driver.close();

	}

}
