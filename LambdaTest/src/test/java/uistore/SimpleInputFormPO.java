package uistore;

import java.io.IOException;
import org.openqa.selenium.support.ui.Select;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import pageobject.SimpleInputForm;
import reusablecomponents.ReadPropertyFile;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class SimpleInputFormPO extends ReadPropertyFile{
	public static Logger log=Logger.getLogger(ReadPropertyFile.class.getName());
	
	public RemoteWebDriver driver = null;
	String username = "poloju.koushik";
	  String accessKey = "NAyyOngBDrJcsJrrU7gyR9R5oGuesKgGPbTWx4gONzcnonlaXM";
		
		//@BeforeTest
		public RemoteWebDriver setUp() throws Exception {
			 DesiredCapabilities capabilities = new DesiredCapabilities();
			    capabilities.setCapability("browserName", "Firefox");
			    capabilities.setCapability("version", "82.0");
			    capabilities.setCapability("platform", "Windows 7");
			    capabilities.setCapability("resolution","1024x768");
				  capabilities.setCapability("build", "First Test");
				  capabilities.setCapability("name", "Third Test");
				  capabilities.setCapability("network", true); // To enable network logs
				  capabilities.setCapability("visual", true); // To enable step by step screenshot
				  capabilities.setCapability("video", true); // To enable video recording
				  capabilities.setCapability("console", true); // To capture console logs

				  try {
				    driver = new RemoteWebDriver(new URL("https://" + username + ":" + accessKey + "@hub.lambdatest.com/wd/hub"), capabilities);
				  } catch (MalformedURLException e) {
				    System.out.println("Invalid grid URL");
				  }
		  return driver;
		}



	 @AfterTest public void close() {
	  
	  driver.close(); driver = null;
	  
	  }
	 
	@Test
	public void TC3() throws Exception {
		
		driver = setUp();
		driver.get("https://www.lambdatest.com/selenium-playground/input-form-demo");
		driver.manage().window().maximize();
		log.info("navigation to url");	
		
		SimpleInputForm tc3 = new SimpleInputForm(driver);
		
		Thread.sleep(3000);
		tc3.getInputForm();
		Thread.sleep(5000);
		
		tc3.getSubmit().click();
		Thread.sleep(5000);
		//driver.switchTo().alert().getText();
		
			System.out.println("Please fill the required details");
		
		tc3.getName().sendKeys("P.Saikrishna Koushik");
		Thread.sleep(3000);
		tc3.getEmail().sendKeys("koushik@gmail.com");
		Thread.sleep(3000);
		tc3.getPassword().sendKeys("Koushik@262");
		Thread.sleep(3000);
		tc3.getCompany().sendKeys("Mindtree limited");
		Thread.sleep(3000);
		tc3.getWebsite().sendKeys("www.mindtree.com");
		Thread.sleep(3000);
		Select countrys = new Select(tc3.getCountry());
		countrys.selectByVisibleText("United States");
		Thread.sleep(3000);
		tc3.getCity().sendKeys("Atlantis");
		Thread.sleep(3000);
		tc3.getAddress1().sendKeys("21H-32B");
		Thread.sleep(3000);
		tc3.getAddress2().sendKeys("Near sea");
		Thread.sleep(3000);
		tc3.getState().sendKeys("New York");
		Thread.sleep(3000);
		tc3.getZipcode().sendKeys("08256");
		Thread.sleep(3000);
		tc3.getSubmit().click();
		Thread.sleep(3000);
				
		Assert.assertEquals("Thanks for contacting us, we will get back to you shortly.", tc3.getThanks().getText());
		log.info("Validated successfully");
		
	}
	 
}
