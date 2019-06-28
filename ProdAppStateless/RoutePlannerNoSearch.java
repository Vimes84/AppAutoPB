package ProdAppStateless;

import java.net.MalformedURLException;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


@SuppressWarnings("unused")
public class RoutePlannerNoSearch {

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

		OUTPUT("************************************************* EXECUTING TEST SUITE G - ROUTE & TRAFFIC ************************************************");

		OUTPUT("*******************************************************************************************************************************************");

		OUTPUT("***** EXECUTING - ROUTE & TRAFFIC - PRE SEARCH TESTS *****");

// Launching via Google Play Store

		repo.LaunchStatelessAllowAll();

		// Checking Route & Traffic Pre-Search

		OUTPUT("--- CHECKING ROUTE PLANNER MAIN PAGE ---");

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteGRoute&Traffic/"
				+ todaysDate + "/" + todaysDate + "-1-RTMainPage.jpg";
		repo.CaptureScreenshot(Filename);

		repo.pause(2000);

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

		// Search Screen - Pre Search

		OUTPUT("--- CHECKING ROUTE & TRAFFIC SEARCH - PRE SEARCH ---");

		repo.pause(2000);

		repo.TriggerClickById(bind.rp_SearchContainer);

		repo.pause(2000);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename3 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteGRoute&Traffic/"
				+ todaysDate + "/" + todaysDate + "-2-SearchBlank.jpg";
		repo.CaptureScreenshot(Filename3);

		if (repo.IsAvailableById(bind.srch_ContainerMap, "clickable") == true) {
			OUTPUT("PASS - Search Container is Clickable");
		} else {
			OUTPUTFAIL("FAIL - Search Container Button is Clickable");
		}

		if (repo.IsEnabledClickableById(bind.srch_BackButton) == true) {
			OUTPUT("PASS - Back Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Back Button is NOT Enabled & Clickable");
		}

		if (repo.IsDisplayedById(bind.srch_BackButtonIcon)) {
			OUTPUT("PASS - Back Button Image Icon Is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Back Button Image Compass Icon Is NOT Displayed");
		}

		if (repo.IsEnabledClickableById(bind.srch_ContactsContainer) == true) {
			OUTPUT("PASS - Contacts Container is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Contacts Container is NOT Enabled & Clickable");
		}

		expectedResult = "Would you like to search through your contacts?";

		if (repo.TextBoxCheckIgnoreFormatById(bind.srch_ContactsBoldText, expectedResult)) {
			OUTPUT("PASS - Bold Contacts Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Bold Contacts Text is Correct");
		}

		expectedResult = "We need to get your permission, tap here to continue";

		if (repo.TextBoxCheckIgnoreFormatById(bind.srch_ContactsLightText, expectedResult)) {
			OUTPUT("PASS - Light Contacts Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Light Contacts Text is Correct");
		}

		if (repo.IsDisplayedByXPath(bind.srch_ContactsTickImageXP)) {
			OUTPUT("PASS - Contacts Tick Image Icon Is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Contacts Tick Image Compass Icon Is NOT Displayed");
		}

		// Traffic Events

		OUTPUT("--- CHECKING TRAFFIC EVENTS ---");

		repo.TriggerClickById(bind.srch_BackButton);

		repo.pause(2000);

		repo.TriggerClickById(bind.rp_Events);

		repo.pause(2000);

		if (repo.IsEnabledClickableById(bind.tene_Back) == true) {
			OUTPUT("PASS - Back Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Back Button is NOT Enabled & Clickable");
		}

		expectedResult = "TRAFFIC EVENTS NEAR ME";

		if (repo.TextBoxCheckIgnoreFormatById(bind.tene_Title, expectedResult)) {
			OUTPUT("PASS - Title Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Title Text is Correct");
		}

