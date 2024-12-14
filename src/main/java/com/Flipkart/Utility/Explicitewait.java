package com.Flipkart.Utility;


import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Flipkart.TestBase.TestBase;

public class Explicitewait extends TestBase {

	
	public static void waity(WebElement element) {
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		w.until(ExpectedConditions.visibilityOf(element));
		

	}
	
	
	
	
	
}
