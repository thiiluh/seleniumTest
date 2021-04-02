package steps;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pageObjects.FormPage;
import pageObjects.InsurantDataTabPage;
import pageObjects.PriceOptionTabPage;
import pageObjects.ProductDataTabPage;
import pageObjects.SendQuoteTabPage;
import pageObjects.VehicleDataTabPage;

public class FormStep {

	private static FormPage form = FormPage.getInstance();
	private static VehicleDataTabPage vehicleData = VehicleDataTabPage.getInstance();
	private static InsurantDataTabPage insurantData = InsurantDataTabPage.getInstance();
	private static ProductDataTabPage productData = ProductDataTabPage.getInstance();
	private static PriceOptionTabPage priceOption = PriceOptionTabPage.getInstance();
	private static SendQuoteTabPage sendQuote = SendQuoteTabPage.getInstance();

	@Given("^Start driver and browser$")
	public void startDriver() {
		form.startDriver();
	}

	@And("^Nagivate to application$")
	public void navigateToUrl() {
		form.navigateToUrl();
	}

	@Given("Access {string} menu")
	public void accessAutomobileMenu(String menu) {
		form.menusform(menu);
		vehicleData.clickVehicleData();
	}

	@When("^I fill in all fields on the VehicleData tab for Automobile$")
	public void fillVehicleData(DataTable table) {
		Map<String, String> form = table.asMap(String.class, String.class);
		vehicleData.enterMake(form.get("Make"));
		vehicleData.enterEnginePerformance(form.get("Performance"));
		vehicleData.enterDateOfManufacture(form.get("DateManufacture"));
		vehicleData.enterNumberOfSeats(form.get("NumberofSeats"));
		vehicleData.enterFuel(form.get("FuelType"));
		vehicleData.enterListPrice(form.get("ListPrice"));
		vehicleData.enterLicensePlateNumber(form.get("LicensePlateNumber"));
		vehicleData.enterAnnualMileage(form.get("AnnualMileage"));
	}

	@And("^I check if any fields are missing to be filled for Insurant Data$")
	public void checkMissingFilledForInsurantData() {
		assertEquals("0", insurantData.labelCounter());
	}

	@And("^I check if any fields are missing to be filled for VehicleData$")
	public void checkMissingFilledForVehicleData() {
		assertEquals("0", vehicleData.labelCounter());
	}

	@And("^I check if any fields are missing to be filled for Product Data$")
	public void checkMissingFilledForProductData() {
		assertEquals("0", productData.labelCounter());
	}

	@And("I click Next button to {string}")
	public void pressNextButton(String tab) {
		form.nextTab(tab);
	}

	@And("I fill in all fields on the Insurant Data tab for {string}")
	public void fillInsurantDataForAutomobile(String menu, DataTable table) {
		Map<String, String> form = table.asMap(String.class, String.class);
		insurantData.enterFirstName(form.get("First Name"));
		insurantData.enterLastName(form.get("Last Name"));
		insurantData.enterBirthDate(form.get("Date of Birth"));
		insurantData.enterStreetAddress(form.get("Street Address"));
		insurantData.enterCountry(form.get("Country"));
		insurantData.enterZipCode(form.get("Zip Code"));
		insurantData.enterCity(form.get("City"));
		insurantData.enterOccupation(form.get("Occupation"));
		insurantData.clickBungeeJumping();
	}

	@And("^I fill in all fields on the Product Data tab for Automobile$")
	public void fillProductDataForAutomobile(DataTable table) {
		Map<String, String> form = table.asMap(String.class, String.class);
		productData.enterStartDate(form.get("Start Date"));
		productData.enterInsurancesum(form.get("Insurance Sum"));
		productData.enterMeritrating(form.get("Merit Rating"));
		productData.enterDamageinsurance(form.get("Damage Insurance"));
		productData.enterCourtesycar(form.get("Courtesy Car"));
		productData.clickEuroProtection();

	}

	@And("^I choose and check a quote$")
	public void CchooseCheckQuote(DataTable table) {
		Map<String, String> data = table.asMap(String.class, String.class);

		assertEquals(data.get("Silver"), priceOption.textSilverPrice());
		assertEquals(data.get("Gold"), priceOption.textGoldPrice());
		assertEquals(data.get("Platinum"), priceOption.textPlatinumPrice());
		assertEquals(data.get("Ultimate"), priceOption.textUltimatePrice());

		priceOption.clickSelectGold();
		form.clickNextSendQuote();
	}

	@And("^I fill in all fields on the Send Quote tab$")
	public void fillSendQuoteForAutomobile(DataTable table) {
		Map<String, String> data = table.asMap(String.class, String.class);
		sendQuote.enterEmail(data.get("Email"));
		sendQuote.enterPhone(data.get("Phone"));
		sendQuote.enterUsername(data.get("Username"));
		sendQuote.enterPassword(data.get("Password"));
		sendQuote.enterConfirmpassword(data.get("Confirm Password"));

	}

	@And("^I check if any fields are missing to be filled for Send Quote$")
	public void checkMissingFilledForSendQuote() {
		assertEquals("0", sendQuote.labelCounter());
	}

	@Then("^I click Send button$")
	public void pressSendButton() {
		sendQuote.clickSendemail();
	}

	@And("^I check the success message$")
	public void checkSuccessMessage() {
		System.out.println(sendQuote.labelAlert());
	}

	@When("^I fill in all fields on the VehicleData tab$")
	public void fillVehicleDataTruck(DataTable table) {
		Map<String, String> form = table.asMap(String.class, String.class);
		vehicleData.enterMake(form.get("Make"));
		vehicleData.enterEnginePerformance(form.get("Performance"));
		vehicleData.enterDateOfManufacture(form.get("DateManufacture"));
		vehicleData.enterNumberOfSeats(form.get("NumberofSeats"));
		vehicleData.enterFuel(form.get("FuelType"));
		vehicleData.enterPayLoad(form.get("Payload"));
		vehicleData.enterTotalWeight(form.get("Weight"));
		vehicleData.enterListPrice(form.get("ListPrice"));
		vehicleData.enterLicensePlateNumber(form.get("LicensePlateNumber"));
		vehicleData.enterAnnualMileage(form.get("AnnualMileage"));
	}

	@And("^I fill in all fields on the Product Data tab$")
	public void fillProductDataForTruck(DataTable table) {
		Map<String, String> form = table.asMap(String.class, String.class);
		productData.enterStartDate(form.get("Start Date"));
		productData.enterInsurancesum(form.get("Insurance Sum"));
		productData.enterDamageinsurance(form.get("Damage Insurance"));
		productData.clickEuroProtection();
	}

	@When("^I fill in all fields on the VehicleData tab for Motorcycle$")
	public void fillVehicleDataMotorcycle(DataTable table) {
		Map<String, String> form = table.asMap(String.class, String.class);
		vehicleData.enterMake(form.get("Make"));
		vehicleData.enterModel(form.get("Model"));
		vehicleData.enterCylinderCapacity(form.get("Cylinder"));
		vehicleData.enterEnginePerformance(form.get("Performance"));
		vehicleData.enterDateOfManufacture(form.get("DateManufacture"));
		vehicleData.enterNumberOfSeatsMotorcycle(form.get("NumberofSeats"));
		vehicleData.enterListPrice(form.get("ListPrice"));
		vehicleData.enterAnnualMileage(form.get("AnnualMileage"));
	}



}
