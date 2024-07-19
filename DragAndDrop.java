package com.maveric.selenium.TextBoxDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.maveric.selenium.SeleniumDemo.DriverFactory;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  DriverFactory.getDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(3000);
		
		Actions actionn = new Actions(driver);
		WebElement doubleclick1= driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement doubleclick2= driver.findElement(By.xpath("//div[@id='box102']"));
		
		actionn.dragAndDrop(doubleclick1, doubleclick2).perform();
		
		driver.close();
		

	}

}
