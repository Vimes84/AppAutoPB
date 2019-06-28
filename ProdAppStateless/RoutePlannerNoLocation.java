package ProdAppStateless;

import java.net.MalformedURLException;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


@SuppressWarnings("unused")
public class RoutePlannerNoLocation {

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

		OUTPUT("***** EXECUTING - ROUTE & TRAFFIC - NO LOCATION TESTS *****");

// Launching via Google Play Store

		repo.LaunchStatelessDenyLocation();

		// Checking Route & Traffic Pre-Search

		OUTPUT("--- CHECKING ROUTE PLANNER MAIN PAGE ---");

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteGRoute&Traffic/"
				+ todaysDate + "/" + todaysDate + "-998-RTMainPageNoLoc.jpg";
		repo.CaptureScreenshot(Filename);

		OUTPUT("*** CHECKING CURRENT LOCATION NOT AVAILABLE POP UP ***");

		repo.TriggerClickById(bind.rp_LocationButton);

		repo.ElementWaitById(bind.popUp_Title);

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

		repo.pause(2000);

		OUTPUT("*** CHECKING MAIN MAP SCREEN ***");

		if (repo.IsEnabledClickableById(bind.rp_SearchContainer) == true) {
			OUTPUT("PASS - Search Box is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Search Box is NOT Enabled & Clickable");
		}

		if (repo.IsDisplayedById(bind.rp_SearchIcon)) {
			OUTPUT("PASS - Magnifying Glass Icon Is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Magnifying Glass Icon Is NOT Displayed");
		}

		expectedResult = "Search for a location";

		if (repo.TextBoxCheckById(bind.rp_SearchText, expectedResult)) {
			OUTPUT("PASS - Search Text is Correct");
		} else {
			OUTPUT("PASS - Search Text is Correct");
		}

		if (repo.IsEnabledClickableById(bind.rp_Events) == true) {
			OUTPUT("PASS - Events Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Events Button is NOT Enabled & Clickable");
		}

		if (repo.IsEnabledClickableById(bind.rp_LocationButton) == true) {
			OUTPUT("PASS - Location Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Location Button is NOT Enabled & Clickable");
		}

		if (repo.IsDisplayedById(bind.rp_LocationButtonImage)) {
			OUTPUT("PASS - Location Button Compass Icon Is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Location Button Compass Icon Is NOT Displayed");
		}

		if (repo.IsEnabledClickableById(bind.rp_SettingsButton) == true) {
			OUTPUT("PASS - Settings Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Settings Button is NOT Enabled & Clickable");
		}

		if (repo.IsDisplayedByXPath(bind.rp_SettingsButtonImageXP)) {
			OUTPUT("PASS - Settings Button Cog Icon Is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Settings Button Cog Compass Icon Is NOT Displayed");
		}

		if (repo.IsEnabledClickableById(bind.rp_PlanRouteButton) == true) {
			OUTPUT("PASS - Plan Route Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Plan Route Button is NOT Enabled & Clickable");
		}

		if (repo.IsDisplayedByXPath(bind.rp_PlanRouteButtonImageXP)) {
			OUTPUT("PASS - Plan Route Button Image Icon Is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Plan Route Button Image Compass Icon Is NOT Displayed");
		}

		if (repo.IsDisplayedById(bind.rp_PlanRouteTextImage)) {
			OUTPUT("PASS - Plan Route Button Image Icon Is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Plan Route Button Image Compass Icon Is NOT Displayed");
		}

		if (repo.IsEnabledClickableById(bind.rp_DashboardButton) == true) {
			OUTPUT("PASS - Dashboard Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Dashboard Button is NOT Enabled & Clickable");
		}

		if (repo.IsDisplayedById(bind.rp_DashboardButtonImage)) {
			OUTPUT("PASS - Dashboard Button Image Icon Is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Dashboard Button Image Compass Icon Is NOT Displayed");
		}

		if (repo.IsDisplayedByXPath(bind.rme_GoogleIconXP)) {
			OUTPUT("PASS - Google Icon Is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Google Image Compass Icon Is NOT Displayed");
		}

		OUTPUT("*** CHECKING PLAN ROUTE OPTIONS ***");

		repo.TriggerClickById(bind.rp_PlanRouteButton);

		repo.ElementWaitByXPath(bind.pr_LocationTextXP);

		expectedResult = "Choose your start place";

		if (repo.TextBoxCheckIgnoreFormatByXPath(bind.pr_LocationTextXP, expectedResult)) {
			OUTPUT("PASS - Choose your start place Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Choose your start place Text is NOT Correct");
		}

		repo.Back();

		OUTPUT("*** CHECKING TRAFFIC EVENTS NEAR ME ***");

		repo.TriggerClickById(bind.rp_Events);

		repo.ElementWaitById(bind.popUp_Title);

		expectedResult = "Current location not available";

		if (repo.TextBoxCheckIgnoreFormatById(bind.popUp_Title, expectedResult)) {
			OUTPUT("PASS - Current Location not available Text is Displayed and Correct");
		} else {
			OUTPUTFAIL("FAIL - Current Location not available Text is NOT Displayed or Correct");
		}

		repo.TriggerClickById(bind.popUp_RightButton);

		repo.pause(2000);

		/*
		 * try {
		 * 
		 * if (repo.IsDisplayedByXPathNoCheck(bind.tene_FirstEventContainerXP) == true)
		 * { OUTPUTFAIL("FAIL - Traffic Events are Displayed"); } } catch
		 * (NoSuchElementException ignored) {
		 * OUTPUT("PASS - Traffic Events are NOT Displayed when there is no Location Services"
		 * ); }
		 */
		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename2 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteGRoute&Traffic/"
				+ todaysDate + "/" + todaysDate + "-999-RTrafficEventsNoLoc.jpg";
		repo.CaptureScreenshot(Filename2);

		repo.Back();

		OUTPUT("***** COMPLETED - ROUTE & TRAFFIC - NO LOCATION TESTS *****");

	}

}