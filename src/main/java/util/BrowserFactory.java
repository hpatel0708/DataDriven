package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver init() {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		
	    driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.choiceadvantage.com/choicehotels/sign_in.jsp");
		
		return driver;
		
	}

	public static WebDriver tearDown() {
		
		driver.close();
		
		driver.quit();
		
		return driver;
		
	}
}
