package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriverDemo {
	
	public static void main(String[] args) {
		
		String baseURL = "http://uol.com.br";
		WebDriver driver;

		System.setProperty("webdriver.ie.driver", "C:/Users/Jacyzin/Documents/selenium/drivers/IEdriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get(baseURL);
		
	}

}
