package com.maveric.registration.demo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.maveric.register.DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RegisterTest {
 
	private WebDriver driver;
	private RegistrationPageBean pageBean;
	
	 @BeforeMethod
	  public void setUpTestEnv() {
		  driver=DriverFactory.getDriver();
		  driver.get("https://demo.automationtesting.in/Register.html");
		  pageBean = PageFactory.initElements(driver, RegistrationPageBean.class);
		  
	  }
	 
	 
	 @Test (testName= "Test Git login functionality for invalid credentials")
	  public void test1() {
		 
		 pageBean.setFirstname("Snehal");
		 pageBean.setLastname("Pawar");
		 pageBean.setAddress("Kharadi, Pune, Maharashtra");
		 pageBean.setEmail("snehald@gmail.com");
		 pageBean.setPhone("8756376482");
		 pageBean.setGender();
		 pageBean.setHobbies();
		 pageBean.setLanguage();
		 pageBean.setSkills();
		 pageBean.setCountry();
		 
	 }

}
