package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gotocart {
	private WebDriver driver;
	private Actions act;
	
	@FindBy (xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement proceedToCart;
	
	public Gotocart (WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	this.driver = driver;
	act= new Actions (driver);
	}
	public void proceedToCart() {
		proceedToCart.click();
	
	
	}
}
