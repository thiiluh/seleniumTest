package pageObjects;

import org.openqa.selenium.By;

import base.BasePage;

public class InsurantDataTabPage extends BasePage {

	private static InsurantDataTabPage instance;

	public static synchronized InsurantDataTabPage getInstance() {
		if (instance == null)
			instance = new InsurantDataTabPage();
		return instance;
	}
	
	public String labelCounter() {
		element = driver.findElement(By.xpath("(//span[@class='counter zero'])[2]"));
		return element.getText().toString();
	}

	public void clickEnterInsurantData() {
		element = driver.findElement(By.id("enterinsurantdata"));
		element.click();
	}

	public void enterFirstName(String firstname) {
		element = driver.findElement(By.id("firstname"));
		element.sendKeys(firstname);
	}

	public void enterLastName(String lastname) {
		element = driver.findElement(By.id("lastname"));
		element.sendKeys(lastname);
	}

	public void enterBirthDate(String birthdate) {
		element = driver.findElement(By.id("birthdate"));
		element.sendKeys(birthdate);
	}

	public void clickGenderMale() {
		element = driver.findElement(By.id("gendermale"));
		element.click();
	}

	public void clickGenderFemale() {
		element = driver.findElement(By.id("genderfemale"));
		element.click();
	}

	public void enterStreetAddress(String streetaddress) {
		element = driver.findElement(By.id("streetaddress"));
		element.sendKeys(streetaddress);
	}

	public void enterCountry(String country) {
		element = driver.findElement(By.id("country"));
		element.sendKeys(country);
	}

	public void enterZipCode(String zipcode) {
		element = driver.findElement(By.id("zipcode"));
		element.sendKeys(zipcode);
	}

	public void enterCity(String city) {
		element = driver.findElement(By.id("city"));
		element.sendKeys(city);
	}

	public void enterOccupation(String occupation) {
		element = driver.findElement(By.id("occupation"));
		element.sendKeys(occupation);
	}

	public void clickSpeeding() {
		element = driver.findElement(By.xpath("//input[@id='speeding']/following-sibling::span[1]"));
		element.click();
	}

	public void clickBungeeJumping() {
		element = driver.findElement(By.xpath("//input[@id='bungeejumping']/following-sibling::span[1]"));
		element.click();
	}

	public void clickCliffdiving() {
		element = driver.findElement(By.xpath("//input[@id='cliffdiving']/following-sibling::span[1]"));
		element.click();
	}

	public void clickSkydiving() {
		element = driver.findElement(By.xpath("//input[@id='skydiving']/following-sibling::span[1]"));
		element.click();
	}

	public void clickOther() {
		element = driver.findElement(By.xpath("//input[@id='other']/following-sibling::span[1]"));
		element.click();
	}

	public void enterWebSite(String website) {
		element = driver.findElement(By.id("website"));
		element.sendKeys(website);
	}


}
