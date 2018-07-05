package testpackage;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class RadioButtonsAndCheckBoxes {

	WebDriver driver;
	String baseUrl;
	
	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:/Users/Jacyzin/Documents/selenium/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "http://letskodeit.teachable.com/pages/practice";
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@Test
	void test() throws InterruptedException {
		WebElement bmwRadio = driver.findElement(By.id("bmwradio"));
		bmwRadio.click();
		
		Thread.sleep(2000);
		WebElement benzRadio = driver.findElement(By.id("benzradio"));
		benzRadio.click();
		
		Thread.sleep(2000);
		WebElement bmwCheck = driver.findElement(By.id("bmwcheck"));
		bmwCheck.click();
		
		Thread.sleep(2000);
		WebElement benzCheck = driver.findElement(By.id("benzcheck"));
		benzCheck.click();
		
		System.out.println("BMW radio is selected? : " + bmwRadio.isSelected()); 
		System.out.println("Benz radio is selected? : " + benzRadio.isSelected());
		System.out.println("BMW check is selected? : " + bmwCheck.isSelected());
		System.out.println("Benz check is selected? : " + benzCheck.isSelected());
		
	}
	
	@AfterEach
	void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
