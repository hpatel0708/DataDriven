package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.FindReservationPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class FindReservationTest {

	WebDriver driver;

	ExcelReader excelreader = new ExcelReader("Data/DataDrivenFrameworkChoice.xlsx");

	String userId = excelreader.getCellData("LoginInfo", "User_Id", 2);

	String password = excelreader.getCellData("LoginInfo", "Password", 2);

	String LastName = excelreader.getCellData("FindReservation", "LastName", 2);

	String FirstName = excelreader.getCellData("FindReservation", "FirstName", 2);

	String status = excelreader.getCellData("FindReservation", "Status", 2);

	String roomtype = excelreader.getCellData("FindReservation", "RoomType", 2);
	
	@Test

	public void userShouldBeAbleToFindReservation() {

		driver = BrowserFactory.init();

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);

		loginpage.enterUserId(userId);

		loginpage.enterPassword(password);

		loginpage.clickSignInButton();

		FindReservationPage findreservation = PageFactory.initElements(driver, FindReservationPage.class);

		findreservation.clickOnFindButton();

		findreservation.clickOnReservationButton();

		findreservation.enterLastName(LastName);

		findreservation.enterFirstName(FirstName);

		findreservation.statusField(status);

		findreservation.RoomTypeField(roomtype);

		findreservation.clickOnSearchButton();

		// driver = BrowserFactory.tearDown();

	}

}
