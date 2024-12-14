package com.Flipkart.Utility;

import com.Flipkart.TestBase.TestBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Dropdown extends TestBase {

	public void dropdownhandling(WebElement element,String text) {
		
		Select s = new Select(element);
		
		s.selectByVisibleText(text);
		
		List<WebElement> options = s.getOptions();
		
		int count = options.size();
		
		
		
		
		for(WebElement e:options) {
			
		String Text	= e.getText();
		System.out.println(Text);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
