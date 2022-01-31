package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SimpleInputForm {

public WebDriver driver;
	
	
	By input_form = By.linkText("Input Form Submit");
	By submit = By.xpath("//*[@id='seleniumform']/div[6]/button");
	
	By name = By.xpath("//*[@id='name']");
	By email= By.xpath("//*[@id='inputEmail4']");
	By password=By.xpath("//*[@id='inputPassword4']");
	By company=By.xpath("//*[@id='company']");
	By website=By.xpath("//*[@id='websitename']");
	By country=By.xpath("//*[@id='seleniumform']/div[3]/div[1]/select");
	By city=By.xpath("//*[@id='inputCity']");
	By address1=By.xpath("//*[@id='inputAddress1']");
	By address2=By.xpath("//*[@id='inputAddress2']");
	By state=By.xpath("//*[@id='inputState']");
	By zipcode=By.xpath("//*[@id='inputZip']");
			
	By thanks= By.xpath("//*[@id='__next']/div[1]/section[3]/div/div/div[2]/div/p");
	public SimpleInputForm(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getSubmit() {
		return driver.findElement(submit);
	}
	
	
	public WebElement getInputForm() {
		return driver.findElement(input_form);
	}
	public WebElement getName() {
		return driver.findElement(name);
	}
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	public WebElement getCompany() {
		return driver.findElement(company);
	}
	public WebElement getWebsite() {
		return driver.findElement(website);
	}
	public WebElement getCountry() {
		return driver.findElement(country);
	}
	public WebElement getCity() {
		return driver.findElement(city);
	}
	public WebElement getAddress1() {
		return driver.findElement(address1);
	}
	public WebElement getAddress2() {
		return driver.findElement(address2);
	}
	public WebElement getState() {
		return driver.findElement(state);
	}
	public WebElement getZipcode() {
		return driver.findElement(zipcode);
	}
	
	public WebElement getThanks() {
		return driver.findElement(thanks);
	}
}
