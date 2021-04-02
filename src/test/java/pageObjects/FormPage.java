package pageObjects;

import org.openqa.selenium.By;

import base.BasePage;
import validators.DefaultValidator;

public class FormPage extends BasePage {
	private static FormPage instance;

	public static synchronized FormPage getInstance() {
		if (instance == null)
			instance = new FormPage();
		return instance;
	}

	DefaultValidator validator = DefaultValidator.getInstance();

	public void startDriver() {
		BasePage.setup();
	}

	public void navigateToUrl() {
		driver.get(BASEURL);
	}

	public void clickAutomobileMenu() {
		element = driver.findElement(By.id("nav_automobile"));
		element.click();
	}

	public void clickTruckMenu() {
		element = driver.findElement(By.id("nav_truck"));
		element.click();
	}

	public void clickMotorcycleMenu() {
		element = driver.findElement(By.id("nav_motorcycle"));
		element.click();
	}

	public void clickCamperMenu() {
		element = driver.findElement(By.id("nav_camper"));
		element.click();
	}

	public void clickNextEnterInsurantData() {
		element = driver.findElement(By.id("nextenterinsurantdata"));
		element.click();
	}

	public void clickNextEnterProductData() {
		element = driver.findElement(By.id("nextenterproductdata"));
		element.click();
	}

	public void clickNextSelectPriceOption() {
		element = driver.findElement(By.id("nextselectpriceoption"));
		element.click();
	}

	public void clickNextSendQuote() {
		element = driver.findElement(By.id("nextsendquote"));
		validator.attributeValidator(element, "type", "button");
		element.click();
	}

	public void nextTab(String tab) {
		if (tab.equals("Enter Insurant Data")) {
			this.clickNextEnterInsurantData();
		}
		if (tab.equals("Enter Product Data")) {
			this.clickNextEnterProductData();
		}
		if (tab.equals("Select Price Option")) {
			this.clickNextSelectPriceOption();
		}

	}

	public void menusform(String menu) {
		if (menu.equals("Automobile")) {
			this.clickAutomobileMenu();
		}
		if (menu.equals("Truck")) {
			this.clickTruckMenu();
		}
		if (menu.equals("Motorcycle")) {
			this.clickMotorcycleMenu();
		}
		if (menu.equals("Camper")) {
			this.clickCamperMenu();
		}

	}

}
