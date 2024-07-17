package com.maveric.swaglabs.pagebeans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddToCartPageBean {
	
	@FindBy( how = How.ID,  id = "add-to-cart-sauce-labs-backpack")
	private WebElement item1;
	
	@FindBy( how = How.ID,  id = "add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement item2;
	
	@FindBy( how = How.ID,  id = "add-to-cart-sauce-labs-bike-light")
	private WebElement item3;
	
	@FindBy( how = How.XPATH,  xpath = "//a[@class='shopping_cart_link']")
	private WebElement cart;
	
	@FindBy( how = How.ID,  id = "checkout")
	private WebElement checkout;
	
	@FindBy( how = How.ID,  id = "continue")
	private WebElement continueBtn;
	
	@FindBy( how = How.ID,  id = "cancel")
	private WebElement cancelbtn;
	
	@FindBy( how = How.ID,  id = "finish")
	private WebElement finish;
	
	@FindBy( how = How.ID,  id = "first-name")
	private WebElement firstname;
	
	@FindBy( how = How.ID,  id = "last-name")
	private WebElement lastname;
	
	@FindBy( how = How.ID,  id = "postal-code")
	private WebElement postalcode;
	
	public void addItem1() {
		item1.click();		
	}
	public void addItem2() {
		item2.click();		
	}
	public void addItem3() {
		item3.click();		
	}
	
	public void openCart() {
		cart.click();
	}
	
	public void checkout() {
		checkout.click();
	}
	public void continuebtn() {
		continueBtn.click();
	}
	public void finish() {
		finish.click();
	}
	
	public void setFirstname(String FirstName) {
		firstname.sendKeys(FirstName);
	}
	
	public void setLastname(String LastName) {
		lastname.sendKeys(LastName);
	}
	
	public String getFirstname() {
		return firstname.getText();
	}
	
	public String getLastname() {
		return lastname.getText();
	}
	
	public void setPostalcode(String PostalCode) {
		postalcode.sendKeys(PostalCode);
	}
	
	public String getPostalcode() {
		return postalcode.getText();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//@FindBy( how = How.ID,  id = "continue-shopping")
	//private WebElement continueshopping;
	

	
	//public void continueshopping() {
		//continueshopping.click();
	//}
	
	
	
	/*public void setFirstname() {
		firstname.sendKeys("Snehal");
	}
	
	public String getFirstname() {
		return firstname.getText();
	}
	
	public void setLastname( ) {
		lastname.sendKeys("Pawar");
	}
	
	public String getLastname() {
		return lastname.getText();
	}
	
	
	}*/
}