		try {

			expectedResult = "When";

			if (repo.TextBoxCheckIgnoreFormatById(bind.tene_When, expectedResult)) {
				OUTPUT("PASS - When Text is Correct");
			} else {
				OUTPUTFAIL("FAIL - When Text is Correct");
			}

			if (repo.IsEnabledClickableById(bind.tene_EventsfromContainer) == true) {
				OUTPUT("PASS - Events from Container is Enabled & Clickable");
			} else {
				OUTPUTFAIL("FAIL - Events Container from is NOT Enabled & Clickable");
			}

			expectedResult = "Events from today";

			if (repo.TextBoxCheckIgnoreFormatById(bind.tene_EventsFromText, expectedResult)) {
				OUTPUT("PASS - Events from Text is Correct");
			} else {
				OUTPUTFAIL("FAIL - Events from Text is Correct");
			}

			repo.pause(6000);

			if (repo.IsEnabledClickableByXPath(bind.tene_FirstEventContainerXP) == true) {
				OUTPUT("PASS - First Event Container is Enabled & Clickable");
			} else {
				OUTPUTFAIL("FAIL - First Event Container  is NOT Enabled & Clickable");
			}

			if (repo.IsDisplayedByXPath(bind.tene_FirstEventIconXP)) {
				OUTPUT("PASS - First Event Icon Is Displayed");
			} else {
				OUTPUTFAIL("FAIL - First Event Icon Is NOT Displayed");
			}

			if (repo.IsDisplayedByXPath(bind.tene_FirstEventDescriptionXP)) {
				OUTPUT("PASS - First Event Description Is Displayed");
			} else {
				OUTPUTFAIL("FAIL - First Event Description Is NOT Displayed");
			}

			if (repo.IsDisplayedByXPath(bind.tene_FirstEventDistanceXP)) {
				OUTPUT("PASS - First Event Distance Is Displayed");
			} else {
				OUTPUTFAIL("FAIL - First Event Distance Is NOT Displayed");
			}

		} catch (NoSuchElementException ignored) {
			OUTPUTFAIL("FAIL - No Connection to our servers error message is displayed ~~~");
		}

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename5 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteGRoute&Traffic/"
				+ todaysDate + "/" + todaysDate + "-3-TrafficEvents.jpg";
		repo.CaptureScreenshot(Filename5);

		repo.TriggerClickById(bind.tene_Back);

		repo.pause(2000);

		// Route & Traffic Settings

		OUTPUT("--- CHECKING ROUTE & TRAFFIC SETTINGS ---");

		repo.TriggerClickById(bind.rp_SettingsButton);

		repo.pause(2000);

		/*
		 * repo.TriggerClickById(bind.stngs_Close);
		 * 
		 * repo.pause(2000);
		 * 
		 * repo.TriggerClickById(bind.rp_SettingsButton);
		 * 
		 * repo.pause(2000);
		 * 
		 * repo.TriggerClickById(bind.stngs_Drag);
		 * 
		 * repo.pause(2000);
		 * 
		 * repo.TriggerClickById(bind.rp_SettingsButton);
		 */

		repo.pause(2000);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename6 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteGRoute&Traffic/"
				+ todaysDate + "/" + todaysDate + "-4-SettingsUnmodified.jpg";
		repo.CaptureScreenshot(Filename6);

		if (repo.IsDisplayedByXPath(bind.stngs_CloseButtonImageXP)) {
			OUTPUT("PASS - Close Button Icon Is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Close Button Icon Is NOT Displayed");
		}

		// Checking Tabs

		OUTPUT("--- CHECKING TABS ---");

		if (repo.IsEnabledClickableByXPath(bind.stngs_MapTabXP) == true) {
			OUTPUT("PASS - Map Tab is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Map Tab is NOT Enabled & Clickable");
		}

		expectedResult = "MAP";

		if (repo.TextBoxCheckIgnoreFormatByXPath(bind.stngs_MapTabTextXP, expectedResult)) {
			OUTPUT("PASS - Map Tab Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Map Tab Text is Correct");
		}

		if (repo.IsEnabledClickableByXPath(bind.stngs_RouteTabXP) == true) {
			OUTPUT("PASS - Route Tab is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Route Tab is NOT Enabled & Clickable");
		}

		expectedResult = "ROUTE";

		if (repo.TextBoxCheckIgnoreFormatByXPath(bind.stngs_RouteTabTextXP, expectedResult)) {
			OUTPUT("PASS - Route Tab Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Route Tab Text is Correct");
		}

		// Checking Radio buttons

		OUTPUT("--- CHECKING RADIO BUTTONS ---");

		if (repo.IsEnabledClickableById(bind.stngs_TypeMap_Map) == true) {
			OUTPUT("PASS - Map Radio Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Map Radio Button is NOT Enabled & Clickable");
		}

		if (repo.IsAvailableById(bind.stngs_TypeMap_Map, "checked") == true) {
			OUTPUT("PASS - Map Radio Button is Checked");
		} else {
			OUTPUTFAIL("FAIL - Map Radio Button is NOT Checked");
		}

		expectedResult = "Map";

		if (repo.TextBoxCheckIgnoreFormatById(bind.stngs_TypeMap_Map, expectedResult)) {
			OUTPUT("PASS - Map Tab Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Map Tab Text is Correct");
		}

		if (repo.IsEnabledClickableById(bind.stngs_TypeMap_Hybrid) == true) {
			OUTPUT("PASS - Hybrid Radio Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Hybrid Radio Button is NOT Enabled & Clickable");
		}

		if (repo.IsAvailableById(bind.stngs_TypeMap_Hybrid, "checked") == false) {
			OUTPUT("PASS - Hybrid Radio Button is Unchecked");
		} else {
			OUTPUTFAIL("FAIL - Hybrid Radio Button is Checked");
		}

