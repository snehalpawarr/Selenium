package com.maveric.parabank.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
	
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\snehald\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				
				options.setBinary("C:\\Users\\snehald\\Downloads\\chrome-win64 (2)\\chrome-win64\\chrome.exe");
				options.addArguments("disable-infobars");
				WebDriver driver = new ChromeDriver(options);
				driver.manage().window().maximize();
		
	return driver;

	}

}
