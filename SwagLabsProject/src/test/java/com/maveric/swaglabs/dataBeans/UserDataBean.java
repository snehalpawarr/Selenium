package com.maveric.swaglabs.dataBeans;

public class UserDataBean {
	
	
	private String userName, password;
	//private String firstName, lastName, Postalcode;
	//public UserDataBean() {}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String UserName) {
		this.userName = UserName;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	
	
	
	/*public String getFirstname() {
		return firstName;
	}
	
	public void setFirstName(String FirstName) {
		this.firstName = FirstName;
	}
	
	public String getLastname() {
		return lastName;
	}
	
	public void setLastName(String LastName) {
		this.lastName = LastName;
	}
	
	public String getPostalcode() {
		return Postalcode;
	}
	
	public void setPostalcode(String PostalCode) {
		this.Postalcode = PostalCode;
	}*/
	
	
	
	
	//@Override
	public String toString() {
		return "UserDataBean [userName=" + userName + ", passwsord=" + password + "]";
	}
}


