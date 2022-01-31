package uistore;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.DemoForm;
import reusablecomponents.ReadPropertyFile;


public class DemoFormPO extends ReadPropertyFile{
	public static Logger log=Logger.getLogger(ReadPropertyFile.class.getName());
	
	public RemoteWebDriver driver = null;
	String username = "poloju.koushik";
	String accessKey = "NAyyOngBDrJcsJrrU7gyR9R5oGuesKgGPbTWx4gONzcnonlaXM";

		
		//@BeforeTest
		public RemoteWebDriver setUp() throws Exception {
		  DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability("browserName", "Chrome");
	    capabilities.setCapability("version", "92.0");
	    capabilities.setCapability("platform", "Windows 10");
	    capabilities.setCapability("resolution","1024x768");
		  capabilities.setCapability("build", "First Test");
		  capabilities.setCapability("name", "First Test");
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

	@Test
	public void TC1() throws Exception {
		
		driver = setUp();
		driver.get("https://www.lambdatest.com/selenium-playground");

		driver.manage().window().maximize();
		DemoForm s=new DemoForm(driver);
		Thread.sleep(5000);
		
		log.info("Navigated to url successfully");
		Thread.sleep(5000);
		s.getSimpleFormDemo().click();
		Thread.sleep(5000);
		log.info("clicked on simple input successufully");
	    Assert.assertTrue(driver.getCurrentUrl().contains("simple-form-demo"));
	    log.info("Validated successfully");
	    
	    String str="Welcome to LambdaTest";
	    s.getInput().sendKeys(str);
	    Thread.sleep(3000);
	    log.info("sent messege into input box");
	    s.getCheckValues().click();
	    Thread.sleep(3000);
	    Assert.assertEquals(str, s.getMessege().getText());
	    log.info("Validated successfully");
	    
	    
	}

	@AfterTest
	public void close() {

		driver.close();

	}
	 

}