package com.Flipkart.Pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Flipkart.TestBase.TestBase;
import com.Flipkart.Utility.Explicitewait;
import com.Flipkart.Utility.MoveUpTo;
import com.Flipkart.Utility.handlingaction;

public class HomePage extends TestBase {

	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	private WebElement login_link;
	
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")
	private WebElement bike_link;
	
	@FindBy(xpath="//a[contains(text(),'Petrol Vehicles')]")
	private WebElement petrol_bike;
	
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/a[1]/div[1]")
	private WebElement herohonda_image;
	
	@FindBy(xpath="//header/div[2]/div[3]/div[1]")
	private WebElement cart_button;
	
	@FindBy(xpath="//header/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")
	private WebElement searchbar_textbox;
	
	@FindBy(xpath="//header/div[1]/div[2]/form[1]/div[1]/button[1]")
	private WebElement searchbar_icon;
	
	@FindBy(xpath="//div[contains(text(),\"shoes\")][1]")
	private WebElement shoes_link;
	
	public void clickonloginlink() {
		Explicitewait e = new Explicitewait ();
		e.waity(login_link);
		login_link.click();
	}
	public void movetobike() {
		handlingaction h = new handlingaction();
		h.movetoWebelement(bike_link);
		//bike_link.click();
	}
	public void clickonpetrolbike() {
		petrol_bike.click();
	}
	public void clickonherohondabike() {
		herohonda_image.click();
	}
	public void clickcartbutton() {
		cart_button.click();
	}
	public void entertextinsearchbar(String name) {
		searchbar_textbox.sendKeys(name);
	}
	public void clickonsearchbaricon() {
		searchbar_icon.click();
	}
	public void clickonshoeslink() throws InterruptedException {
		Thread.sleep(5000);
		searchbar_textbox.click();
		Thread.sleep(5000);
		shoes_link.click();
	}
}
