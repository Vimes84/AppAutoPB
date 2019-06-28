package ProdAppStateless;

import java.net.MalformedURLException;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


@SuppressWarnings("unused")
public class RescueMeLocationDisabled {

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
	public void rescueMeLocEnabled() {

		bind = new Repository.ElementRepo();

		OUTPUT("***** EXECUTING LOCATION DISABLED - RESCUE ME PAGE TESTS *****");

		repo.LaunchStatelessDenyLocation();

		repo.pause(3000);

		repo.TabSwitch(bind.appmenu_RescueXP);

		repo.pause(3000);

		repo.Onboarding();

		OUTPUT("*** CHECKING CURRENT LOCATION NOT AVAILABLE POP UP ***");

		expectedResult = "Current location not available";

		if (repo.TextBoxCheckIgnoreFormatById(bind.popUp_Title, expectedResult)) {
			OUTPUT("PASS - Current Location not available Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Current Location not available Text is NOT Correct");
		}

		expectedResult = "Please enable location settings to use this app.";

		if (repo.TextBoxCheckIgnoreFormatById(bind.popUp_Message, expectedResult)) {
			OUTPUT("PASS - Please enable location  Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Please enable location Text is NOT Correct");
		}

		expectedResult = "SETTINGS";

		if (repo.TextBoxCheckIgnoreFormatById(bind.popUp_CentreButton, expectedResult)) {
			OUTPUT("PASS - Settings Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Settings Text is NOT Correct");
		}

		if (repo.IsEnabledClickableById(bind.popUp_CentreButton) == true) {
			OUTPUT("PASS - Settings Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Settings Button is NOT Enabled & Clickable");
		}

		expectedResult = "OK";

		if (repo.TextBoxCheckIgnoreFormatById(bind.popUp_RightButton, expectedResult)) {
			OUTPUT("PASS - OK Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - OK Text is NOT Correct");
		}

		repo.TriggerClickById(bind.popUp_RightButton);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteFNewsAndRescueMe/"
				+ todaysDate + "/" + todaysDate + "-93-RescueMePageNoLoc.jpg";
		repo.CaptureScreenshot(Filename);

		if (repo.IsDisplayedById(bind.rme_LocationContainer)) {
			OUTPUT("PASS - Location Container is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Location Container  Is NOT Displayed");
		}

		if (repo.ElementPresentById(bind.rme_LocationYAH) == 1) {
			OUTPUTFAIL("FAIL - You are here Text is Displayed");
		} else {
			OUTPUT("PASS - You are here Text is not displayed with no Location Services");
		}

		expectedResult = "Whitehall";

		if (repo.TextBoxStartsWithById(bind.rme_LocationText, expectedResult)) {
			OUTPUT("PASS - Location Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Location Text is NOT Correct");
		}

		expectedResult = "51.50";

		if (repo.TextBoxStartsWithById(bind.rme_LocationCoord, expectedResult)) {
			OUTPUT("PASS - Location Coords are Correct");
		} else {
			OUTPUTFAIL("FAIL - Location Coords are NOT Correct");
		}

		if (repo.IsAvailableByXPath(bind.rme_LocationContExpandXP, "enabled") == true) {
			OUTPUT("PASS - Location Details Expand Button is Enabled");
		} else {
			OUTPUTFAIL("FAIL - Location Details Expand is NOT Enabled");
		}

		if (repo.IsDisplayedById(bind.rme_LocationMarker)) {
			OUTPUT("PASS - Location Marker is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Location Marker Is NOT Displayed");
		}

		if (repo.IsEnabledClickableById(bind.rme_LocateMeButton) == true) {
			OUTPUT("PASS - Locate Me Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Locate Me Button is NOT Enabled & Clickable");
		}

		if (repo.IsEnabledClickableById(bind.rme_InformationButton) == true) {
			OUTPUT("PASS - Information Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Information Button is NOT Enabled & Clickable");
		}

		OUTPUT("*** CHECKING LOWER FRONT PAGE ***");

		repo.pause(3000);

		if (repo.IsDisplayedByXPath(bind.rme_GoogleIconXP)) {
			OUTPUT("PASS - Google icon is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Google icon Is NOT Displayed");
		}

		if (repo.IsEnabledClickableById(bind.rme_BigButton) == true) {
			OUTPUT("PASS - Big Chevron Call Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Big Chevron Call Button is NOT Enabled & Clickable");
		}

		expectedResult = "RESCUE ME";

		if (repo.TextBoxCheckIgnoreFormatById(bind.rme_MainTitle, expectedResult)) {
			OUTPUT("PASS - Rescue Me Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Rescue Me Text is NOT Correct");
		}

		expectedResult = "Broken down or had an accident?";

		if (repo.TextBoxStartsWithById(bind.rme_MainText, expectedResult)) {
			OUTPUT("PASS - Main Body Rescue Me Text Start is Correct");
		} else {
			OUTPUTFAIL("FAIL - Main Body Rescue Me Text Start is NOT Correct");
		}

		expectedResult = "Make a note of your location and call us";

		if (repo.TextBoxContainsById(bind.rme_MainText, expectedResult)) {
			OUTPUT("PASS - Main Body Rescue Me Text Middle is Correct");
		} else {
			OUTPUTFAIL("FAIL - Main Body Rescue Me Text Middle is NOT Correct");
		}

		expectedResult = "using the Rescue Me button.";

		if (repo.TextBoxEndsWithById(bind.rme_MainText, expectedResult)) {
			OUTPUT("PASS - Main Body Rescue Me Text End is Correct");
		} else {
			OUTPUTFAIL("FAIL - Main Body Rescue Me Text End is NOT Correct");
		}

		OUTPUT("*** CHECKING EXPANDED LOCATION PAGE ***");

		repo.TriggerClickByXPath(bind.rme_LocationContExpandXP);

		repo.pause(4000);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename3 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteFNewsAndRescueMe/"
				+ todaysDate + "/" + todaysDate + "-94-RescueMePageExpandedNoLoc.jpg";
		repo.CaptureScreenshot(Filename3);

		repo.pause(2000);

		if (repo.IsEnabledClickableById(bind.rme_expBack) == true) {
			OUTPUT("PASS - Back Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Back Button is NOT Enabled & Clickable");
		}

		if (repo.IsDisplayedById(bind.rme_LocateMeButton)) {
			OUTPUT("PASS - Locate Me Button is Still Displayed");
		} else {
			OUTPUTFAIL("FAIL - Locate Me Button Is NOT Displayed");
		}

		if (repo.IsDisplayedById(bind.rme_InformationButton)) {
			OUTPUT("PASS - Information Button is Still Displayed");
		} else {
			OUTPUTFAIL("FAIL - Information Button Is NOT Displayed");
		}

		if (repo.IsDisplayedById(bind.rme_LocationMarker)) {
			OUTPUT("PASS - Location Marker is Still Displayed");
		} else {
			OUTPUTFAIL("FAIL - Location Marker Is NOT Displayed");
		}

		if (repo.IsDisplayedByXPath(bind.rme_GoogleIconXP)) {
			OUTPUT("PASS - Google icon is Still Displayed");
		} else {
			OUTPUTFAIL("FAIL - Google icon Is NOT Displayed");
		}

		if (repo.IsEnabledClickableById(bind.rme_expBigButton) == true) {
			OUTPUT("PASS - Big Chevron Call Button on Expanded View is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Big Chevron Call Button on Expanded View is NOT Enabled & Clickable");
		}

		expectedResult = "Whitehall";

		if (repo.TextBoxStartsWithById(bind.rme_expLocationText, expectedResult)) {
			OUTPUT("PASS - Location Text on Expanded View is Correct");
		} else {
			OUTPUTFAIL("FAIL - Location Text on Expanded View is NOT Correct");
		}

		expectedResult = "51.50";

		if (repo.TextBoxStartsWithById(bind.rme_expLocationCoord, expectedResult)) {
			OUTPUT("PASS - Location Coords on Expanded View are Correct");
		} else {
			OUTPUTFAIL("FAIL - Location Coords on Expanded View are NOT Correct");
		}

		if (repo.IsDisplayedById(bind.rme_expStreetImageBtn)) {
			OUTPUT("PASS - Street View Image is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Street View Image Is NOT Displayed");
		}

		if (repo.IsAvailableById(bind.rme_expCloseButton, "enabled") == true) {
			OUTPUT("PASS - Close Button is Enabled");
		} else {
			OUTPUTFAIL("FAIL - Close Button is NOT Enabled");
		}

		if (repo.IsDisplayedById(bind.rme_expCloseButton)) {
			OUTPUT("PASS - Close Button is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Close Button Is NOT Displayed");
		}

		if (repo.IsEnabledClickableById(bind.rme_expStreetImageBtn) == true) {
			OUTPUT("PASS - Street View Image is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Street View Image is NOT Enabled & Clickable");
		}

		repo.TriggerClickById(bind.rme_expStreetImageBtn);

		repo.pause(4000);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename5 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteFNewsAndRescueMe/"
				+ todaysDate + "/" + todaysDate + "-95-StreetViewImageNoLoc.jpg";
		repo.CaptureScreenshot(Filename5);

		repo.Back();

		repo.pause(3000);

		repo.TriggerClickById(bind.rme_expCloseButton);

		repo.pause(3000);

		repo.TriggerClickByXPath(bind.rme_LocationContExpandXP);

		repo.pause(3000);

		repo.TriggerClickById(bind.rme_expBack);

		// Swipes & Screenshots

		OUTPUT("*** HORIZONTAL SWIPE AND SCREENSHOT ***");

		repo.horizontalSwipeByPercentage(0.1, 0.9, 0.5);

		repo.pause(2000);

		repo.TriggerClickByXPath(bind.rme_LocationContExpandXP);

		repo.pause(2000);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename7 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteFNewsAndRescueMe/"
				+ todaysDate + "/" + todaysDate + "-96-AfterHorizontalSwipeNoLoc.jpg";
		repo.CaptureScreenshot(Filename7);

		repo.TriggerClickById(bind.rme_expBack);

		repo.pause(2000);

		OUTPUT("*** VERTICAL SWIPE AND SCREENSHOT ***");

		repo.verticalSwipeByPercentage(0.1, 0.9, 0.5);

		repo.pause(2000);

		repo.TriggerClickByXPath(bind.rme_LocationContExpandXP);

		repo.pause(2000);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename9 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteFNewsAndRescueMe/"
				+ todaysDate + "/" + todaysDate + "-97-AfterVerticalSwipeNoLoc.jpg";
		repo.CaptureScreenshot(Filename9);

		repo.TriggerClickById(bind.rme_expBack);

		repo.pause(2000);

		repo.TriggerClickById(bind.rme_LocateMeButton);

		repo.ElementWaitThenClickById(bind.popUp_RightButton);

		OUTPUT("*** Checking Call Button  ***");

		repo.TriggerClickById(bind.rme_BigButton);

		repo.pause(2000);

		expectedResult = "Call Number?";

		if (repo.TextBoxCheckIgnoreFormatById(bind.popUp_Title, expectedResult)) {
			OUTPUT("PASS - Call Number Title is Correct");
		} else {
			OUTPUTFAIL("FAIL - Call Number Title is NOT Correct");
		}

		expectedResult = "03301591289";

		if (repo.TextBoxCheckIgnoreFormatById(bind.popUp_Message, expectedResult)) {
			OUTPUT("PASS - Call Number is Correct");
		} else {
			OUTPUTFAIL("FAIL - Call Number is NOT Correct");
		}

		repo.TriggerClickById(bind.popUp_CentreButton);

		repo.pause(2000);

		repo.TriggerClickById(bind.rme_BigButton);

		repo.pause(2000);

		repo.TriggerClickById(bind.popUp_RightButton);

		repo.pause(2000);

		expectedResult = "Complete action using";

		if (repo.TextBoxCheckIgnoreFormatById(bind.share_Title, expectedResult)) {
			OUTPUT("PASS - User prompted to make a call using available options");
		} else {
			OUTPUTFAIL("FAIL - User is NOT prompted to make a call using available options");
		}

		repo.Back();

		OUTPUT("*** Checking Expanded Call Button  ***");

		repo.pause(2000);

		repo.TriggerClickByXPath(bind.rme_LocationContExpandXP);

		repo.pause(3000);

		repo.TriggerClickById(bind.rme_expBigButton);

		repo.pause(2000);

		repo.TriggerClickById(bind.popUp_RightButton);

		repo.pause(2000);

		expectedResult = "Complete action using";

		if (repo.TextBoxCheckIgnoreFormatById(bind.share_Title, expectedResult)) {
			OUTPUT("PASS - User prompted to make a call using available options");
		} else {
			OUTPUTFAIL("FAIL - User is NOT prompted to make a call using available options");
		}

		repo.Back();

		repo.pause(2000);

		repo.TriggerClickById(bind.rme_expBack);

		repo.pause(3000);

		OUTPUT("*** Checking Information Button  ***");

		repo.TriggerClickById(bind.rme_InformationButton);

		repo.pause(2000);

		expectedResult = "IMPORTANT INFORMATION";

		if (repo.TextBoxCheckIgnoreFormatById(bind.rme_InfoTitle, expectedResult)) {
			OUTPUT("PASS - Important Information Title is correct");
		} else {
			OUTPUTFAIL("FAIL - Important Information Title is NOT correct");
		}

		repo.TriggerClickById(bind.rme_InfoClose);

		repo.pause(2000);

		OUTPUT("***** COMPLETED LOCATION DISABLED - RESCUE ME PAGE TESTS *****");

	}
}