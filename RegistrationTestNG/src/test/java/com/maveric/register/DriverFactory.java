package com.maveric.register;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\snehald\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				
				options.setBinary("C:\\Users\\snehald\\Downloads\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
				options.addArguments("disable-infobars");
				
				WebDriver driver = new ChromeDriver(options);
				
				//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				
		
		
		/*WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));*/
		
		
				
				
				
				
	return driver;
	}

}
