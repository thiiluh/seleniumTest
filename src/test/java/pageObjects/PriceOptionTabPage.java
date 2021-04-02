package pageObjects;

import org.openqa.selenium.By;

import base.BasePage;
import validators.DefaultValidator;

public class PriceOptionTabPage extends BasePage {

	private static PriceOptionTabPage instance;

	public static synchronized PriceOptionTabPage getInstance() {
		if (instance == null)
			instance = new PriceOptionTabPage();
		return instance;
	}

	private static DefaultValidator validator = DefaultValidator.getInstance();

	public void clickSelectSilver() {
		element = driver.findElement(By.xpath("//input[@id='selectsilver']/following-sibling::span[1]"));

		element.click();
	}

	public void clickSelectGold() {
		element = driver.findElement(By.xpath("//input[@id='selectsilver']/following-sibling::span[1]"));

		element.click();
	}

	public void clickSelectPlatinum() {
		element = driver.findElement(By.xpath("//input[@id='selectplatinum']/following-sibling::span[1]"));

		element.click();
	}

	public void clickSelectUltimate() {
		element = driver.findElement(By.xpath("//input[@id='selectultimate']/following-sibling::span[1]"));

		element.click();
	}

	public String textSilverPrice() {
		element = driver.findElement(By.id("selectsilver_price"));
		return element.getText().toString();
	}

	public String textGoldPrice() {
		element = driver.findElement(By.id("selectgold_price"));
		return element.getText().toString();
	}

	public String textPlatinumPrice() {
		element = driver.findElement(By.id("selectplatinum_price"));
		return element.getText().toString();
	}

	public String textUltimatePrice() {
		element = driver.findElement(By.id("selectultimate_price"));
		return element.getText().toString();
	}
}
