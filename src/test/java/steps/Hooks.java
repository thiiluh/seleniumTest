package steps;

import base.BasePage;
import io.cucumber.java.After;

public class Hooks extends BasePage {

	@After
	public void quit() {
		System.out.println("quit browser");
		driver.quit();
	}
}