		expectedResult = "Hybrid";

		if (repo.TextBoxCheckIgnoreFormatById(bind.stngs_TypeMap_Hybrid, expectedResult)) {
			OUTPUT("PASS - Hybrid Tab Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Hybrid Tab Text is Correct");
		}

		if (repo.IsEnabledClickableById(bind.stngs_TypeMap_Sat) == true) {
			OUTPUT("PASS - Satellite Radio Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Satellite Radio Button is NOT Enabled & Clickable");
		}

		if (repo.IsAvailableById(bind.stngs_TypeMap_Sat, "checked") == false) {
			OUTPUT("PASS - Satellite Radio Button is Unchecked");
		} else {
			OUTPUTFAIL("FAIL - Satellite Radio Button is Checked");
		}

		expectedResult = "Satellite";

		if (repo.TextBoxCheckIgnoreFormatById(bind.stngs_TypeMap_Sat, expectedResult)) {
			OUTPUT("PASS - Satellite Tab Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Satellite Tab Text is Correct");
		}

		// Checking MAP Tab - Toggles

		OUTPUT("--- CHECKING TOGGLES ---");

		if (repo.IsEnabledClickableById(bind.stngs_OverlayToggle_TrafficFlow) == true) {
			OUTPUT("PASS - Traffic flow Radio Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Traffic flow Radio Button is NOT Enabled & Clickable");
		}

		if (repo.IsAvailableById(bind.stngs_OverlayToggle_TrafficFlow, "checked") == false) {
			OUTPUT("PASS - Traffic flow Radio Button is Unchecked");
		} else {
			OUTPUTFAIL("FAIL - Traffic flow Radio Button is Checked");
		}

		expectedResult = "Traffic flow";

		if (repo.TextBoxCheckIgnoreFormatByXPath(bind.stngs_OverlayText_TrafficFlowXP, expectedResult)) {
			OUTPUT("PASS - Traffic flow Tab Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Traffic flow Tab Text is Correct");
		}

		if (repo.IsEnabledClickableById(bind.stngs_OverlayToggle_TrafficIncident) == true) {
			OUTPUT("PASS - Traffic incidents Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Traffic incidents Radio Button is NOT Enabled & Clickable");
		}

		if (repo.IsAvailableById(bind.stngs_OverlayToggle_TrafficIncident, "checked") == false) {
			OUTPUT("PASS - Traffic incidents Radio Button is Unchecked");
		} else {
			OUTPUTFAIL("FAIL - Traffic incidents Radio Button is Checked");
		}

		expectedResult = "Traffic incidents";

		if (repo.TextBoxCheckIgnoreFormatByXPath(bind.stngs_OverlayText_TrafficIncidentsXP, expectedResult)) {
			OUTPUT("PASS - Traffic incidents Toggle Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Traffic incidents Toggle Text is Correct");
		}

		if (repo.IsEnabledClickableById(bind.stngs_OverlayToggle_Roadworks) == true) {
			OUTPUT("PASS - Roadworks incidents Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Roadworks Radio Button is NOT Enabled & Clickable");
		}

		if (repo.IsAvailableById(bind.stngs_OverlayToggle_Roadworks, "checked") == false) {
			OUTPUT("PASS - Roadworks Radio Button is Unchecked");
		} else {
			OUTPUTFAIL("FAIL - Roadworks Radio Button is Checked");
		}

		expectedResult = "Roadworks";

		if (repo.TextBoxCheckIgnoreFormatByXPath(bind.stngs_OverlayText_RoadworksXP, expectedResult)) {
			OUTPUT("PASS - Roadworks Toggle Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Roadworks Toggle Text is Correct");
		}

		// Checking ROUTE Tab - Toggles

		repo.TriggerClickByXPath(bind.stngs_RouteTabXP);

		if (repo.IsEnabledClickableById(bind.stngs_RouteToggle_Motorways) == true) {
			OUTPUT("PASS - Avoid motorways Radio Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Avoid motorways Radio Button is NOT Enabled & Clickable");
		}

		if (repo.IsAvailableById(bind.stngs_RouteToggle_Motorways, "checked") == false) {
			OUTPUT("PASS - Avoid motorways Radio Button is Unchecked");
		} else {
			OUTPUTFAIL("FAIL - Avoid motorways Radio Button is Checked");
		}

		expectedResult = "Avoid motorways";

		if (repo.TextBoxCheckIgnoreFormatByXPath(bind.stngs_RouteText_MotorwaysXP, expectedResult)) {
			OUTPUT("PASS - Avoid motorways Toggle Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Avoid motorways Toggle Text is Correct");
		}

