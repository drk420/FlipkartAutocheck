package com.Flipkart.Utility;

import java.util.ArrayList;
import java.util.Set;

import com.Flipkart.TestBase.TestBase;

public class WindowHandling extends TestBase {

	public void handlingwindow(int index) {
	String parentid=	driver.getWindowHandle();
	
	System.out.println(parentid);
	
	Set<String>parentandchildid=driver.getWindowHandles();
	System.out.println(parentandchildid);
	
	
	
	
		ArrayList<String> i= new ArrayList(parentandchildid);
		driver.switchTo().window(i.get(index));
		
	}
	
	}

