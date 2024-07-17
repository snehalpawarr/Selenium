package com.maveric.restassure.fakepi;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.equalToObject;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.hc.core5.http.HttpStatus;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.maveric.resassure.AuthConstant.ClientAuthConstant;
import com.maveric.restassure.pojo.AirlinePojo;
import com.maveric.restassure.pojo.PassengerPojo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import junit.framework.Assert;

public class FakeApiTest {
	
	@BeforeClass
	public static void setUpEnv() {
		RestAssured.baseURI="https://api.instantwebtools.net/v1";
	}
	
	@Test(testName ="Get all Airline details")
	public  void test1(){
		String responsebody = RestAssured.get("/airlines").then().assertThat().statusCode(200).and().extract()
				.asString();
		System.out.println(responsebody);		
	}
	
	
	
	 
	
	@Test(testName = "Create airline data.")
	public void test2() throws StreamReadException, DatabindException, IOException {
 
		ObjectMapper mapper = new ObjectMapper();
		FileInputStream stream = new FileInputStream(new File("./TestData/AirlineData.json"));
		AirlinePojo payload = mapper.readValue(stream, AirlinePojo.class);
 
		ValidatableResponse response = RestAssured.given()
		.contentType(ContentType.JSON)
		.body(payload)
		.post("/airlines")
		.then()
		.assertThat()
		.statusCode(HttpStatus.SC_OK)
		.and()
		.body("name", equalTo("Sri Lankan Airways"))
		.log()
		.all();
 
	}	
	
	
	@Test(testName ="Get specific airline details by id")
	public void test3() {
		
		String airLineID = "7bd858ce-07fb-457f-9947-3b624e8e9f8f";
		 
		RestAssured.given().pathParam("id", airLineID).get("/airlines/{id}").then().assertThat().statusCode(200).and()
				.body("_id", equalToObject(airLineID)).log().all();
	}
	
	
	
	@Test(testName ="Get all passenger details")
	public  void test4(){
		
		Response response =RestAssured.get("/passenger?page=0&size=10");
		Assert.assertEquals(response.getStatusCode(),200);
		
		String responsebody = RestAssured.get("/passenger?page=0&size=10").then().assertThat().statusCode(200).and().extract()
				.asString();
		System.out.println(responsebody);		
	}
	
	
	@Ignore
	@Test(testName = "Create passenger data.")
	public void test5() throws StreamReadException, DatabindException, IOException {
 
		ObjectMapper mapper = new ObjectMapper();
		FileInputStream stream = new FileInputStream(new File("./TestData/PassengerData.json"));
		PassengerPojo payload = mapper.readValue(stream, PassengerPojo.class);
 
		ValidatableResponse response = RestAssured.given()
		.contentType(ContentType.JSON)
		.body(payload)
		.post("/passenger")
		.then()
		.assertThat()
		.statusCode(HttpStatus.SC_OK)
		.and()
		.body("name", equalTo("John Doe"))
		.log()
		.all();
 
	}	

	
	
	
	
	@Test(testName = "Get Passenger Data by passenger ID")
	public void test6() {
		String passengerID = "667945df7ad8fb0bc9433c48";
 
		RestAssured.given().pathParam("id", passengerID).get("/passenger/{id}").then().assertThat().statusCode(200)
				.and().body("_id", equalToObject(passengerID)).log().all();
	}
	
	
	
	@Test(testName = "Update every detail of a passenger.")
	public void test7() {
				
		String passengerID = "6679447b7ad8fb3f5e433c33";
		String newname = "Haulmer Airlines";
	    int trips = 500;
	    int airline = 10;
	
	     String requestBody = "{\n" +
	             "    \"name\": \"" + newname + "\",\n" +
	             "    \"salary\": " + trips + ",\n" +
	             "    \"age\": " + airline + "\n" +
	             "}";
	
	     
	             Response response = RestAssured.given()
	             .contentType(ContentType.JSON)
	             .pathParam("id",passengerID)
	             .body(requestBody)
	             .put("/passenger/{id}");
	             System.out.println(requestBody);	
	}
	
	@Test(testName ="Delete Passenger details")
	 public void test8() {
		 
		
	     String name = "John";   
	     Response response = RestAssured.given()
	    		 .contentType(ContentType.JSON)
	    		 .delete("/passenger/" + name);
	  
	     System.out.println("Deleted successfully ");
	 
	 }
	
	
	@Test(testName = "patch name  of a passenger.")
	public void test9() {
				
		String passengerID = "667aafa07ad8fbcd834342a6";
		String newname = "Snehal patil";
	    
	     String requestBody = "{\n" +
	             "    \"name\": \"" + newname + "\",\n" +
	            
	             "}";
 
	     RestAssured.given()
				 .when()
	             .pathParam("id",passengerID)
	             .body(requestBody)
	             .put("/passenger/{id}");
	             System.out.println(requestBody);
		
	}

	
}
