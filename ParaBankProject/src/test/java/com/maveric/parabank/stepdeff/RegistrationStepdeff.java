package com.maveric.parabank.stepdeff;


import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.maveric.parabank.databeans.RegistrationDataBeans;
import com.maveric.parabank.pagebeans.RegistrationPageBeans;
import com.maveric.parabank.utils.DriverFactory;


import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationStepdeff {
	public WebDriver driver;
	public RegistrationDataBeans RegisterDbean = new RegistrationDataBeans(); 
	public RegistrationPageBeans RegisterPbean = new RegistrationPageBeans();
	
	@Before()
	public void setUpTestEnv() {
		
		driver = DriverFactory.getDriver();
		RegisterPbean = PageFactory.initElements(driver, RegistrationPageBeans.class);
		
	}
	
	@Given("User is on the ParaBank homepage")
	public void user_is_on_the_para_bank_homepage() {
		driver.get("https://parabank.parasoft.com/");
		
		
	    
	}

	@When("User navigate to the registration page")
	public void user_navigate_to_the_registration_page() throws InterruptedException {
		RegisterPbean.clickregister();
		Thread.sleep(2000);
		
	    
	}
	
	@DataTableType
	public RegistrationDataBeans registerbeandata(Map<String, String> registbean) {
		RegistrationDataBeans Rbean = new RegistrationDataBeans();
		Rbean.setFirstname(registbean.get("firstname"));
		Rbean.setLastname(registbean.get("lastname"));
		Rbean.setAddress(registbean.get("address"));
		Rbean.setCity(registbean.get("city"));
		Rbean.setState(registbean.get("state"));
		Rbean.setZipcode(registbean.get("zipcode"));
		Rbean.setPhone(registbean.get("phone"));
		Rbean.setSsn(registbean.get("ssn"));
		Rbean.setUsername(registbean.get("username"));
		Rbean.setPassword(registbean.get("password"));
		Rbean.setConfirmpassword(registbean.get("confirmpassword"));
		
		return Rbean;
	}

	@When("enter valid registration details")
	public void enter_valid_registration_details(RegistrationDataBeans Rbean) throws InterruptedException {
		
		RegisterPbean.setFirstName(Rbean.getFirstname());
		RegisterPbean.setLastName(Rbean.getLastname());
		RegisterPbean.setAddress(Rbean.getAddress());
		RegisterPbean.setCity(Rbean.getCity());
		RegisterPbean.setState(Rbean.getState());
		RegisterPbean.setZipCode(Rbean.getZipcode());
		RegisterPbean.setPhone(Rbean.getPhone());
		RegisterPbean.setSSN(Rbean.getSsn());
		RegisterPbean.setUserName(Rbean.getUsername());
		RegisterPbean.setPassword(Rbean.getPassword());
		RegisterPbean.setConfirmPassword(Rbean.getConfirmpassword());
		Thread.sleep(2000);
		System.out.println("Registration Successfull!!!");
	   
	}

	@When("submit the registration form")
	public void submit_the_registration_form() throws InterruptedException {
		RegisterPbean.Submit();
		Thread.sleep(2000);
		
	    
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
	   
	}

	@When("enter registration details with an existing username")
	public void enter_registration_details_with_an_existing_username(RegistrationDataBeans Rbean) throws InterruptedException {
		
		RegisterPbean.setFirstName(Rbean.getFirstname());
		RegisterPbean.setLastName(Rbean.getLastname());
		RegisterPbean.setAddress(Rbean.getAddress());
		RegisterPbean.setCity(Rbean.getCity());
		RegisterPbean.setState(Rbean.getState());
		RegisterPbean.setZipCode(Rbean.getZipcode());
		RegisterPbean.setPhone(Rbean.getPhone());
		RegisterPbean.setSSN(Rbean.getSsn());
		RegisterPbean.setUserName(Rbean.getUsername());
		RegisterPbean.setPassword(Rbean.getPassword());
		RegisterPbean.setConfirmPassword(Rbean.getConfirmpassword());
		Thread.sleep(2000);
		System.out.println("Registration Failed!!");
	    
	}

	@Then("User should see an error message indicating the username is taken")
	public void user_should_see_an_error_message_indicating_the_username_is_taken() {
		
		//RegisterPbean.getError();
	    
	}

}
