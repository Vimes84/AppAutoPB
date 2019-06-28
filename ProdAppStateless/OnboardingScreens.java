package ProdAppStateless;

import java.net.MalformedURLException;

import java.time.LocalDate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class OnboardingScreens {

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
	public void onboardingScreenTests() {

		bind = new Repository.ElementRepo();

		OUTPUT("*******************************************************************************************************************************************");

		OUTPUT("************************************************* EXECUTING TEST SUITE B - LOGGED OUT LITE ************************************************");

		OUTPUT("*******************************************************************************************************************************************");

		OUTPUT("***** EXECUTING - ONBOARDING SCREEN TESTS *****");

		repo.LaunchStatelessAllowAllOB();

// Loading First Onboarding Screen

		OUTPUT("--- Route Planner Onboarding Page Loaded ---");

// Route Planner & Traffic Onboarding Screen

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteBLoggedOutLITE/"
				+ todaysDate + "/" + todaysDate + "-1-Onboarding-RoutePlanner.jpg";
		repo.CaptureScreenshot(Filename);

// Commented out the following checks as these will not run when run in LaunchStateless

		/*
		 * OUTPUT("--- Checking Route & Traffic Onboarding Screen");
		 * 
		 * if (repo.IsDisplayedById(bind.onboarding_Image)) {
		 * OUTPUT("PASS - Onboarding Image is Displayed"); } else {
		 * OUTPUTFAIL("FAIL - Onboarding Image is NOT Displayed"); }
		 * 
		 * expectedResult = ("ROUTE PLANNER & TRAFFIC");
		 * 
		 * if (repo.TextBoxCheckById(bind.onboarding_Title, expectedResult)) {
		 * OUTPUT("PASS - Onboarding Title is Correct"); } else {
		 * OUTPUTFAIL("FAIL - Onboarding Title is NOT Correct"); }
		 * 
		 * expectedResult =
		 * ("Plan your route, see roadworks, incidents and traffic. Work out journey times based on current or future traffic, and calculate expenses."
		 * );
		 * 
		 * if (repo.TextBoxCheckIgnoreFormatById(bind.onboarding_Message,
		 * expectedResult)) { OUTPUT("PASS - Onboarding Message is Correct"); } else {
		 * OUTPUTFAIL("FAIL - Onboarding Message is NOT Correct"); }
		 * 
		 * if (repo.IsEnabledClickableById(bind.onboarding_Button) == true) {
		 * OUTPUT("PASS - Onboarding Button is Enabled & Clickable"); } else {
		 * OUTPUTFAIL("FAIL - Onboarding Button is NOT Enabled & Clickable"); }
		 * 
		 * expectedResult = "GET STARTED";
		 * 
		 * if (repo.TextBoxCheckById(bind.onboarding_ButtonText, expectedResult)) {
		 * OUTPUT("PASS - Onboarding Button Text is Correct"); } else {
		 * OUTPUTFAIL("FAIL - Onboarding Button Text is NOT Correct"); }
		 */

		// Pressing the Onboarding Button using dodgy co-ordinates method

		repo.pause(3000);

		// Onboarding Press S6

		repo.pressByCoord(0.75, 0.5);

		// Onboarding Press S7

		repo.pressByCoord(0.9, 0.5);

		// Onboarding Press S8

		repo.pressByCoord(0.8, 0.5);

		repo.TriggerClickById(bind.androidAllow);

		repo.pause(3000);

		OUTPUT("--- Checking Route & traffic Tab is Displayed ---");

		if (repo.IsDisplayedById(bind.rp_SearchIcon) == true) {
			OUTPUT("PASS - Route & Traffic Tab is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Route & Traffic Tab is NOT Displayed");
		}

/// My Vehicle Onboarding Screen	

		repo.TabSwitch(bind.appmenu_VehiclesXP);

		repo.pause(3000);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename3 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteBLoggedOutLITE/"
				+ todaysDate + "/" + todaysDate + "-2-Onboarding-Vehicles.jpg";
		repo.CaptureScreenshot(Filename3);

		OUTPUT("--- Checking My Vehicle Onboarding Screen");

		if (repo.IsDisplayedById(bind.onboarding_Image)) {
			OUTPUT("PASS - Onboarding Image is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Onboarding Image is NOT Displayed");
		}

		expectedResult = ("MY VEHICLE");

		if (repo.TextBoxCheckById(bind.onboarding_Title, expectedResult)) {
			OUTPUT("PASS - Onboarding Title is Correct");
		} else {
			OUTPUTFAIL("FAIL - Onboarding Title is NOT Correct");
		}

		expectedResult = ("Keep all your vehicle information in one place and set phone and calendar reminders for key dates.");

		if (repo.TextBoxCheckIgnoreFormatById(bind.onboarding_Message, expectedResult)) {
			OUTPUT("PASS - Onboarding Message is Correct");
		} else {
			OUTPUTFAIL("FAIL - Onboarding Message is NOT Correct");
		}

		if (repo.IsEnabledClickableById(bind.onboarding_Button) == true) {
			OUTPUT("PASS - Onboarding Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Onboarding Button is NOT Enabled & Clickable");
		}

		expectedResult = "GET STARTED";

		if (repo.TextBoxCheckById(bind.onboarding_ButtonText, expectedResult)) {
			OUTPUT("PASS - Onboarding Button Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Onboarding Button Text is NOT Correct");
		}

		repo.TriggerClickById(bind.onboarding_Button);

		OUTPUT("--- Checking My Vehicles Tab is Displayed ---");

// Commented out the following check and replaced it as toolbar title will not be found in LaunchStateless	

		repo.pause(3000);

		/*
		 * expectedResult = "MY VEHICLES";
		 * 
		 * if (repo.TextBoxCheckById(bind.toolbar_Title, expectedResult)) {
		 * OUTPUT("PASS - Title bar text is Correct"); } else {
		 * OUTPUTFAIL("FAIL - Title bar text is NOT Correct"); }
		 */

		expectedResult = "Log in to view a list of your vehicles, add more and set reminders for key dates.";

		if (repo.TextBoxCheckById(bind.intro_Message, expectedResult)) {
			OUTPUT("PASS - My Vehicles Page is Displayed");
		} else {
			OUTPUTFAIL("FAIL - My Vehicles Page is NOT Displayed");
		}

/// Rescue Me Onboarding Screen	

		repo.TabSwitch(bind.appmenu_RescueXP);

		repo.pause(3000);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename5 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteBLoggedOutLITE/"
				+ todaysDate + "/" + todaysDate + "-3-Onboarding-RescueMe.jpg";
		repo.CaptureScreenshot(Filename5);

		OUTPUT("--- Checking Rescue Me Onboarding Screen");

		if (repo.IsDisplayedById(bind.onboarding_Image)) {
			OUTPUT("PASS - Onboarding Image is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Onboarding Image is NOT Displayed");
		}

		expectedResult = ("RESCUE ME");

		if (repo.TextBoxCheckById(bind.onboarding_Title, expectedResult)) {
			OUTPUT("PASS - Onboarding Title is Correct");
		} else {
			OUTPUTFAIL("FAIL - Onboarding Title is NOT Correct");
		}

		expectedResult = ("Provide your location so we can easily find you, and get breakdown assistance with one tap of a button.");

		if (repo.TextBoxCheckIgnoreFormatById(bind.onboarding_Message, expectedResult)) {
			OUTPUT("PASS - Onboarding Message is Correct");
		} else {
			OUTPUTFAIL("FAIL - Onboarding Message is NOT Correct");
		}

		if (repo.IsEnabledClickableById(bind.onboarding_Button) == true) {
			OUTPUT("PASS - Onboarding Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Onboarding Button is NOT Enabled & Clickable");
		}

		expectedResult = "GET STARTED";

		if (repo.TextBoxCheckById(bind.onboarding_ButtonText, expectedResult)) {
			OUTPUT("PASS - Onboarding Button Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Onboarding Button Text is NOT Correct");
		}

		repo.TriggerClickById(bind.onboarding_Button);

		OUTPUT("--- Checking Rescue Me Tab is Displayed ---");

		repo.pause(3000);

		id = "uk.co.rac.roadside:id/rescuemeInfoTitle";
		expectedResult = "RESCUE ME";

		if (repo.TextBoxCheckById(id, expectedResult)) {
			OUTPUT("PASS - Rescue Me Tab is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Rescue Me Tab is NOT Displayed");
		}

//// News Onboarding Screen	

		repo.TabSwitch(bind.appmenu_NewsXP);

		repo.pause(3000);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename7 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteBLoggedOutLITE/"
				+ todaysDate + "/" + todaysDate + "-4-Onboarding-MotoringNews.jpg";
		repo.CaptureScreenshot(Filename7);

		OUTPUT("--- Checking News Onboarding Screen");

		if (repo.IsDisplayedById(bind.onboarding_Image)) {
			OUTPUT("PASS - Onboarding Image is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Onboarding Image is NOT Displayed");
		}

		expectedResult = ("MOTORING NEWS");

		if (repo.TextBoxCheckById(bind.onboarding_Title, expectedResult)) {
			OUTPUT("PASS - Onboarding Title is Correct");
		} else {
			OUTPUTFAIL("FAIL - Onboarding Title is NOT Correct");
		}

		expectedResult = ("Read the latest motoring news and see live fuel prices.");

		if (repo.TextBoxCheckIgnoreFormatById(bind.onboarding_Message, expectedResult)) {
			OUTPUT("PASS - Onboarding Message is Correct");
		} else {
			OUTPUTFAIL("FAIL - Onboarding Message is NOT Correct");
		}

		if (repo.IsEnabledClickableById(bind.onboarding_Button) == true) {
			OUTPUT("PASS - Onboarding Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Onboarding Button is NOT Enabled & Clickable");
		}

		expectedResult = "GET STARTED";

		if (repo.TextBoxCheckById(bind.onboarding_ButtonText, expectedResult)) {
			OUTPUT("PASS - Onboarding Button Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Onboarding Button Text is NOT Correct");
		}

		repo.TriggerClickById(bind.onboarding_Button);

		repo.pause(3000);

		OUTPUT("--- Checking Rescue Me Tab is Displayed ---");

		id = "uk.co.rac.roadside:id/toolbar_title";
		expectedResult = "NEWS";

		if (repo.TextBoxCheckById(id, expectedResult)) {
			OUTPUT("PASS - News Tab is Displayed");
		} else {
			OUTPUTFAIL("FAIL - News Tab is NOT Displayed");
		}

///// MyRAC Onboarding Screen	

		repo.TabSwitch(bind.appmenu_MyracXP);

		repo.pause(3000);

		OUTPUT("^^^-- TAKING A SCREENSHOT --^^^");

		String Filename9 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteBLoggedOutLITE/"
				+ todaysDate + "/" + todaysDate + "-5-Onboarding-MyRAC.jpg";
		repo.CaptureScreenshot(Filename9);

		OUTPUT("--- Checking MyRAC Onboarding Screen");

		if (repo.IsDisplayedById(bind.onboarding_Image)) {
			OUTPUT("PASS - Onboarding Image is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Onboarding Image is NOT Displayed");
		}

		expectedResult = ("MyRAC");

		if (repo.TextBoxCheckById(bind.onboarding_Title, expectedResult)) {
			OUTPUT("PASS - Onboarding Title is Correct");
		} else {
			OUTPUTFAIL("FAIL - Onboarding Title is NOT Correct");
		}

		expectedResult = ("Useful information about your RAC membership. See membership details, view documents and set reminders.");

		if (repo.TextBoxCheckById(bind.onboarding_Message, expectedResult)) {
			OUTPUT("PASS - Onboarding Message is Correct");
		} else {
			OUTPUTFAIL("FAIL - Onboarding Message is NOT Correct");
		}

		if (repo.IsEnabledClickableById(bind.onboarding_Button) == true) {
			OUTPUT("PASS - Onboarding Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Onboarding Button is NOT Enabled & Clickable");
		}

		expectedResult = "GET STARTED";

		if (repo.TextBoxCheckById(bind.onboarding_ButtonText, expectedResult)) {
			OUTPUT("PASS - Onboarding Button Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Onboarding Button Text is NOT Correct");
		}

		repo.TriggerClickById(bind.onboarding_Button);

		repo.pause(3000);

		OUTPUT("--- Checking MyRAC Tab is Displayed ---");

// Commented out the following check and replaced it as toolbar title will not be found in LaunchStateless			

		/*
		 * expectedResult = "MYRAC";
		 * 
		 * if (repo.TextBoxCheckById(bind.toolbar_Title, expectedResult)) {
		 * OUTPUT("PASS - Title bar text is Correct"); } else {
		 * OUTPUTFAIL("FAIL - Title bar text is NOT Correct"); }
		 */

		expectedResult = "Log in to view your RAC Membership details, change your password, view your documents and set reminders.";

		if (repo.TextBoxCheckIgnoreFormatById(bind.intro_Message, expectedResult)) {
			OUTPUT("PASS - MyRAC Page is Displayed");
		} else {
			OUTPUTFAIL("FAIL - MyRAC Page is NOT Displayed");
		}

		OUTPUT("***** COMPLETED - ONBOARDING SCREEN TESTS *****");

	}

	@After
	public void tearDown() {

		driver.quit();
	}
}
