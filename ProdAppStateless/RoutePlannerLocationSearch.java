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
public class RoutePlannerLocationSearch {

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
	public void RoutePlannerSettingsTests() {

		bind = new Repository.ElementRepo();

		OUTPUT("***** EXECUTING - ROUTE & TRAFFIC - LOCATION SEARCH *****");

		repo.LaunchStatelessAllowAll();

		// Route & Traffic Dashboard - Search for a Location

		OUTPUT("--- Checking Search through Contacts (Disallowed) ---");

		repo.TriggerClickById(bind.srch_ContainerMap);

		keyedInput = "Te";

		repo.SendKeysById(bind.srch_ContainerList, keyedInput);

		try {

			if (repo.IsDisplayedByXPathNoCheck(bind.srch_FirstContainerXP) == true) {
				OUTPUTFAIL("FAIL - Contact is Displayed prior to allowing Search through Contacts");
			}
		} catch (NoSuchElementException stored) {
			OUTPUT("PASS - Contact is NOT Displayed prior to being allowed");
		}

		OUTPUT("--- Allowing Search Through Contacts and Checking ---");

		repo.TriggerClickById(bind.srch_ContactsContainer);

		repo.TriggerClickById(bind.androidAllow);

		repo.pause(3000);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteGRoute&Traffic/"
				+ todaysDate + "/" + todaysDate + "-90-ContactsSearched.jpg";
		repo.CaptureScreenshot(Filename);

		OUTPUT("--- Searching for a Location ---");

		repo.Back();

		repo.pause(3000);

		repo.TriggerClickById(bind.srch_ContainerMap);

		keyedInput = "Lon";

		repo.SendKeysById(bind.srch_ContainerList, keyedInput);

		if (repo.IsEnabledClickableByXPath(bind.srch_FirstContainerXP)) {
			OUTPUT("PASS - First location container is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - First location container is NOT Enabled & Clickable");
		}

		expectedResult = "London";

		if (repo.TextBoxCheckByxPath(bind.srch_FirstLocationTextXP, expectedResult)) {
			OUTPUT("PASS - First location text is Correct");
		} else {
			OUTPUTFAIL("FAIL - First location text is NOT Correct");
		}

		expectedResult = "UK";

		if (repo.TextBoxCheckByxPath(bind.srch_FirstCountryTextXP, expectedResult)) {
			OUTPUT("PASS - First location text is Correct");
		} else {
			OUTPUTFAIL("FAIL - First location text is NOT Correct");
		}

		repo.TriggerClickByXPath(bind.srch_FirstContainerXP);

		repo.pause(3000);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename1 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteGRoute&Traffic/"
				+ todaysDate + "/" + todaysDate + "-91-LondonLocationsearched.jpg";
		repo.CaptureScreenshot(Filename1);

		OUTPUT("--- Checking Searched Location info ---");

		repo.ElementWaitById(bind.ibar_PlaceTitle);

		expectedResult = "London";

		if (repo.TextBoxCheckById(bind.ibar_PlaceTitle, expectedResult)) {
			OUTPUT("PASS - Searched Location Info Bar Title text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Searched Location Info Bar Title text is NOT Correct");
		}

		expectedResult = "London, UK";

		if (repo.TextBoxCheckById(bind.ibar_PlaceName, expectedResult)) {
			OUTPUT("PASS - Searched Location Info Bar Long Location text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Searched Location Info Bar Long Location text is NOT Correct");
		}

		expectedResult = "(117.27mi) away";

		if (repo.TextBoxEndsWithById(bind.ibar_Distance, expectedResult)) {
			OUTPUT("PASS - Searched Location Info Bar Distance text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Searched Location Info Distance text is NOT Correct");
		}

		OUTPUT("--- Adding Searched Location to Favourites ---");

		repo.TriggerClickById(bind.ibar_Favorite);

		repo.ElementWaitById(bind.favpop_FavIcon);

		if (repo.IsDisplayedById(bind.favpop_FavIcon)) {
			OUTPUT("PASS - Star Icon is displayed");
		} else {
			OUTPUTFAIL("FAIL - Star Icon is NOT displayed");
		}

		expectedResult = "Location added to favourites";

		if (repo.TextBoxCheckIgnoreFormatById(bind.favpop_FavText, expectedResult)) {
			OUTPUT("PASS - Adding to Favourites text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Adding to Favourites text is NOT Correct");
		}

		repo.pause(3000);

		OUTPUT("--- Removing Searched Location from Favourites ---");

		repo.TriggerClickById(bind.ibar_Favorite);

		repo.ElementWaitById(bind.favpop_FavIcon);

		if (repo.IsDisplayedById(bind.favpop_FavIcon)) {
			OUTPUT("PASS - Star Icon is displayed");
		} else {
			OUTPUTFAIL("FAIL - Star Icon is NOT displayed");
		}

		expectedResult = "Location removed from favourites";

		if (repo.TextBoxCheckIgnoreFormatById(bind.favpop_FavText, expectedResult)) {
			OUTPUT("PASS - Remove from Favourites text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Remove from Favourites text is NOT Correct");
		}

		OUTPUT("--- Adding Searched Location to Favourites once again ---");

		repo.TriggerClickById(bind.ibar_Favorite);

		repo.TriggerClickById(bind.srched_ClearTextMap);

		repo.TriggerClickById(bind.srch_ContainerMap);

		OUTPUT("--- Checking Search for a location with a 1 Location Searched & Added to Favourites ---");

		OUTPUT("--- Recent Locations ---");

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

		expectedResult = "RECENT LOCATIONS";

		if (repo.TextBoxCheckIgnoreFormatById(bind.srch_RecentsTitle, expectedResult)) {
			OUTPUT("PASS - Recent Locations Header text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Recent Locations Header text is NOT Correct");
		}

		if (repo.IsDisplayedByXPath(bind.srch_RecentFirstIconXP) == true) {
			OUTPUT("PASS - Location Balloon Icon is displayed");
		} else {
			OUTPUTFAIL("FAIL - Location Balloon  Icon is NOT displayed");
		}

		expectedResult = "London";

		if (repo.TextBoxCheckIgnoreFormatByXPath(bind.srch_RecentFirstTitleXP, expectedResult)) {
			OUTPUT("PASS - First Location Title text is Correct");
		} else {
			OUTPUTFAIL("FAIL - First Location Title text is NOT Correct");
		}

		expectedResult = "London, UK";

		if (repo.TextBoxCheckIgnoreFormatByXPath(bind.srch_RecentFirstLocationXP, expectedResult)) {
			OUTPUT("PASS - First Location text is Correct");
		} else {
			OUTPUTFAIL("FAIL - First Location text is NOT Correct");
		}

		OUTPUT("--- Fav Locations ---");

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

		expectedResult = "FAVOURITE LOCATIONS";

		if (repo.TextBoxCheckIgnoreFormatById(bind.srch_FavTitle, expectedResult)) {
			OUTPUT("PASS - Fav Locations Header text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Fav Locations Header text is NOT Correct");
		}

		if (repo.IsDisplayedByXPath(bind.srch_FavFirstIconXP)) {
			OUTPUT("PASS - Location Balloon Icon is displayed");
		} else {
			OUTPUTFAIL("FAIL - Location Balloon  Icon is NOT displayed");
		}

		expectedResult = "London";

		if (repo.TextBoxCheckIgnoreFormatByXPath(bind.srch_FavFirstTitleXP, expectedResult)) {
			OUTPUT("PASS - First Location Title text is Correct");
		} else {
			OUTPUTFAIL("FAIL - First Location Title text is NOT Correct");
		}

		expectedResult = "London, UK";

		if (repo.TextBoxCheckIgnoreFormatByXPath(bind.srch_FavFirstLocationXP, expectedResult)) {
			OUTPUT("PASS - First Location text is Correct");
		} else {
			OUTPUTFAIL("FAIL - First Location text is NOT Correct");
		}

		if (repo.IsDisplayedById(bind.srch_FavIcon)) {
			OUTPUT("PASS - Star Icon next to the First Location is displayed");
		} else {
			OUTPUTFAIL("FAIL - Star Icon next to the First Location is NOT displayed");
		}

		OUTPUT("--- Removing Location from Favourites using the star icon in the search screen and checking ---");

		repo.TriggerClickById(bind.srch_FavFirstStarButton);

		repo.Back();

		repo.TriggerClickById(bind.srch_ContainerMap);

		try {

			if (repo.IsDisplayedByXPathNoCheck(bind.srch_FavFirstTitleXP) == true) {
				OUTPUTFAIL("FAIL - London is NOT removed from Favourite Locations");
			}
		} catch (NoSuchElementException stored) {
			OUTPUT("PASS - London is removed from Favourite Locations");
		}

		OUTPUT("--- Re-adding London as a Favourite via Recent Locations list ---");

		repo.TriggerClickByXPath(bind.srch_RecentFirstContainerXP);

		repo.ElementWaitThenClickById(bind.ibar_Favorite);

		repo.TriggerClickById(bind.srched_ClearTextMap);

		OUTPUT("--- Adding Plymouth to Recent & Favourites List ---");

		keyedInput = "Plymouth";

		repo.SendKeysById(bind.srch_ContainerList, keyedInput);

		repo.TriggerClickByXPath(bind.srch_FirstContainerXP);

		repo.ElementWaitThenClickById(bind.ibar_Favorite);

		repo.TriggerClickById(bind.srched_ClearTextMap);

		OUTPUT("--- Adding Edinburgh to Recent & Favourites List ---");

		keyedInput = "Edinburgh";

		repo.SendKeysById(bind.srch_ContainerList, keyedInput);

		repo.TriggerClickByXPath(bind.srch_FirstContainerXP);

		repo.ElementWaitThenClickById(bind.ibar_Favorite);

		repo.TriggerClickById(bind.srched_ClearTextMap);

		repo.TriggerClickById(bind.srch_ContainerMap);

		OUTPUT("--- Checking Multiple Locations and lists ---");

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename2 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteGRoute&Traffic/"
				+ todaysDate + "/" + todaysDate + "-92-MultipleLocations.jpg";
		repo.CaptureScreenshot(Filename2);

		expectedResult = "See all";

		if (repo.TextBoxCheckById(bind.srch_RecentSeeAllText, expectedResult)) {
			OUTPUT("PASS - Recent Locations See all text is displayed and correct");
		} else {
			OUTPUTFAIL("FAIL - Recent Locations See all text is displayed and correct");
		}

		expectedResult = "See all";

		if (repo.TextBoxCheckById(bind.srch_FavSeeAllText, expectedResult)) {
			OUTPUT("PASS - Fav Locations See all text is displayed and correct");
		} else {
			OUTPUTFAIL("FAIL - Fav Locations See all text is displayed and correct");
		}

		repo.TriggerClickById(bind.srch_RecentsAll);

		expectedResult = "RECENT LOCATIONS";

		if (repo.TextBoxCheckById(bind.srch_ListTitle, expectedResult)) {
			OUTPUT("PASS - Recent Locations List Title displayed and correct");
		} else {
			OUTPUTFAIL("FAIL - Recent Locations List Title is displayed and correct");
		}

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename3 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteGRoute&Traffic/"
				+ todaysDate + "/" + todaysDate + "-93-RecentList.jpg";
		repo.CaptureScreenshot(Filename3);

		OUTPUT("--- Clicking Location from Recents List and Checking Map Displayed ---");

		repo.TriggerClickByXPath(bind.srch_RecentListFirstContainerXP);

		expectedResult = "Edinburgh";

		repo.ElementWaitById(bind.ibar_PlaceTitle);

		if (repo.TextBoxCheckById(bind.ibar_PlaceTitle, expectedResult)) {
			OUTPUT("PASS - Map with correct location is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Map with correct location is NOT Displayed");
		}

		repo.TriggerClickById(bind.srched_ClearTextMap);

		repo.TriggerClickById(bind.srch_ContainerMap);

		repo.TriggerClickById(bind.srch_FavAll);

		expectedResult = "FAVOURITE LOCATIONS";

		if (repo.TextBoxCheckById(bind.srch_ListTitle, expectedResult)) {
			OUTPUT("PASS - Fav Locations List Title displayed and correct");
		} else {
			OUTPUTFAIL("FAIL - Fav Locations List Title is displayed and correct");
		}

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename4 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteGRoute&Traffic/"
				+ todaysDate + "/" + todaysDate + "-94-FavList.jpg";
		repo.CaptureScreenshot(Filename4);

		OUTPUT("--- Clicking Location from Fav List and Checking Map Displayed ---");

		repo.TriggerClickByXPath(bind.srch_FavListFirstContainerXP);

		expectedResult = "Edinburgh";

		repo.ElementWaitById(bind.ibar_PlaceTitle);

		if (repo.TextBoxCheckById(bind.ibar_PlaceTitle, expectedResult)) {
			OUTPUT("PASS - Map with correct location is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Map with correct location is NOT Displayed");
		}

		repo.TriggerClickById(bind.srched_ClearTextMap);

		repo.TriggerClickById(bind.srch_ContainerMap);

		repo.TriggerClickById(bind.srch_FavAll);

		OUTPUT("--- Removing Fav Location from Fav List and Checking ---");

		repo.TriggerClickByXPath(bind.srch_FavListFirstStarButtonXP);

		repo.TriggerClickById(bind.srch_ListBack);

		repo.TriggerClickById(bind.srch_FavAll);

		expectedResult = "Plymouth";

		repo.ElementWaitByXPath(bind.srch_FavListFirstTitleXP);

		if (repo.TextBoxCheckByxPath(bind.srch_FavListFirstTitleXP, expectedResult)) {
			OUTPUT("PASS - Edinburgh removed from Fav list");
		} else {
			OUTPUTFAIL("FAIL - Edinburgh not removed from Fav list");
		}

		repo.TriggerClickById(bind.srch_ListBack);

		repo.ElementWaitById(bind.srch_BackButton);

		repo.Back();

		OUTPUT("***** COMPLETED - ROUTE & TRAFFIC - LOCATION SEARCH *****");

	}

	@After
	public void tearDown() {

		driver.quit();
	}
}
