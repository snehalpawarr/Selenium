package com.maveric.selenium.TextBoxDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.maveric.selenium.SeleniumDemo.DriverFactory;

public class TableData {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  DriverFactory.getDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		int rows = driver.findElements(By.xpath("//table[@id='customers']//tbody/tr")).size();
		System.out.println("Rows: "+ rows);
		
		int columns = driver.findElements(By.xpath("//table[@id='customers']//tbody/tr/th")).size();
		System.out.println("Columns: "+ columns);

	}

}
