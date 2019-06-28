package ProdAppStateless;

import java.net.MalformedURLException;

import java.time.LocalDate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


@SuppressWarnings("unused")
public class RoutePlannerRoutePlanning {

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
	public void RoutePlannerRouteTests() {

		bind = new Repository.ElementRepo();

		OUTPUT("***** EXECUTING - ROUTE & TRAFFIC - ROUTE PLANNING *****");

		repo.LaunchStatelessAllowAll();

		// Allowing Search through contacts

		repo.TriggerClickById(bind.srch_ContainerMap);

		repo.TriggerClickById(bind.srch_ContactsContainer);

		repo.TriggerClickById(bind.androidAllow);

		repo.pause(3000);

		// Adding Locations to the Recent Location List

		OUTPUT("--- Adding London to Recent List ---");

		keyedInput = "London";

		repo.SendKeysById(bind.srch_ContainerList, keyedInput);

		repo.TriggerClickByXPath(bind.srch_FirstContainerXP);

		repo.TriggerClickById(bind.srched_ClearTextMap);

		OUTPUT("--- Adding Plymouth to Recent List ---");

		keyedInput = "Plymouth";

		repo.SendKeysById(bind.srch_ContainerList, keyedInput);

		repo.TriggerClickByXPath(bind.srch_FirstContainerXP);

		repo.TriggerClickById(bind.srched_ClearTextMap);

		OUTPUT("--- Adding Edinburgh to Recent List ---");

		keyedInput = "Edinburgh";

		repo.SendKeysById(bind.srch_ContainerList, keyedInput);

		repo.TriggerClickByXPath(bind.srch_FirstContainerXP);

		repo.TriggerClickById(bind.srched_ClearTextMap);

		// Route & Traffic Dashboard - Location Search Section

		repo.TriggerClickById(bind.rp_PlanRouteButton);

		if (repo.IsEnabledClickableById(bind.pr_CloseButton)) {
			OUTPUT("PASS - Close button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Close button is Enabled & Clickable");
		}

		if (repo.IsDisplayedByXPath(bind.pr_CloseIconXP)) {
			OUTPUT("PASS - Close button icon is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Close button icon is NOT Displayed");
		}

		if (repo.IsEnabledClickableById(bind.pr_HamburgerButton)) {
			OUTPUT("PASS - Hamburger button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Hamburger button is Enabled & Clickable");
		}

		if (repo.IsDisplayedByXPath(bind.pr_HamburgerIconXP)) {
			OUTPUT("PASS - Hamburger button icon is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Hamburger button icon is NOT Displayed");
		}

		expectedResult = "Current Location";

		if (repo.TextBoxCheckByxPath(bind.pr_LocationTextXP, expectedResult)) {
			OUTPUT("PASS - Current Location Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Current Location Text is NOT Correct");
		}

		expectedResult = "Choose your destination";

		if (repo.TextBoxCheckByxPath(bind.pr_DestinationTextXP, expectedResult)) {
			OUTPUT("PASS - Destination Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Destination Text is NOT Correct");
		}

		repo.TriggerClickByXPath(bind.pr_LocationTextXP);

		OUTPUT("--- Checking Use Current Location Option ---");

		repo.ElementWaitById(bind.pr_UseCurrentContainer);

		if (repo.IsEnabledClickableById(bind.pr_UseCurrentContainer)) {
			OUTPUT("PASS - Use Current Location is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Use Current Location is Enabled & Clickable");
		}

		if (repo.IsDisplayedById(bind.pr_UseCurrentIcon)) {
			OUTPUT("PASS - Use Current Location icon is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Use Current Location icon is NOT Displayed");
		}

		expectedResult = "USE MY CURRENT LOCATION";

		if (repo.TextBoxCheckIgnoreFormatByXPath(bind.pr_UseCurrentTextXP, expectedResult)) {
			OUTPUT("PASS - Use Current Location Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Use Current Location Text is NOT Correct");
		}

		repo.TriggerClickById(bind.pr_UseCurrentContainer);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteGRoute&Traffic/"
				+ todaysDate + "/" + todaysDate + "-95-PostUseCurrentLoc.jpg";
		repo.CaptureScreenshot(Filename);

		repo.Back();

		repo.TriggerClickById(bind.rp_PlanRouteButton);

		OUTPUT("--- Checking Hamburger options and adding via Stop ---");

		repo.TriggerClickById(bind.pr_HamburgerButton);

		repo.ElementWaitById(bind.pr_HamburgerSwitchContainer);

		if (repo.IsEnabledClickableById(bind.pr_HamburgerSwitchContainer)) {
			OUTPUT("PASS - Switch Directions is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Switch Directions is Enabled & Clickable");
		}

		if (repo.IsDisplayedById(bind.pr_HamburgerSwitchIcon)) {
			OUTPUT("PASS - Switch Directions icon is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Switch Directions icon is NOT Displayed");
		}

		expectedResult = "Switch directions";

		if (repo.TextBoxCheckByxPath(bind.pr_HamburgerSwitchTextXP, expectedResult)) {
			OUTPUT("PASS - Add via stop Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Add via stop Text is NOT Correct");
		}

		if (repo.IsEnabledClickableById(bind.pr_HamburgerViaContainer)) {
			OUTPUT("PASS - Add via stop is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Add via stop is Enabled & Clickable");
		}

		if (repo.IsDisplayedById(bind.pr_HamburgerViaIcon)) {
			OUTPUT("PASS - Add via stop icon is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Add via stop icon is NOT Displayed");
		}

		expectedResult = "Add via Stop";

		if (repo.TextBoxCheckByxPath(bind.pr_HamburgerViaTextXP, expectedResult)) {
			OUTPUT("PASS - Add via stop Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Add via stop Text is NOT Correct");
		}

		repo.TriggerClickById(bind.pr_HamburgerViaContainer);

		OUTPUT("--- Checking Added Via Stop ---");

		/*
		 * if (repo.IsEnabledClickableById(bind.pr_ViaStopRemove)) {
		 * OUTPUT("PASS - Remove Via Stop is Enabled & Clickable"); } else {
		 * OUTPUTFAIL("FAIL - Remove Via Stop is Enabled & Clickable"); }
		 */
		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename2 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteGRoute&Traffic/"
				+ todaysDate + "/" + todaysDate + "-96-ViaStop.jpg";
		repo.CaptureScreenshot(Filename2);

		OUTPUT("--- Switching Directions and Checking ---");

		repo.Back();

		repo.TriggerClickById(bind.rp_PlanRouteButton);

		repo.TriggerClickById(bind.pr_HamburgerButton);

		repo.TriggerClickById(bind.pr_HamburgerSwitchContainer);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename3 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteGRoute&Traffic/"
				+ todaysDate + "/" + todaysDate + "-97-SwitchDirection.jpg";
		repo.CaptureScreenshot(Filename3);

		repo.Back();

		repo.TriggerClickById(bind.rp_PlanRouteButton);

		repo.TriggerClickByXPath(bind.pr_DestinationTextXP);

		repo.TriggerClickByXPath(bind.pr_RecentFirstLocContXP);

		repo.ElementWaitById(bind.rp_SettingsButton);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename1 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteGRoute&Traffic/"
				+ todaysDate + "/" + todaysDate + "-98-PlannedRoute.jpg";
		repo.CaptureScreenshot(Filename1);

		OUTPUT("--- Checking Planned Route - Map Options ---");

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

		if (repo.IsDisplayedByXPath(bind.rme_GoogleIconXP)) {
			OUTPUT("PASS - Google Icon Is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Google Image Compass Icon Is NOT Displayed");
		}

		if (repo.ElementPresentById(bind.rp_DashboardButtonImage) == 0) {
			OUTPUT("PASS - Dashboard Button is NOT Displayed");
		} else {
			OUTPUTFAIL("FAIL - Dashboard Button is Displayed");
		}

		OUTPUT("--- Checking Planned Route - Dashboard ---");

		repo.TriggerClickById(bind.pr_Dash_Expand);

		repo.ElementWaitById(bind.pr_Dash_DepartingContainer);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename31 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteGRoute&Traffic/"
				+ todaysDate + "/" + todaysDate + "-99-PlannedRouteDash.jpg";
		repo.CaptureScreenshot(Filename31);

		if (repo.IsEnabledClickableById(bind.pr_Dash_Close) == true) {
			OUTPUT("PASS - Close Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Close Button is NOT Enabled & Clickable");
		}

		if (repo.IsDisplayedByXPath(bind.pr_Dash_CloseImageXP) == true) {
			OUTPUT("PASS - Close Button Image is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Close Button Image is NOT Enabled & Clickable");
		}

		if (repo.ElementPresentById(bind.pr_Dash_RouteDuration) == 1) {
			OUTPUT("PASS - Trip duration is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Trip duration is not Displayed");
		}

		if (repo.ElementPresentById(bind.pr_Dash_RouteDistance) == 1) {
			OUTPUT("PASS - Trip distance is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Trip distance is not Displayed");
		}

		if (repo.ElementPresentById(bind.pr_Dash_RouteCost) == 1) {
			OUTPUT("PASS - Trip cost is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Trip cost is not Displayed");
		}

		if (repo.IsEnabledClickableById(bind.pr_Dash_NavigateButton) == true) {
			OUTPUT("PASS - Navigate Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Navigate Button is NOT Enabled & Clickable");
		}

		if (repo.IsDisplayedByXPath(bind.pr_Dash_NavigateButtonXP) == true) {
			OUTPUT("PASS - Navigate Button Image is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Navigate Button Image is NOT Enabled & Clickable");
		}

		expectedResult = "Navigate";

		if (repo.TextBoxCheckByxPath(bind.pr_Dash_NavigateTextXP, expectedResult)) {
			OUTPUT("PASS - Navigate Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Navigate Text is NOT Correct");
		}

		if (repo.IsEnabledClickableById(bind.pr_Dash_FavouriteContainer) == true) {
			OUTPUT("PASS - Favourite Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Favourite Button is NOT Enabled & Clickable");
		}

		if (repo.IsDisplayedById(bind.pr_Dash_FavouriteIcon) == true) {
			OUTPUT("PASS - Favourite Button Image is displayed");
		} else {
			OUTPUTFAIL("FAIL - Favourite Button Image is NOT displayed");
		}

		expectedResult = "Add to favourites";

		if (repo.TextBoxCheckById(bind.pr_Dash_FavouriteText, expectedResult)) {
			OUTPUT("PASS - Add to Fav Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Add to Fav Text is NOT Correct");
		}

		if (repo.IsEnabledClickableById(bind.pr_Dash_ExpensesContainer) == true) {
			OUTPUT("PASS - Business Expenses is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Business Expenses is NOT Enabled & Clickable");
		}

		if (repo.IsDisplayedById(bind.pr_Dash_ExpensesIcon) == true) {
			OUTPUT("PASS - Business Expenses Icon is displayed");
		} else {
			OUTPUTFAIL("FAIL - Business Expenses Icon is NOT displayed");
		}

		expectedResult = "Business Expenses calculator";

		if (repo.TextBoxCheckIgnoreFormatByXPath(bind.pr_Dash_ExpensesTextXP, expectedResult)) {
			OUTPUT("PASS - Business Expenses Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Business Expenses Text is NOT Correct");
		}

		if (repo.IsEnabledClickableById(bind.pr_Dash_DepartingContainer) == true) {
			OUTPUT("PASS - Departing now is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Departing now is NOT Enabled & Clickable");
		}

		if (repo.IsDisplayedById(bind.pr_Dash_DepartingIcon) == true) {
			OUTPUT("PASS - Departing now Icon is displayed");
		} else {
			OUTPUTFAIL("FAIL - Departing now Icon is NOT displayed");
		}

		expectedResult = "Departing now";

		if (repo.TextBoxCheckIgnoreFormatById(bind.pr_Dash_DepartingText, expectedResult)) {
			OUTPUT("PASS - Departing now Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Departing now Text is NOT Correct");
		}

		OUTPUT("--- Adding Route to Favourites ---");

		repo.TriggerClickById(bind.pr_Dash_FavouriteContainer);

		repo.ElementWaitById(bind.pr_Dash_FavouriteAddedIcon);

		if (repo.IsDisplayedById(bind.pr_Dash_FavouriteAddedIcon)) {
			OUTPUT("PASS - Star Icon is displayed");
		} else {
			OUTPUTFAIL("FAIL - Star Icon is NOT displayed");
		}

		expectedResult = "Route added to favourites";

		if (repo.TextBoxCheckIgnoreFormatById(bind.pr_Dash_FavouriteAddedText, expectedResult)) {
			OUTPUT("PASS - Route added to Favourites text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Route added to Favourites text is NOT Correct");
		}

		expectedResult = "Remove from favourites";

		if (repo.TextBoxCheckById(bind.pr_Dash_FavouriteText, expectedResult)) {
			OUTPUT("PASS - Text changes to Remove from favourites");
		} else {
			OUTPUTFAIL("FAIL - Text does not change to Remove from favourites");
		}

		repo.pause(3000);

		OUTPUT("--- Removing Route from Favourites ---");

		repo.TriggerClickById(bind.pr_Dash_FavouriteContainer);

		repo.ElementWaitById(bind.pr_Dash_FavouriteAddedIcon);

		if (repo.IsDisplayedById(bind.pr_Dash_FavouriteAddedIcon)) {
			OUTPUT("PASS - Star Icon is displayed");
		} else {
			OUTPUTFAIL("FAIL - Star Icon is NOT displayed");
		}

		expectedResult = "Route removed from favourites";

		if (repo.TextBoxCheckIgnoreFormatById(bind.pr_Dash_FavouriteAddedText, expectedResult)) {
			OUTPUT("PASS - Route removed from Favourites text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Route removed from Favourites text is NOT Correct");
		}

		expectedResult = "Add to favourites";

		if (repo.TextBoxCheckById(bind.pr_Dash_FavouriteText, expectedResult)) {
			OUTPUT("PASS - Text changes to back to Add to favourites");
		} else {
			OUTPUTFAIL("FAIL - Text changes back to Add to favourites");
		}

		repo.pause(3000);

		OUTPUT("--- Re-adding Route to Favourites ---");

		repo.TriggerClickById(bind.pr_Dash_FavouriteContainer);

		repo.TriggerClickById(bind.pr_Dash_Close);

		repo.ElementWaitThenClickById(bind.pr_CloseButton);

		repo.ElementWaitThenClickById(bind.rp_PlanRouteButton);

		OUTPUT("--- Recent Routes ---");

		if (repo.IsEnabledClickableById(bind.srch_RecentsAll)) {
			OUTPUTFAIL("FAIL - Recents Container is Enabled & Clickable with only 1 Location");
		} else {
			OUTPUT("PASS - Recents Container is NOT Enabled & Clickable with only 1 Location");
		}

		if (repo.IsDisplayedById(bind.srch_RecentsIcon)) {
			OUTPUT("PASS - Clock Icon is displayed");
		} else {
			OUTPUTFAIL("FAIL - Clock Icon is NOT displayed");
		}

		expectedResult = "RECENT ROUTES";

		if (repo.TextBoxCheckIgnoreFormatById(bind.srch_RecentsTitle, expectedResult)) {
			OUTPUT("PASS - Recent Locations Header text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Recent Locations Header text is NOT Correct");
		}

		OUTPUT("--- Fav Routes ---");

		if (repo.IsEnabledClickableById(bind.srch_FavAll)) {
			OUTPUTFAIL("FAIL - Fav Container is Enabled & Clickable with only 1 Location");
		} else {
			OUTPUT("PASS - Fav Container is NOT Enabled & Clickable with only 1 Location");
		}

		if (repo.IsDisplayedById(bind.srch_FavIcon)) {
			OUTPUT("PASS - Star Icon is displayed");
		} else {
			OUTPUTFAIL("FAIL - Star Icon is NOT displayed");
		}

		expectedResult = "FAVOURITE ROUTES";

		if (repo.TextBoxCheckIgnoreFormatById(bind.srch_FavTitle, expectedResult)) {
			OUTPUT("PASS - Fav Locations Header text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Fav Locations Header text is NOT Correct");
		}

		OUTPUT("--- Removing Favourite via Search Screen ---");

		repo.TriggerClickById(bind.srch_FavFirstStarButton);

		repo.TriggerClickById(bind.pr_CloseButton);

		repo.ElementWaitThenClickById(bind.rp_PlanRouteButton);

		try {

			if (repo.IsDisplayedById(bind.srch_FavTitle) == true) {
				OUTPUTFAIL("FAIL - Favourites are displayed following last favourite location removal");
			}
		} catch (NoSuchElementException stored) {
			OUTPUT("PASS - Favourites are NOT displayed following last favourite location removal");
		}

		OUTPUT("--- Adding RAC to Edinburgh Route to Favourites ---");

		repo.destinationAddFirstRecent();

		OUTPUT("--- Adding RAC to Plymouth Route to Favourites ---");

		repo.destinationAddSecondRecent();

		OUTPUT("--- Adding RAC to London Route to Favourites ---");

		repo.destinationAddThirdRecent();

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename4 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteGRoute&Traffic/"
				+ todaysDate + "/" + todaysDate + "-991-MultipleRoutesSearched.jpg";
		repo.CaptureScreenshot(Filename4);

		OUTPUT("--- Checking Recent Routes List ---");

		repo.TriggerClickById(bind.srch_RecentsAll);

		repo.pause(3000);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename5 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteGRoute&Traffic/"
				+ todaysDate + "/" + todaysDate + "-992-RecentsList.jpg";
		repo.CaptureScreenshot(Filename5);

		repo.TriggerClickByXPath(bind.pr_FirstRecentListContainerXP);

		repo.ElementWaitByXPath(bind.pr_DestinationPostRecentXP);

		expectedResult = "London";

		if (repo.TextBoxCheckByxPath(bind.pr_DestinationPostRecentXP, expectedResult)) {
			OUTPUT("PASS - London destination is displayed");
		} else {
			OUTPUTFAIL("FAIL - London destination is NOT displayed");
		}

		repo.TriggerClickById(bind.pr_CloseButton);

		repo.TriggerClickById(bind.rp_PlanRouteButton);

		OUTPUT("--- Checking Favourite Routes List ---");

		repo.ElementWaitThenClickById(bind.srch_FavAll);

		repo.pause(3000);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename6 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteGRoute&Traffic/"
				+ todaysDate + "/" + todaysDate + "-993-FavouritesList.jpg";
		repo.CaptureScreenshot(Filename6);

		OUTPUT("--- Removing Favourite Route From Favourite Route List and Checking ---");

		repo.TriggerClickByXPath(bind.pr_FirstFavListStarButtonXP);

		repo.TriggerClickById(bind.pr_FavRouteListBack);

		repo.ElementWaitThenClickById(bind.srch_FavAll);

		repo.ElementWaitByXPath(bind.pr_FirstFavListDestinationXP);

		expectedResult = "Plymouth";

		if (repo.TextBoxCheckByxPath(bind.pr_FirstFavListDestinationXP, expectedResult)) {
			OUTPUT("PASS - London removed from Favourites and Plymouth placed at the top of the list");
		} else {
			OUTPUTFAIL("FAIL - London NOT removed from favourites");
		}

		repo.Back();

		repo.pause(2000);

		repo.Back();

		OUTPUT("***** COMPLETED - ROUTE & TRAFFIC - ROUTE PLANNING *****");

	}

	@After
	public void tearDown() {

		driver.quit();
	}
}
