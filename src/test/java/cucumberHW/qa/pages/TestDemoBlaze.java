package cucumberHW.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumberHW.qa.utils.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemoBlaze {
	
	// this class is only for test to make sure that my script works properly.
	static String url = "https://blazedemo.com/purchase.php";
	

	public static void main(String[] args) throws InterruptedException {
		setUp();

		BlazeDemoPurchasePage obj = new BlazeDemoPurchasePage();
		
		obj.enterFullName("Ali");
		obj.enterAddress("123 st");
		obj.enterCity("ABC");
		obj.enterState("VA");
		obj.enterZipCode("12345");
		obj.selectCardType("Diner's Club");
		Thread.sleep(3000);
		obj.enterCreditCardNumber("123334445667");
		obj.enterCreditCardMonth("8");
		obj.enterCreditCardYear("2021");
		obj.enterNameOnCard("Ali aban");
		obj.clickRememberMeCheck();
		obj.clicksubmitButton();
		obj.verifyMessage("Thank you for your purchase today!");
		

		
		Thread.sleep(3000);
		Constants.driver.quit();
	}

	public static void setUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		Constants.driver = new ChromeDriver();
		Thread.sleep(3000);
		// maximize the browser
		Constants.driver.manage().window().maximize();
		Constants.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Constants.driver.get(url);

	}
}


