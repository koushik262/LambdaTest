package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoForm {
	
	WebDriver driver;
	By SimpleForm =By.xpath("//a[@href='https://www.lambdatest.com/selenium-playground/simple-form-demo']");
	By input=By.cssSelector("input[id=\"user-message\"]");
	By checkValues=By.id("showInput");
	By messege=By.id("message");
			
	
	public DemoForm(WebDriver driver) {
		// TODO Auto-generated constructor stubs
		this.driver=driver;
	}
	public WebElement getSimpleFormDemo()
	{
		return driver.findElement(SimpleForm);
	}
	public WebElement getInput()
	{
		return driver.findElement(input);
	}
	public WebElement getCheckValues()
	{
		return driver.findElement(checkValues);
	}
    
	public WebElement getMessege()
	{
		return driver.findElement(messege);
	}

}