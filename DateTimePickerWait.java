package com.maveric.selenium.TextBoxDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.maveric.selenium.SeleniumDemo.DriverFactory;

public class DateTimePickerWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  DriverFactory.getDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		ExpectedCondition<WebElement> elementclickable = ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='departure']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement element = wait.until(elementclickable);
		
		WebElement element2 = driver.findElement(By.xpath("//label[@for='departure']"));
		element2.click();
		
		Thread.sleep(2000);
		
		WebElement element3 = driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--selected']"));
		element3.click();

		driver.close();
		

	}

}
