package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {

	public static void main(String[] args) {

		// https://chromedriver.storage.googleapis.com/index.html
		String baseURL = "http://uol.com.br";
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:/Users/Jacyzin/Documents/selenium/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseURL);
		
	}

}
