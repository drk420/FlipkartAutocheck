package com.Flipkart.Pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Flipkart.TestBase.TestBase;
import com.Flipkart.Utility.MoveUpTo;
import com.Flipkart.Utility.WindowHandling;

public class BikePage extends TestBase{

	
	public BikePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]")
	private WebElement addtocart_button;
	
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[15]/div[1]/form[1]/button[1]")
	private WebElement placeholder_button;
	
	@FindBy(xpath="//div[contains(text(),\"Remove\")]")
	private WebElement remove_link;
	
	@FindBy(xpath="//div[contains(@class,\"sBxzFz fF30ZI A0MXnh\")]")
	private WebElement remove_button;
	
	public void clickonaddtocartbutton() {
		
		
		WindowHandling w = new WindowHandling();
		w.handlingwindow(1);
		MoveUpTo m = new MoveUpTo();
		m.by();
		addtocart_button.click();
		w.handlingwindow(0);
		driver.navigate().back();
	}
	public void clickonplaceholderbutton() {
		placeholder_button.click();
	}
	public void clickonremovelink() {
		remove_link.click();
	}
	public void clickonremovebuttn() {
		remove_button.click();
	}
}
