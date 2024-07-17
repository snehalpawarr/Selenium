package com.maveric.grid.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
	
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\snehald\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				
				options.setBinary("C:\\Users\\snehald\\Downloads\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
				options.addArguments("disable-infobars");
				
				WebDriver driver = new ChromeDriver(options);
	return driver;
	}

}






