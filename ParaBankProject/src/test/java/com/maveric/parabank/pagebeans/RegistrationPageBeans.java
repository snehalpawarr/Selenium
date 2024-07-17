package com.maveric.parabank.pagebeans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationPageBeans {
	
	@FindBy( how = How.XPATH,  xpath = "//div[@id=\"loginPanel\"]/form/following-sibling::p[2]/a")
	private WebElement RegisterBtn;
	
	@FindBy( how = How.XPATH,  xpath = "//input[@type='submit'][@value='Register']")
	private WebElement Submit;
	
	@FindBy( how = How.ID,  id = "customer.firstName")
	private WebElement FirstName;
	
	@FindBy( how = How.ID,  id = "customer.lastName")
	private WebElement LastName;
	
	@FindBy( how = How.ID,  id = "customer.address.street")
	private WebElement Address;
	
	@FindBy( how = How.ID,  id = "customer.address.city")
	private WebElement City;
	
	@FindBy( how = How.ID,  id = "customer.address.state")
	private WebElement State;
	
	@FindBy( how = How.ID,  id = "customer.address.zipCode")
	private WebElement ZipCode;
	
	@FindBy( how = How.ID,  id = "customer.phoneNumber")
	private WebElement Phone;
	
	@FindBy( how = How.ID,  id = "customer.ssn")
	private WebElement SSN;
	
	@FindBy( how = How.ID,  id = "customer.username")
	private WebElement UserName;
	
	@FindBy( how = How.ID,  id = "customer.password")
	private WebElement Password;
	
	@FindBy( how = How.ID,  id = "repeatedPassword")
	private WebElement ConfirmPassword;
	
	@FindBy( how = How.XPATH,   xpath = "//span[@id='customer.username.errors']")
	private WebElement Errormsg;
	
	
	
// firstName	lastName	address	city	state	zipCode	phone	sSN	userName	password	confirmPassword
			
	public WebElement getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName.sendKeys(firstName);
	}

	public WebElement getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName.sendKeys(lastName);
	}

	public WebElement getAddress() {
		return Address;
	}

	public void setAddress(String addRess) {
		Address.sendKeys(addRess);
	}

	public WebElement getCity() {
		return City;
	}

	public void setCity(String ciTy) {
		City.sendKeys(ciTy);
	}

	public WebElement getState() {
		return State;
	}

	public void setState(String staTe) {
		State.sendKeys(staTe);
	}

	public WebElement getZipCode() {
		return ZipCode;
	}

	public void setZipCode(String zipCode) {
		ZipCode.sendKeys(zipCode);
	}

	public WebElement getPhone() {
		return Phone;
	}

	public void setPhone(String phoNe) {
		Phone.sendKeys(phoNe);
	}

	public WebElement getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN.sendKeys(sSN);
	}

	public WebElement getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName.sendKeys(userName);
	}

	public WebElement getPassword() {
		return Password;
	}

	public void setPassword(String passWord) {
		Password.sendKeys(passWord);
	}

	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword.sendKeys(confirmPassword);
	}
	
	public void clickregister() {
		RegisterBtn.click();
	}
	public void Submit() {
		Submit.submit();
	}
	
	public void getError() {
		Errormsg.getText();
		
	}

	
	
	

}
