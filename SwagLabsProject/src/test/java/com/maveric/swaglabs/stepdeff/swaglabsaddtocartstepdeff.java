package com.maveric.swaglabs.stepdeff;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.maveric.bdd.utils.DriverFactory;
import com.maveric.swaglabs.dataBeans.CustomerDataBean;
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

public class swaglabsaddtocartstepdeff {
	private WebDriver driver;
	private LoginPageBeann bean;
	private ProductDataBean pbean;
	private UserDataBean dataBean;
	private AddToCartPageBean addToCart;
	private CustomerDataBean cbean;


	@Before
	public void setUpTestEnv() {
		driver = DriverFactory.getDriver();
		bean = PageFactory.initElements(driver, LoginPageBeann.class);
		addToCart = PageFactory.initElements(driver, AddToCartPageBean.class);
	}

	@Given("User is successfully logged in to SwagLabs account")
	public void user_is_successfully_logged_in_to_swag_labs_account() {

		driver.get("https://www.saucedemo.com/");
		bean.setUsername("standard_user");
		bean.setPassword("secret_sauce");
		bean.clickLoginBtn();
	}

	@DataTableType
	public ProductDataBean productdataBean(List<String> productbean) {
		ProductDataBean pbean = new ProductDataBean();
		pbean.setProduct(productbean.getFirst());
		return pbean;
	}



	@When("User click on Add to cart for multiple products")
	public void user_click_on_add_to_cart_for_multiple_products(List<ProductDataBean> productbean) throws InterruptedException {
		for (ProductDataBean pbean : productbean) {
			System.out.println("Product: " + pbean.getProduct());
			
			if (pbean.getProduct().equals("Sauce Labs Backpack"))
				addToCart.addItem1();
			else if (pbean.getProduct().equals("Sauce Labs Bike Light"))
				addToCart.addItem2();
			else if (pbean.getProduct().equals("Sauce Labs Bolt T-Shirt"))
				addToCart.addItem3();
		}
		Thread.sleep(1000);

	}

	@When("click on the cart")
	public void click_on_the_cart() {
		addToCart.openCart();

	}

//	@Then("User should view the products in the cart")
//	public void user_should_view_the_products_in_the_cart() {
//
//	}

	@Then("User clicks on Checkout button.")
	public void user_clicks_on_checkout_button() throws InterruptedException {
		 addToCart.checkout();
		 Thread.sleep(1000);

	}

	@DataTableType
	public CustomerDataBean customerbeandata(Map<String, String> custbean) {
		CustomerDataBean cbean = new CustomerDataBean();
		cbean.setFirstname(custbean.get("FirstName"));
		cbean.setLastname(custbean.get("LastName"));
		cbean.setPostalcode(custbean.get("PostalCode"));
		return cbean;
	}
	
	
	@Then("User should Enter Customer details")
	public void user_should_enter_customer_details(CustomerDataBean cbean) throws InterruptedException {
		
		addToCart.setFirstname(cbean.getFirstname());
		addToCart.setLastname(cbean.getLastname());
		addToCart.setPostalcode(cbean.getPostalcode());
		Thread.sleep(2000);

	}

	@Then("Click on Continue.")
	public void click_on_continue() {
		 addToCart.continuebtn();

	}

	//@Then("User should view Checkout overview")
	//public void user_should_view_checkout_overview() {

	//}

	@Then("Click on Finish.")
	public void click_on_finish() {
		 addToCart.finish();

	}

	@After
	public void tearDownEnv(Scenario scenario) {
		if (scenario.isFailed()) {
			TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
			byte[] screenShot = takesScreenshot.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenShot, "image/png", "errorScreen");
		}
		// driver.quit();
	}

}
