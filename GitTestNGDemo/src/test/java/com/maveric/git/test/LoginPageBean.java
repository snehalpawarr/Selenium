package com.maveric.git.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageBean {
	@FindBy (how = How.NAME, using = "login")
	private WebElement Username;
	
	@FindBy (how = How.NAME, using = "password")
	private WebElement Password;
	
	@FindBy (how = How.XPATH, using = "//input[@type='submit']")
	private WebElement SubmitBtn;
	
	@FindBy (how = How.XPATH, using = "//*[@id=\\\"js-flash-container\\\"]/div")
	private WebElement ErrorMssg;
	
	public String getUsername() {
		return Username.getText();
	}
	public void setUsername(String username) {
		this.Username.sendKeys(username);
	}
	public String getPassword() {
		return Password.getText();
	}
	public void setPassword(String password) {
		this.Password.sendKeys(password);
	}
	public String getErrormsg() {
		return ErrorMssg.getText();
	}
	public void signIn() {
		this.SubmitBtn.submit();
	}
	
	
}
