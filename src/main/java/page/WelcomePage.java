package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;


public class WelcomePage {

	WebDriver driver;
	
	public WelcomePage (WebDriver driver) {
		
		this.driver = driver;
	}

	// Element Library

	@FindBy(how = How.XPATH, using = "//h3[@id='smartwelcome_greeting']")
	WebElement WelcomePage_Element_Locator;

	// Interactive Methods

	public void validateWelcomePage() {

		Assert.assertEquals(WelcomePage_Element_Locator.getText(), "Good Morning, Hardik!", "Wrong Page");

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
}
