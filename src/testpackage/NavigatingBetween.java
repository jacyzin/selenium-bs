package testpackage;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class NavigatingBetween {
	
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
	void test() throws InterruptedException {
		driver.get(baseUrl);
		String title = driver.getTitle();
		System.out.println("Title of page is: "+ title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url is: " +  currentUrl);
		
		String urlToNavigate = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
		driver.navigate().to(urlToNavigate);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println("Navigate back");
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		System.out.println("Navigate forward");
		
		driver.navigate().refresh();
		System.out.println("Navigate refresh");
		
		driver.get(currentUrl);
		
	}
	
	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}


}
