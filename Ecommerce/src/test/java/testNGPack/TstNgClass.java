package testNGPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomClasses.OrderPage;


public class TstNgClass {
	WebDriver driver;
	
	@BeforeClass
	
	public void openbrowser() {
		
		System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32(1)\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	}
	@BeforeMethod
	
	public void firstPage() throws InterruptedException {
		System.out.println("Before Method");
		driver.get ("https://www.flipkart.com/");
		//Thread.sleep(3000);	
	}
	@Test
	
	public void vaifypage() throws InterruptedException {
		System.out.println("Test-1");
		//OrderPage orderpage = new OrderPage (driver);
		//orderpage.findTextBox();
		//orderpage.productsSearch();
		//orderpage.clickproceed();
		//orderpage.clickproduct();
		
		//Thread.sleep(3000);	

		String actualtitle=driver.getTitle();
		
		String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
		if (actualtitle.equals(expectedTitle))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
	}

		@AfterMethod
		public void closedCurrentTab() {
			System.out.println("After Method");
			driver.close();
		}
		
		@AfterClass
		public void afterClass() {
			System.out.println("After Class");
			driver.quit();
		}
			
		
	}


