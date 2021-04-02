package pageObjects;

import org.openqa.selenium.By;

import base.BasePage;
import validators.DefaultValidator;

public class VehicleDataTabPage extends BasePage {

	private static VehicleDataTabPage instance;

	public static synchronized VehicleDataTabPage getInstance() {
		if (instance == null)
			instance = new VehicleDataTabPage();
		return instance;
	}

	private static DefaultValidator validator = DefaultValidator.getInstance();

	public String labelCounter() {
		element = driver.findElement(By.xpath("//span[@class='counter zero']"));
		return element.getText().toString();
	}

	public void clickVehicleData() {
		element = driver.findElement(By.id("entervehicledata"));
		element.click();
	}

	public void enterMake(String make) {
		element = driver.findElement(By.id("make"));
		validator.attributeValidator(element, "name", "Make");
		element.sendKeys(make);
	}

	public void enterModel(String model) {
		element = driver.findElement(By.id("model"));
		element.sendKeys(model);
	}

	public void enterCylinderCapacity(String cylindercapacity) {
		element = driver.findElement(By.id("cylindercapacity"));
		element.sendKeys(cylindercapacity);
	}

	public void enterEnginePerformance(String engineperformance) {
		element = driver.findElement(By.id("engineperformance"));
		element.sendKeys(engineperformance);
	}

	public void enterDateOfManufacture(String dateofmanufacture) {
		element = driver.findElement(By.id("dateofmanufacture"));
		element.sendKeys(dateofmanufacture);
	}

	public void enterNumberOfSeats(String numberofseats) {
		element = driver.findElement(By.id("numberofseats"));
		element.sendKeys(numberofseats);
	}
	
	public void enterNumberOfSeatsMotorcycle(String numberofseatsmotorcycle) {
		element = driver.findElement(By.id("numberofseatsmotorcycle"));
		element.sendKeys(numberofseatsmotorcycle);
	}
	
	public void enterFuel(String fuel) {
		element = driver.findElement(By.id("fuel"));
		element.sendKeys(fuel);
	}

	public void enterListPrice(String listprice) {
		element = driver.findElement(By.id("listprice"));
		element.sendKeys(listprice);
	}

	public void enterLicensePlateNumber(String licenseplatenumber) {
		element = driver.findElement(By.id("licenseplatenumber"));
		element.sendKeys(licenseplatenumber);
	}

	public void enterAnnualMileage(String annualmileage) {
		element = driver.findElement(By.id("annualmileage"));
		element.sendKeys(annualmileage);
	}

	public void enterPayLoad(String payload) {
		element = driver.findElement(By.id("payload"));
		element.sendKeys(payload);
	}

	public void enterTotalWeight(String totalweight) {
		element = driver.findElement(By.id("totalweight"));
		element.sendKeys(totalweight);
	}

	public void clickRightHandDriveYes() {
		element = driver.findElement(By.id("righthanddriveyes"));
		element.click();
	}

	public void clickRightHandDriveNo() {
		element = driver.findElement(By.id("righthanddriveno"));
		element.click();
	}

}
