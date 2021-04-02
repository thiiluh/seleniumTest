package pageObjects;

import org.openqa.selenium.By;

import base.BasePage;

public class ProductDataTabPage extends BasePage {

	private static ProductDataTabPage instance;

	public static synchronized ProductDataTabPage getInstance() {
		if (instance == null)
			instance = new ProductDataTabPage();
		return instance;
	}

	public String labelCounter() {
		element = driver.findElement(By.xpath("(//span[@class='counter zero'])[3]"));
		return element.getText().toString();
	}

	public void enterStartDate(String startdate) {
		element = driver.findElement(By.id("startdate"));
		element.sendKeys(startdate);
	}

	public void enterInsurancesum(String insurancesum) {
		element = driver.findElement(By.id("insurancesum"));
		element.sendKeys(insurancesum);
	}

	public void enterMeritrating(String meritrating) {
		element = driver.findElement(By.id("meritrating"));
		element.sendKeys(meritrating);
	}

	public void enterDamageinsurance(String damageinsurance) {
		element = driver.findElement(By.id("damageinsurance"));
		element.sendKeys(damageinsurance);
	}

	public void clickEuroProtection() {
		element = driver.findElement(By.xpath("//input[@id='EuroProtection']/following-sibling::span[1]"));
		element.click();
	}

	public void clickLegalDefenseInsurance() {
		element = driver.findElement(By.xpath("//input[@id='LegalDefenseInsurance']/following-sibling::span[1]"));
		element.click();
	}

	public void enterCourtesycar(String courtesycar) {
		element = driver.findElement(By.id("courtesycar"));
		element.sendKeys(courtesycar);
	}

}
