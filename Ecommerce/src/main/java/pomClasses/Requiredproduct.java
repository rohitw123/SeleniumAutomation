package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Requiredproduct {
	
	private WebDriver driver;
	private Actions act;
	
	
	@FindBy (xpath="(//a[@class='_1fQZEK'])[1]")    
	private WebElement clickonproduct;
	
	public Requiredproduct (WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	this.driver = driver;
	act= new Actions (driver);
	}
	
	public void clickproduct () {  
		clickonproduct.click();

}
}
