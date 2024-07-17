package com.maveric.git.test;

import org.testng.annotations.Test;

import com.maveric.git.dataprovider.GitTestDataProvider;
import com.maveric.selenium.GitHubTestNGDemo.DriverFactory;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LoginTest {
	
	private WebDriver driver;
	private LoginPageBean pageBean;
	
  @BeforeMethod
  public void setUpTestEnv() {
	  driver=DriverFactory.getDriver();
	  driver.get("https://www.github.com/login");
	  pageBean = PageFactory.initElements(driver, LoginPageBean.class);
	  
  }
	
  @Test (dataProviderClass = TestDataProviderExcel.class , dataProvider= "getInvalidUserNameOrInvalidPassword")
  public void test1(String username, String password) {
	   
	  pageBean.setUsername(username);
	  pageBean.setPassword(password);
	  //pageBean.signIn();
	  
	  //String ActualError= pageBean.getErrormsg();
	  //String ExpectedError = "Incorrect username or password.";
	  
	  //Assertions.assertEquals(ExpectedError,ActualError);
	  
  }
  
  /*
  @Test (dataProviderClass = GitTestDataProvider.class , dataProvider= "getvaliduserNameAndPassword")
  public void test2(String username, String password) {
  pageBean.setUsername(username);
  pageBean.setPassword(password);
  }
  */
  
  @AfterMethod
  public void TearDownTestEnv() {
	  driver.close();
  }

}
