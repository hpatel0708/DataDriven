package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import page.WelcomePage;
import util.BrowserFactory;
import util.ExcelReader;

public class LoginTest {
	
	WebDriver driver;
	
	ExcelReader excelread = new ExcelReader("Data/DataDrivenFrameworkChoice.xlsx");
	
	String userId = excelread.getCellData("LoginInfo", "User_Id", 2);
	
	String password = excelread.getCellData("LoginInfo", "Password", 2);
	
	@Test
	
	public void loginTest() {
		
		driver = BrowserFactory.init();
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		loginpage.enterUserId(userId);
		
		loginpage.enterPassword(password);
		
		loginpage.clickSignInButton();
		
		WelcomePage welcomepage =PageFactory.initElements(driver, WelcomePage.class);
		
		welcomepage.validateWelcomePage();
		
		BrowserFactory.tearDown();
		
		
		
	}

}
