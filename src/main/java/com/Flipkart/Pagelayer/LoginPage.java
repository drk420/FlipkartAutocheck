package com.Flipkart.Pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Flipkart.TestBase.TestBase;
import com.Flipkart.Utility.Explicitewait;
import com.Flipkart.Utility.handlingaction;

public class LoginPage extends TestBase {

	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[contains(text(),'New to Flipkart? Create an account')]")
	private WebElement createaccount_link;
	
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")
	private WebElement mobileno_textbox;
	
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[1]/form[1]/div[3]/button[1]")
	private WebElement continue_button;
	
	@FindBy(xpath="//button[contains(text(),'Request OTP')]")
	private WebElement requestotp_button;;
	
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]")
	private WebElement otp_textbox;
	
	@FindBy(xpath="//button[contains(text(),'Verify')]")
	private WebElement verify_button;
	
	@FindBy(xpath="//a[@title=\"Dnyaneshwar \"]")
	private WebElement dnyaneshwar_link;
	
	@FindBy(xpath="//header/div[2]/div[2]/div[1]/div[1]/div[1]/ul[1]/a[9]/li[1]")
	private WebElement logout_link;
	
	public void entermobilenumber() {
		mobileno_textbox.sendKeys("8788172074");
	}
	
	
	
	public void clickoncreateaccountlink() {
		//Explicitewait e = new Explicitewait();
		//e.waity(createaccount_link);
		createaccount_link.click();
	}
	
	public void clickoncontinuebutton() {
		continue_button.click();
	}
	
	public void clickonrequestbutton() {
		requestotp_button.click();
	}
	//public void enterotp() {
	//	otp_textbox.sendKeys("");
	//}
	public void clickonverifybutton() {
		verify_button.click();
	}
	public void moveovertodnyaneshwarlink() {
	//	driver.navigate().back();
		
		//handlingaction h = new handlingaction();
		//h.movetoWebelement(dnyaneshwar_link);
		dnyaneshwar_link.click();
	}
	public void clickonlogoutlink() {
		logout_link.click();
	}
}
