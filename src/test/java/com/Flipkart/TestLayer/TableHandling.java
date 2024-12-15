package com.Flipkart.TestLayer;

import org.testng.annotations.Test;

import com.Flipkart.Pagelayer.HomePage;
import com.Flipkart.TestBase.TestBase;

public class TableHandling extends TestBase {

	
	@Test
	public void validatetextbox() throws InterruptedException {
		HomePage h = new HomePage (driver);
		Thread.sleep(5000);
	//	h.entertextinsearchbar("mobile");
		//h.clickonsearchbaricon();
		h.clickonshoeslink();
		//h.clickonshoeslink();
	}
}
