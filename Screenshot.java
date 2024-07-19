package com.maveric.selenium.TextBoxDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.maveric.selenium.SeleniumDemo.DriverFactory;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver =  DriverFactory.getDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		
		
		TakesScreenshot takescreenshot = (TakesScreenshot)driver;
		File src = takescreenshot.getScreenshotAs(OutputType.FILE);
		//Below line will create a folder "Screenshot" in current location and store the screenshot in that folder
		File trg = new File(".\\Screenshot\\screenshot1.png");
		FileUtils.copyFile(src, trg);
		
		System.out.println("Screenshot captured successfully");
		
		

	}

}
