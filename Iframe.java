package com.maveric.selenium.TextBoxDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.maveric.selenium.SeleniumDemo.DriverFactory;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  DriverFactory.getDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(3000);
		
		WebElement hover2= driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']"));
		hover2.click();
		
		WebElement outerframe= driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		driver.switchTo().frame(outerframe);
		
		Thread.sleep(1000);
		WebElement innerframe= driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(innerframe);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome");
		
		//driver.close();

	}

}
