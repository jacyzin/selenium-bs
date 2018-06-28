package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByXPathID {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:/Users/Jacyzin/Documents/selenium/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String baseURL = "http://google.com";
		driver.get(baseURL);
		
		driver.findElement(By.id("lst-ib")).sendKeys("jacyzin");
		driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[3]/center/input[1]")).click();
		
	}
}
