package testpackage;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class BasicActions {

	WebDriver driver;
	String baseUrl;
	
	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:/Users/Jacyzin/Documents/selenium/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "http://letskodeit.teachable.com";
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	@Test
	void test() {
		driver.get(baseUrl);
		driver.findElement(By.xpath("/html/body/header/div/div/div/div/ul/li[2]/a")).click();
		System.out.println("Clicked on login");
		driver.manage().timeouts().setScriptTimeout(3, TimeUnit.SECONDS);
		driver.findElement(By.id("user_email")).clear();
		driver.findElement(By.id("user_email")).sendKeys("henryjacyzin@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("testLogin");
		driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[3]/input")).click();
	
	}

	@AfterEach
	void tearDown() throws Exception {
		//driver.quit();
	}

}
