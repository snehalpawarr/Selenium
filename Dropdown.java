package com.maveric.selenium.TextBoxDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.maveric.selenium.SeleniumDemo.DriverFactory;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  DriverFactory.getDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		
		
		WebElement element = driver.findElement(By.xpath("//select[@id='Skills']"));
		element.click();
		
		Select slct = new Select(element);
		slct.selectByIndex(0);
		
		List<WebElement> dropdown = slct.getOptions();
		
		for(WebElement el : dropdown) { 
			System.out.println(el.getText());
		}
			
			//WebElement firstselectedoption = slct.getFirstSelectedOption();
			//System.out.println(firstselectedoption.getText());
		
		driver.close();
		}

	

}
