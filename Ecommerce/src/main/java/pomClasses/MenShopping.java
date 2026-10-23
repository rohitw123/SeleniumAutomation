package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenShopping {
	private WebDriver driver;
	private Actions act;
	@FindBy (xpath="//span[text()='Men']")
	private WebElement findShoppingForMen;
	
	public MenShopping (WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	this.driver = driver;
	act= new Actions (driver);
	}
	public void clickOnMen() {
		act.moveToElement(findShoppingForMen).click().perform();
	}
}
