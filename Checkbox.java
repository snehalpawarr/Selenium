package com.maveric.selenium.TextBoxDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.maveric.selenium.SeleniumDemo.DriverFactory;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  DriverFactory.getDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		
		//Select single checkbox
		WebElement SingleCheckbox = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		boolean Isselected = SingleCheckbox.isSelected();
		if(Isselected == false)
			SingleCheckbox.click();
		
		List<WebElement> totalCheckbox= driver.findElements(By.xpath("//input[@class='col-md-4 col-xs-4 col-sm-4']"));
		System.out.println("total options:"+ totalCheckbox);
		
		for(WebElement chck : totalCheckbox) {
			
			System.out.println(chck);
			chck.click();
			
		}
		driver.close();

	}

}
