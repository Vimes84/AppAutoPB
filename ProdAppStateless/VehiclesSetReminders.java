package ProdAppStateless;

import java.net.MalformedURLException;

import java.time.LocalDate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class VehiclesSetReminders {

	private AppiumDriver<MobileElement> driver;
	private Repository.MethodRepo repo;
	private Repository.ElementRepo bind;

	public void OUTPUT(String output) {
		System.out.println(output);
	}

	public void OUTPUTFAIL(String output) {
		System.err.println(output);
	}

	@Before
	public void setUp() throws MalformedURLException {
		repo = new Repository.MethodRepo();
	}

	// General

	String xPath = "";
	String id = "";
	String expectedResult = "";
	String keyedInput = "";
	String elementList = "";
	String elementClass = "";
	String elementText = "";
	LocalDate todaysDate = java.time.LocalDate.now();

	@Test

	public void appMyVehiclesEditVehicleTest() {

		bind = new Repository.ElementRepo();

		OUTPUT("***** EXECUTING - SET REMINDERS - MY VEHICLES PAGE TESTS *****");

		repo.LaunchStatelessAllowAll();

		repo.TabSwitch(bind.appmenu_VehiclesXP);

		repo.Onboarding();

		// Logging into MyRAC Account with 1 Added Vehicle

		OUTPUT("--- Logging into MyRAC Account with 1 Added Vehicle ---");

		OUTPUT("--- My Vehicles Page Loaded ---");

		repo.TriggerClickById(bind.login_Button);

		repo.pause(2000);

		keyedInput = ("PREGOLIVETEST@mailinator.com");

		repo.SendKeysById(bind.email_Entry, keyedInput);

		keyedInput = ("Test@123");

		repo.SendKeysById(bind.password_Entry, keyedInput);

		repo.LoginFailCheck();

// Checking Set Reminder Functions

		OUTPUT("*** Checking Unedited Reminders Page ***");

		repo.pause(6000);

		repo.TriggerClickById(bind.addedVehicle_Name);

		repo.pause(4000);

		repo.TriggerClickById(bind.setReminder_Link);

		repo.pause(2000);

		expectedResult = "MOT expiry";

		if (repo.TextBoxCheckIgnoreFormatById(bind.setMot_Label, expectedResult)) {
			OUTPUT("PASS - MOT label Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - MOT label Text is NOT Correct");
		}

		if (repo.IsEnabledClickableById(bind.setMot_Tap) == true) {
			OUTPUT("PASS - Set MOT Date Tap Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Set MOT Date Tap Button is Not Enabled & Clickable");
		}

		expectedResult = "Tax expiry";

		if (repo.TextBoxCheckIgnoreFormatById(bind.setTax_Label, expectedResult)) {
			OUTPUT("PASS - Tax label Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Tax label Text is NOT Correct");
		}

		if (repo.IsEnabledClickableById(bind.setTax_Tap) == true) {
			OUTPUT("PASS - Set Tax Date Tap Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Set Tax Date Tap Button is Not Enabled & Clickable");
		}

		expectedResult = "Next service";

		if (repo.TextBoxCheckIgnoreFormatById(bind.setService_Label, expectedResult)) {
			OUTPUT("PASS - Service label Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Service label Text is NOT Correct");
		}

		if (repo.IsEnabledClickableById(bind.setService_Tap) == true) {
			OUTPUT("PASS - Set Service Date Tap Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Set Service Date Tap Button is Not Enabled & Clickable");
		}

		expectedResult = "Insurance expiry";

		if (repo.TextBoxCheckIgnoreFormatById(bind.setInsurance_Label, expectedResult)) {
			OUTPUT("PASS - Insurance label Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Insurance label Text is NOT Correct");
		}

		if (repo.IsEnabledClickableById(bind.setInsurance_Tap) == true) {
			OUTPUT("PASS - Set Insurance Date Tap Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Set Insurance Date Tap Button is Not Enabled & Clickable");
		}

// Checking Set Reminder Functions - Editing dates

		OUTPUT("*** Amending Dates on Reminders Page to Todays Date ***");

		repo.TriggerClickById(bind.setMot_Tap);

		repo.pause(2000);

		repo.TriggerClickById(bind.popUp_RightButton);

		repo.pause(2000);

		repo.TriggerClickById(bind.setTax_Tap);

		repo.pause(2000);

		repo.TriggerClickById(bind.popUp_RightButton);

		repo.pause(2000);

		repo.TriggerClickById(bind.setService_Tap);

		repo.pause(2000);

		repo.TriggerClickById(bind.popUp_RightButton);

		repo.pause(2000);

		repo.TriggerClickById(bind.setInsurance_Tap);

		repo.pause(2000);

		repo.TriggerClickById(bind.popUp_RightButton);

		repo.pause(2000);

		repo.pause(2000);

		OUTPUT("^^^-- TAKING A SCREENSHOT --^^^");

		String Filename = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteEMyVehicles/"
				+ todaysDate + "/" + todaysDate + "-93-RemindersSet.jpg";
		repo.CaptureScreenshot(Filename);

		repo.pause(1000);

		repo.Back();

		OUTPUT("*** Returning to my Vehicle page and checking with amended dates ***");

		elementList = "uk.co.rac.roadside:id/action_bar_root";
		elementClass = "android.widget.TextView";
		elementText = "Insurance";

		repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

		OUTPUT("^^^-- TAKING A SCREENSHOT --^^^");

		String Filename2 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteEMyVehicles/"
				+ todaysDate + "/" + todaysDate + "-94-MyVehicleRemiders.jpg";
		repo.CaptureScreenshot(Filename2);

		// Checking MOT

		OUTPUT("*** Checking MOT Reminder Info ***");

		if (repo.IsDisplayedByXPath(bind.MOT_IconXP)) {
			OUTPUT("PASS - MOT Icon is Displayed");
		} else {
			OUTPUTFAIL("FAIL - MOT Icon is Displayed");
		}

		expectedResult = "MOT";

		if (repo.TextBoxCheckIgnoreFormatById(bind.setMot_Label, expectedResult)) {
			OUTPUT("PASS - MOT Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - MOT Text is NOT Correct");
		}

		expectedResult = "Expired";

		if (repo.TextBoxStartsWithById(bind.setMot_Date, expectedResult)) {
			OUTPUT("PASS - MOT Expiry text is correct");
		} else {
			OUTPUTFAIL("FAIL - MOT Expiry text is NOT correct");
		}

		expectedResult = "OFF";

		if (repo.TextBoxCheckById(bind.MOT_Toggle, expectedResult)) {
			OUTPUT("PASS - MOT Toggle is OFF");
		} else {
			OUTPUTFAIL("FAIL - MOT Toggle is ON");
		}

		if (repo.IsEnabledClickableById(bind.MOT_Calendar) == true) {
			OUTPUT("PASS - MOT Calendar Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - MOT Calendar Button is NOT Enabled & Clickable");
		}

		// Checking Tax

		OUTPUT("*** Checking Vehicle Tax Reminder Info ***");

		repo.pause(2000);

		if (repo.IsDisplayedByXPath(bind.Tax_IconXP)) {
			OUTPUT("PASS - Tax Icon is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Tax Icon is Displayed");
		}

		expectedResult = "Vehicle Tax";

		if (repo.TextBoxCheckIgnoreFormatById(bind.Tax_Label, expectedResult)) {
			OUTPUT("PASS - Vehicle Tax Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Vehicle Tax Text is NOT Correct");
		}

		expectedResult = "Expired";

		if (repo.TextBoxStartsWithById(bind.Tax_Date, expectedResult)) {
			OUTPUT("PASS - Vehicle Tax Expiry text is correct");
		} else {
			OUTPUTFAIL("FAIL - Vehicle Tax Expiry text is NOT correct");
		}

		expectedResult = "OFF";

		if (repo.TextBoxCheckById(bind.Tax_Toggle, expectedResult)) {
			OUTPUT("PASS - Tax Toggle is OFF");
		} else {
			OUTPUTFAIL("FAIL - Tax Toggle is ON");
		}

		if (repo.IsEnabledClickableById(bind.Tax_Calendar) == true) {
			OUTPUT("PASS - Tax Calendar Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Tax Calendar Button is NOT Enabled & Clickable");
		}

		// Checking Next Service

		OUTPUT("*** Next Service Reminder Info ***");

		repo.pause(2000);

		if (repo.IsDisplayedByXPath(bind.Service_IconXP)) {
			OUTPUT("PASS - Next Service Icon is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Next Service Icon is Displayed");
		}

		expectedResult = "Next Service";

		if (repo.TextBoxCheckIgnoreFormatById(bind.Service_Label, expectedResult)) {
			OUTPUT("PASS - Next Service Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Next Service Text is NOT Correct");
		}

		expectedResult = "Overdue";

		if (repo.TextBoxStartsWithById(bind.Service_Date, expectedResult)) {
			OUTPUT("PASS - Next Service Overdue text is correct");
		} else {
			OUTPUTFAIL("FAIL - Next Service Overdue text is NOT correct");
		}

		expectedResult = "OFF";

		if (repo.TextBoxCheckById(bind.Service_Toggle, expectedResult)) {
			OUTPUT("PASS - Next Service Toggle is OFF");
		} else {
			OUTPUTFAIL("FAIL - Next Service Toggle is ON");
		}

		if (repo.IsEnabledClickableById(bind.Service_Calendar) == true) {
			OUTPUT("PASS - Service Calendar Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Service Calendar Button is NOT Enabled & Clickable");
		}

		// Checking Insurance

		OUTPUT("*** Checking Insurance Reminder Info ***");

		repo.pause(2000);

		if (repo.IsDisplayedByXPath(bind.Insurance_IconXP)) {
			OUTPUT("PASS - Insurance Icon is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Insurance Icon is Displayed");
		}

		expectedResult = "Insurance";

		if (repo.TextBoxCheckIgnoreFormatById(bind.setInsurance_Label, expectedResult)) {
			OUTPUT("PASS - Insurance Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Insurance Text is NOT Correct");
		}

		expectedResult = "Expired";

		if (repo.TextBoxStartsWithById(bind.setInsurance_Date, expectedResult)) {
			OUTPUT("PASS - Insurance Overdue text is correct");
		} else {
			OUTPUTFAIL("FAIL - Insurance Overdue text is NOT correct");
		}

		expectedResult = "OFF";

		if (repo.TextBoxCheckById(bind.Insurance_Toggle, expectedResult)) {
			OUTPUT("PASS - Insurance Toggle is OFF");
		} else {
			OUTPUTFAIL("FAIL - Insurance Toggle is ON");
		}

		if (repo.IsEnabledClickableById(bind.Insurance_Calendar) == true) {
			OUTPUT("PASS - Insurance Calendar Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Insurance Calendar Button is NOT Enabled & Clickable");
		}

		// Toggling Reminders to ON, checking and Screenshot

		OUTPUT("*** Toggling Reminders On For All ***");

		repo.pause(2000);

		repo.TriggerClickById(bind.MOT_Toggle);

		repo.pause(1000);

		repo.TriggerClickById(bind.Tax_Toggle);

		repo.pause(1000);

		repo.TriggerClickById(bind.Service_Toggle);

		repo.pause(1000);

		repo.TriggerClickById(bind.Insurance_Toggle);

		repo.pause(1000);

		expectedResult = "ON";

		if (repo.TextBoxCheckById(bind.MOT_Toggle, expectedResult)) {
			OUTPUT("PASS - MOT Toggle is ON");
		} else {
			OUTPUTFAIL("FAIL - MOT Toggle is OFF");
		}

		expectedResult = "ON";

		if (repo.TextBoxCheckById(bind.Tax_Toggle, expectedResult)) {
			OUTPUT("PASS - Tax Toggle is ON");
		} else {
			OUTPUTFAIL("FAIL - Tax Toggle is OFF");
		}

		expectedResult = "ON";

		if (repo.TextBoxCheckById(bind.Service_Toggle, expectedResult)) {
			OUTPUT("PASS - Service Toggle is ON");
		} else {
			OUTPUTFAIL("FAIL - Service Toggle is OFF");
		}

		expectedResult = "ON";

		if (repo.TextBoxCheckById(bind.Insurance_Toggle, expectedResult)) {
			OUTPUT("PASS - Insurance Toggle is ON");
		} else {
			OUTPUTFAIL("FAIL - Insurance Toggle is OFF");
		}

		OUTPUT("^^^-- TAKING A SCREENSHOT --^^^");

		String Filename3 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteEMyVehicles/"
				+ todaysDate + "/" + todaysDate + "-95-AllRemindersToggleON.jpg";
		repo.CaptureScreenshot(Filename3);

		// Setting Calendar Reminders for ALL

		OUTPUT("*** Setting Calendar Reminders for ALL ***");

		repo.TriggerClickById(bind.MOT_Calendar);

		repo.pause(2000);

		repo.TriggerClickById(bind.androidAllow);

		repo.pause(2000);

		OUTPUT("^^^-- TAKING A SCREENSHOT --^^^");

		String Filename4 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteEMyVehicles/"
				+ todaysDate + "/" + todaysDate + "-96-CalendarEntry.jpg";
		repo.CaptureScreenshot(Filename4);

		repo.pause(2000);

		repo.TriggerClickById(bind.calendar_Save);

		repo.TriggerClickById(bind.Tax_Calendar);

		repo.pause(2000);

		repo.TriggerClickById(bind.calendar_Save);

		repo.TriggerClickById(bind.Service_Calendar);

		repo.pause(2000);

		repo.TriggerClickById(bind.calendar_Save);

		repo.TriggerClickById(bind.Insurance_Calendar);

		repo.pause(2000);

		repo.TriggerClickById(bind.calendar_Save);

		// Deleting Dates for ALL

		OUTPUT("*** Deleting Reminders for ALL ***");

		repo.TriggerClickById(bind.setReminder_Edit);

		repo.TriggerClickById(bind.setMot_Delete);

		repo.pause(2000);

		repo.TriggerClickById(bind.setTax_Delete);

		repo.pause(2000);

		repo.TriggerClickById(bind.setService_Delete);

		repo.pause(2000);

		repo.TriggerClickById(bind.setInsurance_Delete);

		repo.pause(2000);

		OUTPUT("^^^-- TAKING A SCREENSHOT --^^^");

		String Filename5 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteEMyVehicles/"
				+ todaysDate + "/" + todaysDate + "-97-DeletedReminders.jpg";
		repo.CaptureScreenshot(Filename5);

		repo.Back();

		repo.pause(2000);

		OUTPUT("^^^-- TAKING A SCREENSHOT --^^^");

		String Filename6 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteEMyVehicles/"
				+ todaysDate + "/" + todaysDate + "-98-MyVehicleDeletedReminders.jpg";
		repo.CaptureScreenshot(Filename6);

		// Deleting added vehicle to reset for future testing

		OUTPUT("*** DELETING VEHICLE FROM USER TO MAKE READY FOR FUTURE TESTING ***");

		repo.TriggerClickById(bind.addedVehicle_Name);

		repo.pause(3000);

		repo.TriggerClickById(bind.addedVehicle_Delete);

		repo.pause(2000);

		repo.TriggerClickById(bind.popUp_RightButton);

		OUTPUT("***** COMPLETED - SET REMINDERS - MY VEHICLES PAGE TESTS *****");

	}

	@After
	public void tearDown() {

		driver.quit();
	}
}
