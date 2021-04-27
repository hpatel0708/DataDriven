package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FindReservationPage extends BasePage {

	WebDriver driver;

	public FindReservationPage(WebDriver driver) {

		this.driver = driver;

	}

	// Element Library

	@FindBy(how = How.XPATH, using = "//a[@id='act2']")
	WebElement Find_Button_Locator;

	@FindBy(how = How.XPATH, using = "//a[@id='menu3_0']")
	WebElement Reservation_Button_Locator;

	@FindBy(how = How.XPATH, using = "//input[@name='searchLastName']")
	WebElement Last_Name_Field_Locator;

	@FindBy(how = How.XPATH, using = "//input[@name='searchFirstName']")
	WebElement First_Name_Field_Locator;

//		@FindBy(how = How.XPATH, using = "//*[@id=\"CenterHalfPage\"]/div[1]/div/ul/li/div/div/ul[3]/li[2]/img")
//		WebElement Search_Star_Date_Calender_Button_Locator;
//		
//		@FindBy(how = How.XPATH, using = "//select[@data-handler='selectMonth']")
//		WebElement Select_Month_From_Calender_Dropdown;
//		
//		@FindBy(how = How.XPATH, using = "//td[@class='  ui-datepicker-current-day']")
//		WebElement Select_Date_From_Calender_Dropdown;

	@FindBy(how = How.XPATH, using = "//select[@name='searchStatus']")
	WebElement Status_Field_Locator;

	@FindBy(how = How.XPATH, using = "//select[@name='searchRoomType']")
	WebElement Room_Type_Locator;

	@FindBy(how = How.XPATH, using = "//a[@id='SubmitFindReservation']")
	WebElement Search_Button_Locator;

	// Interactive Methods

	public void clickOnFindButton() {

		Find_Button_Locator.click();
	}

	public void clickOnReservationButton() {

		waitForElement(driver, 5, Reservation_Button_Locator);

		Reservation_Button_Locator.click();

	}

	public void enterLastName(String LastName) {

		Last_Name_Field_Locator.sendKeys(LastName);

	}

	public void enterFirstName(String FirstName) {

		First_Name_Field_Locator.sendKeys(FirstName);

	}

//		public void clickOnStartDateCalenderbutton () {
//			
//			Search_Star_Date_Calender_Button_Locator.click();
//			
//		}
//		
//		public void selectMonth(String month) {
//
//			selectDropDown(Select_Month_From_Calender_Dropdown, month);
//		}
//		
//		public void selectDate() {
//			
//			Actions action = new Actions (driver);
//			
//			action.moveToElement(Select_Date_From_Calender_Dropdown).click();
//		}

	public void statusField(String status) {
		waitForElement(driver, 5, Room_Type_Locator);

		selectDropDown(Status_Field_Locator, status);

	}

	public void RoomTypeField(String roomtype) {

		selectDropDown(Room_Type_Locator, roomtype);

	}

	public void clickOnSearchButton() {

		Search_Button_Locator.click();
	}
}
