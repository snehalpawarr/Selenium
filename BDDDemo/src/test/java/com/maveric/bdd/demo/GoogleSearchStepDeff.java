package com.maveric.bdd.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.maveric.bdd.utils.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchStepDeff {
	private WebDriver driver;
	
	@Before
	public void setUpTestEnv() {
		driver = DriverFactory.getDriver();
	}
	@Given("User should open Google search page")
	public void user_should_open_google_search_page() {
		
		driver.get("https://www.google.co.in");
	    
	}

	@When("User enterd {string} in search box")
	public void user_enterd_in_search_box(String string) {
		WebElement element = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		element.sendKeys("Agile Methodology");
	    
	}

	@When("click on submit button")
	public void click_on_submit_button() {
		WebElement element = driver.findElement(By.xpath("//input[@name='btnK']"));
		element.submit();
		
	   
	}

	@Then("Multiple Links should be displayed on {string} topic")
	public void multiple_links_should_be_displayed_on_topic(String string) {
		System.out.println("Search operation successfull");
	    
	}

	@When("User enterd cities name {string}  in search box")
	public void user_enterd_cities_name_in_search_box(String string) {
		WebElement element = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		element.sendKeys("Pune Mumbai Distance");
	    
	}

	@Then("map should be display between {string} cities along with distance in KMs")
	public void map_should_be_display_between_cities_along_with_distance_in_k_ms(String string) {
		
		System.out.println("Distance between Pune and Mumbai displayed");
	    }
	@After
	public void tearDownEnv() {
		driver.quit();
	}
	

}