		if (repo.IsEnabledClickableById(bind.stngs_RouteToggle_Tolls) == true) {
			OUTPUT("PASS - Avoid tolls Radio Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Avoid tolls Radio Button is NOT Enabled & Clickable");
		}

		if (repo.IsAvailableById(bind.stngs_RouteToggle_Tolls, "checked") == false) {
			OUTPUT("PASS - Avoid tolls Radio Button is Unchecked");
		} else {
			OUTPUTFAIL("FAIL - Avoid tolls Radio Button is Checked");
		}

		expectedResult = "Avoid tolls";

		if (repo.TextBoxCheckIgnoreFormatByXPath(bind.stngs_RouteText_TollsXP, expectedResult)) {
			OUTPUT("PASS - Avoid tolls Toggle Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Avoid tolls Toggle Text is Correct");
		}

		if (repo.IsEnabledClickableById(bind.stngs_RouteToggle_Ferries) == true) {
			OUTPUT("PASS - Avoid ferries Radio Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - ferries motorways Radio Button is NOT Enabled & Clickable");
		}

		if (repo.IsAvailableById(bind.stngs_RouteToggle_Ferries, "checked") == false) {
			OUTPUT("PASS - Avoid ferries Radio Button is Unchecked");
		} else {
			OUTPUTFAIL("FAIL - Avoid ferries Radio Button is Checked");
		}

		expectedResult = "Avoid ferries";

		if (repo.TextBoxCheckIgnoreFormatByXPath(bind.stngs_RouteText_FerriesXP, expectedResult)) {
			OUTPUT("PASS - Avoid ferries Toggle Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Avoid ferries Toggle Text is Correct");
		}

		repo.pause(2000);

		repo.TriggerClickById(bind.stngs_Close);

		// Dashboard - Button Checks

		OUTPUT("--- Performing Dashboard Button Checks ---");

		repo.ElementWaitThenClickById(bind.rp_DashboardButton);

		repo.ElementWaitById(bind.dash_ShowTrafficContainer);

		// Show Traffic & Incidents Button

		OUTPUT("--- Checking Show Traffic & Incidents Button ---");

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename7 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteGRoute&Traffic/"
				+ todaysDate + "/" + todaysDate + "-5-DashboardSelectorScreen.jpg";
		repo.CaptureScreenshot(Filename7);

		if (repo.IsEnabledClickableById(bind.dash_ShowTrafficContainer) == true) {
			OUTPUT("PASS - Show Traffic & Incidents Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Show Traffic & Incidents Button is NOT Enabled & Clickable");
		}

		if (repo.IsDisplayedById(bind.dash_ShowTrafficIcon)) {
			OUTPUT("PASS - Show Traffic & Incidents Icon Is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Show Traffic & Incidents Icon Is NOT Displayed");
		}

		expectedResult = "Show Traffic & Incidents";

		if (repo.TextBoxCheckIgnoreFormatById(bind.dash_ShowTrafficText, expectedResult)) {
			OUTPUT("PASS - Show Traffic & Incidents Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Show Traffic & Incidents Text is Correct");
		}

		// Expenses Calculator Button

		OUTPUT("--- Expenses Calculator Button ---");

		if (repo.IsEnabledClickableById(bind.dash_ExpensesContainer) == true) {
			OUTPUT("PASS - Expenses Calculator Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Expenses Calculator Button is NOT Enabled & Clickable");
		}

		if (repo.IsDisplayedByXPath(bind.dash_ExpensesIconXP)) {
			OUTPUT("PASS - Expenses Calculator Icon Is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Expenses Calculator Icon Is NOT Displayed");
		}

		expectedResult = "Expenses Calculator";

		if (repo.TextBoxCheckIgnoreFormatById(bind.dash_ExpensesText, expectedResult)) {
			OUTPUT("PASS - Expenses Calculator Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Expenses Calculator Text is Correct");
		}

		// Future Travel Button

		OUTPUT("--- Future Travel Button ---");

		if (repo.IsEnabledClickableById(bind.dash_FutureTravelContainer) == true) {
			OUTPUT("PASS - Future Travel Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Future Travel Button is NOT Enabled & Clickable");
		}

		if (repo.IsDisplayedByXPath(bind.dash_FutureTravelIconXP)) {
			OUTPUT("PASS - Future Travel Icon Is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Future Travel Icon Is NOT Displayed");
		}

		expectedResult = "Future Travel";

		if (repo.TextBoxCheckIgnoreFormatById(bind.dash_FutureTravelText, expectedResult)) {
			OUTPUT("PASS - Future Travel Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Future Travel Text is Correct");
		}

		repo.TriggerClickById(bind.dash_CloseButton);

		OUTPUT("***** COMPLETED - ROUTE & TRAFFIC - PRE SEARCH TESTS *****");

	}

}