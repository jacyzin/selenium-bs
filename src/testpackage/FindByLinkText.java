package testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByLinkText {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:/Users/Jacyzin/Documents/selenium/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		String baseURL = "http://uol.com.br";
		driver.get(baseURL);
		
		driver.findElement(By.linkText("Go4Gold")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Saiba o que é 'tecnoestresse'")).click();
		
	}

}
