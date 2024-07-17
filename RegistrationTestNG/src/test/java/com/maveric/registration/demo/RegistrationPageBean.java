package com.maveric.registration.demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class RegistrationPageBean {
		
	@FindBy (how = How.XPATH, using = "//input[@ng-model='FirstName']")
	private WebElement FirstName;
	
	@FindBy (how = How.XPATH, using = "//input[@ng-model='LastName']")
	private WebElement LastName;
	
	@FindBy (how = How.XPATH, using = "//textarea[@ng-model='Adress']")
	private WebElement Address;
	
	@FindBy (how = How.XPATH, using = "//input[@ng-model='EmailAdress']")
	private WebElement Email;
	
	@FindBy (how = How.XPATH, using = "//input[@ng-model='Phone']")
	private WebElement Phone;
	
	@FindBy (how = How.XPATH, using = "//input[@ng-model='radiovalue']")
	private WebElement Gender;
	
	@FindBy (how = How.XPATH, using = "//input[@id='checkbox1']")
	private WebElement Hobbies;
	
	@FindBy (how = How.XPATH, using = "//div[@id='msdd']")
	private WebElement Language;
	
	@FindBy (how = How.XPATH, using = "//select[@id='Skills']")
	private WebElement Skills;
	
	@FindBy (how = How.XPATH, using = "//select[@id='countries']")
	private WebElement Country;
	
	@FindBy (how = How.XPATH, using = "//span[@id='select2-country-container']")
	private WebElement SelectCountry;
	
	@FindBy (how = How.XPATH, using = "//select[@id='yearbox']")
	private WebElement DOBYear;
	
	@FindBy (how = How.XPATH, using = "//select[@ng-model='monthbox']")
	private WebElement DOBMonth;
	
	@FindBy (how = How.XPATH, using = "//select[@id='daybox']")
	private WebElement DOBDay;
	
	
	    public String getFirstName() {
			return FirstName.getText();
		}
		public void setFirstname(String username) {
			this.FirstName.sendKeys(username);
		}
		
		public String getLastName() {
			return FirstName.getText();
		}
		public void setLastname(String username) {
			this.LastName.sendKeys(username);
		}	
		
		public void setAddress(String address) {
			this.Address.sendKeys(address);
		}	
		
		public void setEmail(String email) {
			this.Email.sendKeys(email);
		}
		
		public void setPhone(String phone) {
			this.Phone.sendKeys(phone);
		}
		
		public void setGender() {
			this.Gender.click();
		}
		
		public void setHobbies() {
			this.Hobbies.click();
		}
		
		public void setLanguage() {
			this.Language.getText();
		}
		
		public void setSkills() {
			this.Skills.click();
		}
		
		public void setCountry() {
			this.Country.click();
		}
	
	
	
	
	
	
	
	

	
}
