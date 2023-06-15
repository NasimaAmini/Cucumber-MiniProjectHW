package cucumberHW.qa.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumberHW.qa.pages.BlazeDemoPurchasePage;
import cucumberHW.qa.utils.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BlazeDemoPurchaseStep {

	BlazeDemoPurchasePage obj;
	@Given("User navigates to BlazeDemo Purchase Page {string}")
	public void navigateToBlazeDemoPage(String url) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		Constants.driver = new ChromeDriver();
		Constants.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		Constants.driver.manage().window().maximize();
		Constants.driver.get(url);
		Thread.sleep(2000);
		
		
		obj = new BlazeDemoPurchasePage(); 
	}

	@When("User enters Full Name {string}")
	public void enterUserFullName(String fullName) {
		obj.enterFullName(fullName);
	

	}

	@When("User enters Address {string}")
	public void enterUserAddress(String adderss) {
		obj.enterAddress(adderss);
	 
	}

	@When("User enters city {string}")
	public void enterUserCity(String city) {
		obj.enterCity(city);
	
	}

	@When("User etners state {string}")
	public void enterUserState(String state) {
		obj.enterState(state);
	
	}

	@When("User etners zip Code {string}")
	public void enterUserZipCode(String zipCode) throws InterruptedException {
		obj.enterZipCode(zipCode);
		Thread.sleep(2000);
	
	}

	@When("User selects card Type {string}")
	public void selectUserCardType(String cardType) throws InterruptedException {
		obj.selectCardType(cardType);
		Thread.sleep(2000);
	  
	}

	@When("User enters credit Card Number {string}")
	public void enterUserCardNumber(String cardNumber) throws InterruptedException {
	  obj.enterCreditCardNumber(cardNumber);
		Thread.sleep(2000);
	}

	@When("User etners month {string}")
	public void enterUserMonth(String month) {
		obj.enterCreditCardMonth(month);
	   
	}

	@When("User etners year {string}")
	public void enterUserYear(String year) {
	obj.enterCreditCardYear(year);
	}

	@When("User etners name on Card {string}")
	public void enterUserNameOnCard(String nameOnCard) {
		obj.enterNameOnCard(nameOnCard);
	 
	}

	@When("User clicks remember me check")
	public void ClickRememberMecheck() {
		obj.clickRememberMeCheck();
	}

	@When("User clicks purchase Flight button")
	public void clicksPurchaseFlightButton() {
		obj.clicksubmitButton();;

	}

	@Then("User verifies success message {string}")
	public void verifiesMessage(String message) throws InterruptedException {
		
		obj.verifyMessage(message);
	   
	}


}