package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CasualShoes {
	
	private WebDriver driver;
	private Actions act;

	@FindBy (xpath="//a[@title='Casual Shoes']")
	private WebElement byShoes;
	
	@FindBy (xpath="\"//a[@class='_3SkBxJ']")
	private WebElement goToFinalCart;
	
	public CasualShoes (WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	this.driver = driver;
	act= new Actions (driver);
	}
	
	public void byShoes() {
		byShoes.click();
	}
		
		public void goToFinalCart() {
			goToFinalCart.click();
		}
	
	
}
