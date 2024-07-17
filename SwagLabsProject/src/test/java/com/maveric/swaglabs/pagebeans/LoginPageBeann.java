package com.maveric.swaglabs.pagebeans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageBeann {
	
	@FindBy( how = How.ID,  id = "user-name")
	private WebElement username;
	
	@FindBy( how = How.ID,  id = "password")
	private WebElement Password;
	
	@FindBy( how = How.XPATH,  xpath = "//input[@id='login-button']")
	private WebElement loginBtn;
	
	@FindBy(how = How.XPATH, xpath ="//div[@class='error-message-container error']")
	private WebElement errorMessage;
	
	public String getUsername() {
		return username.getText();
	}
	
	public String getPassword() {
		return Password.getText();
	}
	
	public String getErrorMsg() {
		return errorMessage.getText();
	}
	
	public void setUsername(String name) {
		username.sendKeys(name);
	}
	
	public void setPassword(String Password) {
		this.Password.sendKeys(Password);
	}
	
	public void clickLoginBtn() {
		loginBtn.submit();
	}
	

}
