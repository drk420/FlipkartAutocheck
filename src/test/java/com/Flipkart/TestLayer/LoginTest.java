package com.Flipkart.TestLayer;

import org.testng.annotations.Test;

import com.Flipkart.Pagelayer.HomePage;
import com.Flipkart.Pagelayer.LoginPage;
import com.Flipkart.TestBase.TestBase;

public class LoginTest extends TestBase{

	@Test
	public void validatelogintest() throws InterruptedException {
		
		HomePage homepage = new HomePage(driver);
		homepage.clickonloginlink();
		LoginPage loginpage = new LoginPage(driver);
		//Thread.sleep(5000);
		loginpage.clickoncreateaccountlink();
		Thread.sleep(5000);
		loginpage.entermobilenumber();
		loginpage.clickoncontinuebutton();
		loginpage.clickonrequestbutton();
		Thread.sleep(30000);
		loginpage.clickonverifybutton();
		//loginpage.moveovertodnyaneshwarlink();
		//loginpage.clickonlogoutlink();
		Thread.sleep(25000);
		loginpage.moveovertodnyaneshwarlink();
		Thread.sleep(25000);
		loginpage.clickonlogoutlink();
		
	}
	
	
	
	
	
	
	
}
