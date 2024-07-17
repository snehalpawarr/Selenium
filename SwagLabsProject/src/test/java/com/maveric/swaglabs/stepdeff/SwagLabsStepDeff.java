package com.maveric.swaglabs.stepdeff;

import java.util.Map;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.util.Assert;
import com.maveric.bdd.utils.DriverFactory;
import com.maveric.swaglabs.dataBeans.ProductDataBean;
import com.maveric.swaglabs.dataBeans.UserDataBean;
import com.maveric.swaglabs.pagebeans.AddToCartPageBean;
import com.maveric.swaglabs.pagebeans.LoginPageBeann;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwagLabsStepDeff {
	private WebDriver driver;
	 LoginPageBeann bean;
	 AddToCartPageBean ACbean;
	 ProductDataBean pdataBean;
	
	@Before()
	public void setUpTestEnv() {
		
		driver = DriverFactory.getDriver();
		bean = PageFactory.initElements(driver, LoginPageBeann.class);

	}
	
	@Given("User is on Swag Labs login page")
	public void user_is_on_swag_labs_login_page() {
	    driver.get("https://www.saucedemo.com/");
	}
	
	
	@DataTableType
	public UserDataBean userBeanData(Map<String, String> inputData) {
		UserDataBean dataBean = new UserDataBean();
		dataBean.setUserName(inputData.get("userName"));
		dataBean.setpassword(inputData.get("password"));
		return dataBean;}

	@When("User enter wrong credentials")
	public void user_enter_wrong_credentials(UserDataBean dataBean) {
		bean.setUsername(dataBean.getUserName());
		bean.setPassword(dataBean.getpassword());
		bean.clickLoginBtn();
		
		String expectedErrorMsg = "Epic sadface: Username and password do not match any user in this service";
		String actualErrorMsg = bean.getErrorMsg();
		org.junit.Assert.assertEquals(expectedErrorMsg, actualErrorMsg);

		bean.getErrorMsg();
		
		System.out.println("Error is:"+bean.getErrorMsg());
		
	    
	}

	@When("click on login")
	public void click_on_login() {
		bean.clickLoginBtn();
	    
	}

	@Then("{string} message should display")
	public void message_should_display(String string) {
		System.out.println("Error is:"+bean.getErrorMsg());
	   
	}

	@When("User enter valid credentials")
	public void user_enter_valid_credentials(UserDataBean dataBean) {
		
		bean.setUsername(dataBean.getUserName());
		bean.setPassword(dataBean.getpassword());
		
		//org.junit.Assert.fail();		
	    
	}

	@Then("user should be able to view Swag Labs home page")
	public void user_should_be_able_to_view_swag_labs_home_page() {
	   
	}
	
	@After
	public void tearDownEnv(Scenario scenario) {
		if(scenario.isFailed()) {
			TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
			byte [] screenShot= takesScreenshot.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenShot, "image/png", "errorScreen");
		}
		driver.quit();
	}
	
	



}
