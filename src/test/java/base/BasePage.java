package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

	public static WebDriver driver;
	public static WebElement element = null;
	public static String BASEURL = "http://sampleapp.tricentis.com/101/app.php";

	public static void setup() {
		System.setProperty("webdriver.chrome.driver",
				"src//test//resources//CucumberSelenium//chromedriver_linux64//chromedriver");
		driver = new ChromeDriver();
		System.out.println("Opening browser");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
