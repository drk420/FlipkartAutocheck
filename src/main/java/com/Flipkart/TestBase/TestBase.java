package com.Flipkart.TestBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;




public class TestBase  {
	
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeTest
	public void setup() {
		logger = Logger.getLogger("Framework Started");
		PropertyConfigurator.configure("Log4j.propertiesFile");
		logger.info("Flipkart Framework Started");
	}
	
	@AfterTest
	public void stop() {
		
		logger.info("Framework close");
	}

	@BeforeMethod
	public void start() {
		String br = "chrome";
	 if(br.equalsIgnoreCase("chrome")) {
		 
		 driver = new ChromeDriver();
		 
	 }
	 else if(br.equalsIgnoreCase("FirefoxDriver")) {
		 driver = new FirefoxDriver();
	 }
	 else if(br.equalsIgnoreCase("edgedriver")) {
		 driver = new EdgeDriver();
	 }
	 else {
		 System.out.println("Provide correct browser");
	 }
	 
	 driver.get("https://www.flipkart.com/");
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void end() {
		
		//driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
}
