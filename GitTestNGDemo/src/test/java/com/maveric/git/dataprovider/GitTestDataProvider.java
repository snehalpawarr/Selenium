package com.maveric.git.dataprovider;

import org.testng.annotations.DataProvider;

public class GitTestDataProvider {
	@DataProvider
	public Object[][] getInvaliduserNameOrInvalidPassword(){
		return new Object[][] {
			{"Snehal","Mav@123"}, //InvalidUserName, ValidPassword
			{"Snehald","Pawar@321"}}; //ValidUSerName, InvalidPassword
				
	}
	
	@DataProvider
	public Object[][] getvaliduserNameAndPassword(){
		return new Object[][] {
			{"UserName","Password"}}; //ValidUSerName, ValidPassword
		}

}
