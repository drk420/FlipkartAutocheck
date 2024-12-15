package com.Flipkart.TestLayer;

import org.testng.annotations.Test;

import com.Flipkart.Pagelayer.FashionPage;
import com.Flipkart.TestBase.TestBase;

public class AddToCartTest extends TestBase {

	@Test
	public void validateaddtocarttest() throws InterruptedException {
	FashionPage f = new FashionPage(driver);
	f.movetofashionlink();
	f.clickonwomenheels();
	f.clickonheelslink();
	Thread.sleep(5000);
	f.clickonaddtocartbutton();
	Thread.sleep(5000);

	f.clickonplaceholderbutton();
	}
	
	
	
	
	
	
}
