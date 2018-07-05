package testpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

class DropDownSelect {

	WebDriver driver;
	String baseUrl;
	
	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:/Users/Jacyzin/Documents/selenium/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "http://letskodeit.teachable.com/p/practice";
		
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@Test
	void testDroDown() throws Exception {
		driver.get(baseUrl);
		WebElement element = driver.findElement(By.id("carselect"));
		Select sel = new Select(element);
		
		Thread.sleep(2000);
		System.out.println("Selecting Benz by value");
		sel.selectByValue("benz");
		
		Thread.sleep(2000);
		System.out.println("Selecting Honda by index");
		sel.selectByIndex(2);
		
		Thread.sleep(2000);
		System.out.println("Selecting BMW by visible text");
		sel.selectByVisibleText("BMW");
		
		Thread.sleep(2000);
		System.out.println("Print the list of all value");
		List<WebElement> options = sel.getOptions();
		
		System.out.println("Size of list: " + options.size());
		options.forEach(o -> {
			System.out.println("option: " + o.getText());
		});
	}
	
	@AfterEach
	void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
