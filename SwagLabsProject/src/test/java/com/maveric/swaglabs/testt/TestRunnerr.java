package com.maveric.swaglabs.testt;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features =  "Features" , glue = "com.maveric.swaglabs.stepdeff" ,
         //plugin = {"pretty", "html:Reports/HtmlReports/SwagLabsTest-reports.html"}
		//plugin = { "pretty", "json:Reports/JSONReports/SwagLabsTest-reports.json" }
		//plugin = { "pretty", "junit:Reports/JunitReports/Cucumber-reports.xml" }
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

     )
public class TestRunnerr {

}
