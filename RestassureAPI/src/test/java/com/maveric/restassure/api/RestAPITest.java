package com.maveric.restassure.api;

//import static org.hamcrest.CoreMatchers.equalToObject;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.hc.core5.http.HttpStatus;
import org.hamcrest.CoreMatchers;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.maveric.restassure.pojo.EmployeePojo;
import com.maveric.restassure.pojo.employeeCSVpojo;
import com.opencsv.bean.CsvToBeanBuilder;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestAPITest {
	
	@BeforeClass
	public static void setUpEnv() {
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
	}
		
		@Test(testName ="Get all employees details")
		public  void test1() throws JsonMappingException, JsonProcessingException {
			Response response= RestAssured.get("/employees");
			Assert.assertEquals(response.getStatusCode(),200);
			
			String  responseBody=RestAssured.get("/employees").then().assertThat().statusCode(200).and().log().body().toString();
			System.out.println("Response body is: " +responseBody);
			
			
			
			//String jsonobj = "{\"name\":\"Snehal\",\"salary\":60000,\"age\":\"25\"}";
			
			

	        // ObjectMapper from Jackson library
	        ObjectMapper objectMapper = new ObjectMapper();

	        // Convert JSON to Java object
	        EmployeePojo employee = objectMapper.readValue(responseBody, EmployeePojo.class);
	        
	       // EmployeePojo employeee = objectMapper.writeValue

	        // Access fields of the Java object
	        System.out.println("Name: " + employee.getName());
	        System.out.println("Age: " + employee.getSalary());
	        System.out.println("Email: " + employee.getAge());
			
			
			
		}
		
		 
		@Test(testName ="Get specific employee details")
		public void test2() {
			RestAssured.get("/employee/1")
			.then()
			.assertThat()
			.statusCode(200)
			.and()
			.body("employee_name",equalToObject("Tiger Nixon"));
		}
		
		
		
		 
		@Test(testName ="Add new employee details")
		public void test3() {
			String payLoad ="{name :test,salary:123,age:23}";
			RestAssured.given()
			.contentType(ContentType.JSON)
			.body(payLoad)
			.post("/create")
			.then()
			.assertThat()
			.statusCode(HttpStatus.SC_CREATED)
			.and()
			.body("message",equalToObject("Successfully! Record has been added."));
		}
		
		
		
		@Ignore
        @Test(testName ="Add new employee details using Hashmap")
		
		public void test4() {
        	HashMap<String,String> payLoad = new HashMap<>();
        	payLoad.put("name","Snehal Pawar");
        	payLoad.put("Salary","60000");
        	payLoad.put("Age","25");
        	
        	RestAssured.given()
			.contentType(ContentType.JSON)
			.body(payLoad)
			.post("/create")
			.then()
			.assertThat()
			.statusCode(HttpStatus.SC_CREATED)
			.and()
        	.body(CoreMatchers.containsString("Successfully"));
        }
        
        
 @Test(testName ="Add new employee details using employee.json file")
		
		public void test5() throws DatabindException, IOException {
	 ObjectMapper mapper = new ObjectMapper();
	 FileInputStream stream = new FileInputStream(new File("./TestData/EmployeeData.json"));
	 EmployeePojo payLoad = mapper.readValue(stream,EmployeePojo.class);
	 
		RestAssured.given()
		.contentType(ContentType.JSON)
		.body(payLoad)
		.post("/create")
		.then()
		.assertThat().body("message",equalToObject("Successfully! Record has been added"));
		 
 }
    
    
 @Test(testName="Update Employee details")  
 public void test6() {
	 
	 
	
     String name = "Snehal Pawar";
     int salary = 60000;
     int age = 30;

     String requestBody = "{\n" +
             "    \"name\": \"" + name + "\",\n" +
             "    \"salary\": " + salary + ",\n" +
             "    \"age\": " + age + "\n" +
             "}";

     
             Response response = RestAssured.given()
             .contentType(ContentType.JSON)
             .body(requestBody)
             .put("/employees");

 }
    
 
 
 
 
 @Test(testName="Add new record to CSV file")
 
 public void test7() throws DatabindException, IOException {
		String uri = "/create";

		/*
		 * FileReader reader = new FileReader("./TestData/EmployeeMockData.csv");
		 * CsvToBeanBuilder<EmployeeCsvPojo> beanBuilder = new CsvToBeanBuilder(reader);
		 * beanBuilder = beanBuilder.withType(EmployeeCsvPojo.class);
		 * CsvToBean<EmployeeCsvPojo> toBean = beanBuilder.build();
		 * List<EmployeeCsvPojo> beans = toBean.parse();
		 */

		List<employeeCSVpojo> beans = new CsvToBeanBuilder(new FileReader("./TestData/EmployeeMockData.csv")) // example of builder pattern
				.withType(employeeCSVpojo.class).build().parse();

		  RestAssured.given()
		  .contentType(ContentType.JSON) .
		  body(beans) .
		  post(uri)
		  .then() .
		  assertThat().
		  body("message",  equalToObject("Successfully! Record has been added."));
	}
    
    
    
 @Test(testName ="Delete Employee details")
 public void test8() {
	 
	
     String name = "Snehal Pawar";   
     Response response = RestAssured.given()
    		 .contentType(ContentType.JSON)
    		 .delete("/employees/" + name);
  
     System.out.println("Deleted successfully ");
 
 }
		
		
		
		@AfterClass
		public static void tearDownEnv() {
			RestAssured.reset();
		}
		
		}

