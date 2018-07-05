package testpackage;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class ElementState {
	
	WebDriver driver;
	String baseUrl;

	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:/Users/Jacyzin/Documents/selenium/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "http://google.com";
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}
	
	@Test
	void test() {
		WebElement element1 = driver.findElement(By.id("lst-ib"));
		System.out.println("Element 1 is enable? : " + element1.isEnabled());
		element1.sendKeys("jacyzin");
		
		WebElement element2 = driver.findElement(By.id("gs_htif0"));
		System.out.println("Element 2 is enable? : " + element2.isEnabled());
		
	}


	@AfterEach
	void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
