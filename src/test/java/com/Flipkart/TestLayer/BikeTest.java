package com.Flipkart.TestLayer;

import org.testng.annotations.Test;

import com.Flipkart.Pagelayer.BikePage;
import com.Flipkart.Pagelayer.HomePage;
import com.Flipkart.TestBase.TestBase;

public class BikeTest extends TestBase {

	@Test
	public void validatebikefunctionality() throws InterruptedException {
		HomePage h = new HomePage(driver);
		h.movetobike();
		Thread.sleep(5000);
		h.clickonpetrolbike();
		h.clickonherohondabike();
		
		BikePage b = new BikePage(driver);
		b.clickonaddtocartbutton();
		
		//b.clickonplaceholderbutton();
	 h.clickcartbutton();
		b.clickonremovelink();
		b.clickonremovebuttn();
	}
}
