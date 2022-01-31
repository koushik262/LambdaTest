package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropAndDrag {

public WebDriver driver;
	
	
	public DropAndDrag(WebDriver driver) {

		this.driver = driver;
	}

	By drag=By.xpath("//a[@href='https://www.lambdatest.com/selenium-playground/drag-drop-range-sliders-demo']"); 
	By output = By.xpath("//*[@id='rangeSuccess']");
	public WebElement getDrag()
	{
		return driver.findElement(drag);
	}
	public WebElement getOutput()
	{
		return driver.findElement(output);
	}
	
}
