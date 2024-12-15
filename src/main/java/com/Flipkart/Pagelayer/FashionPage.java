package com.Flipkart.Pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Flipkart.TestBase.TestBase;
import com.Flipkart.Utility.Explicitewait;
import com.Flipkart.Utility.MoveUpTo;
import com.Flipkart.Utility.WindowHandling;
import com.Flipkart.Utility.handlingaction;

public class FashionPage extends TestBase{

	public FashionPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
		
	}
	
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	private WebElement fashion_link;
	
	@FindBy(xpath="//body/div[4]/div[1]/object[1]/a[5]")
	private WebElement women_link;
	
	@FindBy(xpath="//a[contains(text(),'Women Heels')]")
	private WebElement womenheels_link;
	
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/div[1]/img[1]")
	private WebElement heels_link;
	//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]")
	private WebElement addtocart_button;
	
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[13]/div[1]/form[1]/button[1]")
	private WebElement placeholder_button;
	
	public void movetofashionlink() {
		handlingaction h = new handlingaction();
		h.movetoWebelement(fashion_link);
		h.movetoWebelement(women_link);
		
	}
	public void clickonwomenheels() {
		womenheels_link.click();
	}
	
	public void clickonheelslink() {
	//	MoveUpTo m = new MoveUpTo();
	//	m.scrollupto(heels_link);
		heels_link.click();
	}
	public void clickonaddtocartbutton() {
		WindowHandling w = new WindowHandling();
		w.handlingwindow(1);
		
		MoveUpTo m = new MoveUpTo();
		//m.scrollupto(addtocart_button);
		m.by();
	//	Explicitewait e = new Explicitewait();
		
		//e.waity(addtocart_button);
		
		addtocart_button.click();
	}
	public void clickonplaceholderbutton() {
		//MoveUpTo m = new MoveUpTo();
		//m.scrollupto(placeholder_button);
		//m.by();
		Explicitewait e = new Explicitewait();
		e.waity(placeholder_button);
		placeholder_button.click();
	}
	
	
}
