package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {
	private WebDriver driver;
	private Actions act;
	
	
	@FindBy (xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement textBox;
	
	@FindBy (xpath="//input[@type='text']")
	private WebElement productSearch;

	@FindBy (xpath="//button[@class='L0Z3Pu']")
	private WebElement clickonproceed;
	
	@FindBy (xpath="(//a[@class='_1fQZEK'])[1]")     //22
	private WebElement clickonproduct;
	
	public OrderPage (WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	this.driver = driver;
	act= new Actions (driver);
	}
	
	public void findTextBox() {
		textBox.click();
	}
	
	public void productsSearch () {
		productSearch.sendKeys("samsung smart watch 4");
	}
	
	public void clickproceed () {
		clickonproceed.click();
	}
	
	public void clickproduct () {  //22
		clickonproduct.click();
	}
	

}
