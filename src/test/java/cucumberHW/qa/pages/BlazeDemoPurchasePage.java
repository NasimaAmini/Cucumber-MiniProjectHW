package cucumberHW.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumberHW.qa.utils.Constants;

public class BlazeDemoPurchasePage {
	

	@FindBy(id = "inputName")
	WebElement fullNameField;

	@FindBy(id = "address")
	WebElement addressField;

	@FindBy(id = "city")
	WebElement cityField;

	@FindBy(id = "state")
	WebElement stateField;

	@FindBy(id = "zipCode")
	WebElement zipCodeField;

//	@FindBy(id = "cardType")
//	List<WebElement> cardTypeDropDown;
	@FindBy(id = "cardType")
	WebElement cardTypeDropDown;

	@FindBy(id = "creditCardNumber")
	WebElement creditCardNumberField;

	@FindBy(id = "creditCardMonth")
	WebElement creditCardMonthField;

	@FindBy(id = "creditCardYear")
	WebElement creditCardYearField;

	@FindBy(id = "nameOnCard")
	WebElement nameOnCardField;

	@FindBy(id = "rememberMe")
	WebElement rememberMeCheck;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement submitButton;
	
	@FindBy(xpath = "//h1[text()='Thank you for your purchase today!']")
	WebElement verificationMessageText;

	

	// Class Constructor
	public BlazeDemoPurchasePage() {
		PageFactory.initElements(Constants.driver, this);
	}

	// methods
	public void enterFullName(String fullName) {
		fullNameField.sendKeys(fullName);
	}

	public void enterAddress(String address) {
		addressField.sendKeys(address);
	}

	public void enterCity(String city) {
		cityField.sendKeys(city);
	}

	public void enterState(String state) {
		stateField.sendKeys(state);
	}

	public void enterZipCode(String zipCode) {
		zipCodeField.sendKeys(zipCode);
	}
	public void selectCardType(String card) {
		//cardTypeDropDown.click();
//		for (WebElement cardELement : cardTypeDropDown) {
//			String cardText = cardELement.getText();
//			if (cardText.equals(card)) {
//				System.out.println(cardELement);
//				cardELement.click();
//				
//				break;
//			}
//		}
		
		Select select=new Select(cardTypeDropDown);
		select.selectByVisibleText(card);
		cardTypeDropDown.click();
	}

	public void enterCreditCardNumber(String creditCardNumber) {
		creditCardNumberField.sendKeys(creditCardNumber);
	}

	public void enterCreditCardMonth(String creditCardMonth) {
		creditCardMonthField.sendKeys(creditCardMonth);
	}
	
	public void enterCreditCardYear(String creditCardYear) {
		creditCardYearField.sendKeys(creditCardYear);
	}
	
	public void enterNameOnCard(String nameOnCard) {
		nameOnCardField.sendKeys(nameOnCard);
	}

	public void clickRememberMeCheck() {
		rememberMeCheck.click();
	}

	public void clicksubmitButton() {
		submitButton.click();
	}


	public void verifyMessage(String message) throws InterruptedException {
		String expectedMessage= "Thank you for your purchase today!";
		
		if(expectedMessage.equals(message)) {
			System.out.println("PASSED");
		}else {
			System.out.println("FAIELD");
		}
		
		Thread.sleep(2000);
		Constants.driver.quit();

		

	}
	
	

}
