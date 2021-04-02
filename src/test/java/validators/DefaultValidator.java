package validators;

import static org.junit.Assert.*;

import org.openqa.selenium.WebElement;

import base.BasePage;

public class DefaultValidator extends BasePage {
	private static DefaultValidator instance;

	public static synchronized DefaultValidator getInstance() {
		if (instance == null)
			instance = new DefaultValidator();
		return instance;
	}

	public void attributeValidator(WebElement element, String attribute, String value) {
		assertEquals(value, element.getAttribute(attribute));
	}

	public void textValidator(WebElement element, String text) {
		assertSame(text, element.getText()); 
	}

}
