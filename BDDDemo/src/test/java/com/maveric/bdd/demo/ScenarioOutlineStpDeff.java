package com.maveric.bdd.demo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineStpDeff {
	
	
	
	@Given("User should open Google translater page")
	public void user_should_open_google_translater_page() {
	   
	}

	@When("User enterd {string} word from {string}  language and select {string} language")
	public void user_enterd_word_from_language_and_select_language(String string, String string2, String string3) {
		
		System.out.println("Word: "+string+" From: "+string2+"To: "+string3);
	    
	}

	@Then("Google translater should display word {string} into {string} language")
	public void google_translater_should_display_word_into_language(String string, String string2) {
	    
	}

}
