package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BasePage;
import validators.DefaultValidator;

public class SendQuoteTabPage extends BasePage {

	private static SendQuoteTabPage instance;

	public static synchronized SendQuoteTabPage getInstance() {
		if (instance == null)
			instance = new SendQuoteTabPage();
		return instance;
	}

	private static DefaultValidator validator = DefaultValidator.getInstance();

	public String labelAlert() {
		element = driver.findElement(By.tagName("h2"));
		return element.getText().toString();
	}

	public String labelCounter() {
		element = driver.findElement(By.xpath("//a[@id='sendquote']//span[1]"));
		return element.getText().toString();
	}

	public void enterEmail(String email) {
		element = driver.findElement(By.id("email"));
		validator.attributeValidator(element, "type", "email");
		element.sendKeys(email);
	}

	public void enterPhone(String phone) {
		element = driver.findElement(By.id("phone"));
		validator.attributeValidator(element, "type", "text");
		element.sendKeys(phone);
	}

	public void enterUsername(String username) {
		element = driver.findElement(By.id("username"));
		validator.attributeValidator(element, "type", "text");
		element.sendKeys(username);
	}

	public void enterPassword(String password) {
		element = driver.findElement(By.id("password"));
		validator.attributeValidator(element, "type", "password");
		element.sendKeys(password);
	}

	public void enterConfirmpassword(String confirmpassword) {
		element = driver.findElement(By.id("confirmpassword"));
		validator.attributeValidator(element, "type", "password");
		element.sendKeys(confirmpassword);
	}

	public void enterComments(String comments) {
		element = driver.findElement(By.id("Comments"));
		validator.attributeValidator(element, "cols", "50");
		validator.attributeValidator(element, "rows", "5");
		element.sendKeys(comments);
	}

	public void clickSendemail() {
		element = driver.findElement(By.id("sendemail"));
		validator.attributeValidator(element, "type", "button");
		element.click();

	}

}
