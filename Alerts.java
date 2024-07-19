package com.maveric.selenium.TextBoxDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.maveric.selenium.SeleniumDemo.DriverFactory;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =  DriverFactory.getDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Yess");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		driver.close();

	}

}
