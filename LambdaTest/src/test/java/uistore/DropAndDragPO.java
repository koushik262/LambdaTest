package uistore;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.DropAndDrag;
import reusablecomponents.ReadPropertyFile;

public class DropAndDragPO extends ReadPropertyFile{
	public static Logger log=Logger.getLogger(ReadPropertyFile.class.getName());
	
	 public RemoteWebDriver driver = null;
	  String username = "poloju.koushik";
	  String accessKey = "NAyyOngBDrJcsJrrU7gyR9R5oGuesKgGPbTWx4gONzcnonlaXM";
		
		//@BeforeTest
		public RemoteWebDriver setUp() throws Exception {
		  DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability("browserName", "MicrosoftEdge");
	    capabilities.setCapability("version", "87.0");
	    capabilities.setCapability("platform", "macOS Sierra");
	    capabilities.setCapability("resolution","1024x768");
		  capabilities.setCapability("build", "First Test");
		  capabilities.setCapability("name", "Second Test");
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
	public void TC2() throws Exception {
		
		
		driver = setUp();
		driver.get("https://www.lambdatest.com/selenium-playground");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		log.info("navigation to url");	
		
		DropAndDrag pb = new DropAndDrag(driver);
		pb.getDrag().click();
		log.info("cliked on drag and drop button");
				

		WebElement drag = driver.findElement(By.xpath("//input[@value='15']"));
	  Actions act=new Actions(driver); 
	  act.dragAndDropBy(drag,+100,0).perform();
	  Thread.sleep(3000);	 
        System.out.println("The Bar was dragged upto "+ pb.getOutput().getText()+".");
	}
	 
}
