package com.maveric.selenium.TextBoxDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.maveric.selenium.SeleniumDemo.DriverFactory;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =  DriverFactory.getDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
		Thread.sleep(3000);
		
		driver.switchTo().frame("iframeResult");
		Actions actionn = new Actions(driver);
		WebElement doubleclick= driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		
		 actionn.doubleClick(doubleclick).perform();
		 driver.close();


	}

}
