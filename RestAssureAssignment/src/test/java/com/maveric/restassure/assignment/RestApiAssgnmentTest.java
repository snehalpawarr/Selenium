package com.maveric.restassure.assignment;

import static org.hamcrest.CoreMatchers.equalToObject;

import org.apache.hc.core5.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.dockerjava.transport.DockerHttpClient.Response;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class RestApiAssgnmentTest {
	
	@BeforeClass
	public static void setUpEnv() {
		RestAssured.baseURI="https://petstore.swagger.io/v2";
	}
	
	
	@Test(testName ="Add new pet details")
	public void test1() {
		String payLoad ="{id:344,name:Doggie,status:available}";
		RestAssured.given()
		.contentType(ContentType.JSON)
		.body(payLoad)
		.post("/create")
		.then()
		.assertThat()
		.statusCode(HttpStatus.SC_CREATED)
		.and()
		.body("message",equalToObject("Successfully! Record has been added."));
		
		Response response = (Response) RestAssured.given();
		Assert.assertEquals(response.getStatusCode(),200);
		
		String  responseBody=RestAssured.get("/employees").then().assertThat().statusCode(200).and().log().body().toString();
		System.out.println("Response body is: " +responseBody);
	}
	
	
	
	
	
	
	@AfterClass
	public static void tearDownEnv() {
		RestAssured.reset();
	}

}
