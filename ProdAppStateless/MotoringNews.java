package ProdAppStateless;

import java.net.MalformedURLException;
import java.time.LocalDate;
import java.lang.reflect.InvocationTargetException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MotoringNews {

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

	public String expectedResult = "";
	LocalDate todaysDate = java.time.LocalDate.now();

	// ********************************************* EDIT >>>>>>>>>>>>>

	String current_Diesel = "136.78p";
	String current_Unleaded = "129.98p";

	// ********************************************* EDIT <<<<<<<<<<<<<

	@Test
	public void MotoringNewsTest() throws InvocationTargetException {

		bind = new Repository.ElementRepo();

		OUTPUT("*******************************************************************************************************************************************");

		OUTPUT("*************************************************** EXECUTING TEST SUITE F - NEWS & RESCUE ************************************************");

		OUTPUT("*******************************************************************************************************************************************");

		OUTPUT("***** EXECUTING MOTORING NEWS PAGE TESTS *****");

		repo.LaunchStatelessAllowAll();

		repo.TabSwitch(bind.appmenu_NewsXP);

		repo.pause(3000);

		repo.Onboarding();

		repo.TabSwitch(bind.appmenu_NewsXP);

		// Checking the Heading and the Fuel Prices Section

		repo.pause(3000);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteFNewsAndRescueMe/"
				+ todaysDate + "/" + todaysDate + "-1-PageTop.jpg";
		repo.CaptureScreenshot(Filename);

		repo.pause(3000);

		OUTPUT("--- Checking Fuel Watch Section ---");

		expectedResult = "NEWS";

		if (repo.TextBoxCheckIgnoreFormatById(bind.toolbar_Title, expectedResult)) {
			OUTPUT("PASS - News Title is Correct");
		} else {
			OUTPUTFAIL("FAIL - News Title is NOT Correct");
		}

		expectedResult = "FUEL PRICE WATCH";

		if (repo.TextBoxCheckIgnoreFormatById(bind.fuelWatch_Title, expectedResult)) {
			OUTPUT("PASS - Fuel Watch Title is Correct");
		} else {
			OUTPUTFAIL("FAIL - Fuel Watch Title is NOT Correct");
		}

		expectedResult = "Diesel";

		if (repo.TextBoxCheckIgnoreFormatById(bind.fuelLeftName, expectedResult)) {
			OUTPUT("PASS - Diesel Title is Correct");
		} else {
			OUTPUTFAIL("FAIL - Diesel Title is NOT Correct");
		}

		if (repo.TextBoxCheckIgnoreFormatById(bind.fuelLeft_Value, current_Diesel)) {
			OUTPUT("PASS - Diesel Value is Correct");
		} else {
			OUTPUTFAIL("FAIL - Diesel Value is NOT Correct");
		}

		if (repo.IsDisplayedById(bind.fuelLeft_ChangeArrow)) {
			OUTPUT("PASS - Change Arrow is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Change Arrow is NOT Displayed");
		}

		expectedResult = "Unleaded";

		if (repo.TextBoxCheckIgnoreFormatById(bind.fuelRightName, expectedResult)) {
			OUTPUT("PASS - Unleaded Title is Correct");
		} else {
			OUTPUTFAIL("FAIL - Unleaded Title is NOT Correct");
		}

		if (repo.TextBoxCheckIgnoreFormatById(bind.fuelRight_Value, current_Unleaded)) {
			OUTPUT("PASS - Unleaded Value is Correct");
		} else {
			OUTPUTFAIL("FAIL - Unleaded Value is NOT Correct");
		}

		if (repo.IsDisplayedById(bind.fuelRight_ChangeArrow)) {
			OUTPUT("PASS - Change Arrow is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Change Arrow is NOT Displayed");
		}

		// First News Article

		OUTPUT("--- Checking First News Article ---");

		if (repo.IsEnabledClickableByXPath(bind.firstNews_ContainerXP) == true) {
			OUTPUT("PASS - First News Article Container is Enabled & Clickable");
		} else {
			OUTPUT("FAIL - First News Article Container is NOT Enabled & Clickable");
		}

		if (repo.IsDisplayedByXPath(bind.firstNews_PictureXP)) {
			OUTPUT("PASS - First News Article Picture is Displayed");
		} else {
			OUTPUTFAIL("FAIL - First News Article Picture is NOT Displayed");
		}

		if (repo.IsDisplayedByXPath(bind.firstNews_CornerXP)) {
			OUTPUT("PASS - First News Article Corner Colour is Displayed");
		} else {
			OUTPUTFAIL("FAIL - First News Article Corner Colour is NOT Displayed");
		}

		if (repo.IsDisplayedByXPath(bind.firstNews_TypeXP)) {
			OUTPUT("PASS - First News Article Type is Displayed");
		} else {
			OUTPUTFAIL("FAIL - First News Article Type is NOT Displayed");
		}

		if (repo.IsDisplayedByXPath(bind.firstNews_DescriptionXP)) {
			OUTPUT("PASS - First News Article Description is Displayed");
		} else {
			OUTPUTFAIL("FAIL - First News Article Description is NOT Displayed");
		}

		// First News Article Clicked

		OUTPUT("--- Clicking First News Article Expanced ---");

		repo.TriggerClickByXPath(bind.firstNews_ContainerXP);

		repo.pause(4000);

		try {
			repo.TriggerClickById(bind.popUp_RightButton);

		} catch (NoSuchElementException ignored) {

			OUTPUTFAIL("*** No pop up advising on Swipe Function ***");
		}

		repo.pause(3000);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename3 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteFNewsAndRescueMe/"
				+ todaysDate + "/" + todaysDate + "-2-FirstArticle.jpg";
		repo.CaptureScreenshot(Filename3);

		repo.pause(3000);

		/*
		 * if (repo.IsEnabledClickableById(firstNewsDetails_Article, "scrollable") ==
		 * true) { OUTPUT("PASS - First News Article Container is Scrollable"); } else {
		 * OUTPUT("FAIL - First News Article Container is NOT Scrollable"); }
		 */

		if (repo.IsDisplayedById(bind.firstNewsDetails_Picture)) {
			OUTPUT("PASS - First News Article Picture is Displayed");
		} else {
			OUTPUTFAIL("FAIL - First News Article Picture is NOT Displayed");
		}

		if (repo.IsDisplayedById(bind.firstNewsDetails_Corner)) {
			OUTPUT("PASS - First News Article Corner Colour is Displayed");
		} else {
			OUTPUTFAIL("FAIL - First News Article Corner Colour is NOT Displayed");
		}

		if (repo.IsDisplayedById(bind.firstNewsDetails_Type)) {
			OUTPUT("PASS - First News Article Type is Displayed");
		} else {
			OUTPUTFAIL("FAIL - First News Article Type is NOT Displayed");
		}

		if (repo.IsDisplayedById(bind.firstNewsDetails_Description)) {
			OUTPUT("PASS - First News Article Description is Displayed");
		} else {
			OUTPUTFAIL("FAIL - First News Article Description is NOT Displayed");
		}

		if (repo.IsEnabledClickableById(bind.firstNews_ShareButton) == true) {
			OUTPUT("PASS - First News Share Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - First News Share Button is NOT Enabled & Clickable");
		}

		OUTPUT("--- CHECKING SHARE OPTIONS ---");

		repo.TriggerClickById(bind.firstNews_ShareButton);

		repo.pause(2000);

		expectedResult = "Share News";

		if (repo.TextBoxCheckIgnoreFormatById(bind.Share_Title, expectedResult)) {
			OUTPUT("PASS - Share News Title is Correct");
		} else {
			OUTPUTFAIL("FAIL - Share News Title is NOT Correct");
		}

		if (repo.IsEnabledClickableByXPath(bind.Share_OptionOneXP) == true) {
			OUTPUT("PASS - First Share Option is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - First Share Option is NOT Enabled & Clickable");
		}

		if (repo.IsEnabledClickableByXPath(bind.Share_OptionTwoXP) == true) {
			OUTPUT("PASS - Second Share Option is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Second Share Option is NOT Enabled & Clickable");
		}

		if (repo.IsEnabledClickableByXPath(bind.Share_OptionThreeXP) == true) {
			OUTPUT("PASS - Third Share Option is Enabled & Clickable");
		} else {
			OUTPUT("FAIL - Third Share Option is NOT Enabled & Clickable");
		}

		if (repo.IsEnabledClickableByXPath(bind.Share_OptionFourXP) == true) {
			OUTPUT("PASS - Forth Share Option is Enabled & Clickable");
		} else {
			OUTPUT("FAIL - Forth Share Option is NOT Enabled & Clickable");
		}

		repo.Back();

		// Scrolling News Article & News Feed

		repo.pause(2000);

		OUTPUT("--- SCROLLING NEWS ARTICLE ---");

		repo.verticalSwipeByPercentage(0.9, 0.1, 0.5);

		repo.pause(3000);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename5 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteFNewsAndRescueMe/"
				+ todaysDate + "/" + todaysDate + "-3-FirstArticleSwipedDown.jpg";
		repo.CaptureScreenshot(Filename5);

		repo.pause(3000);

		OUTPUT("--- SWIPING TO NEXT NEWS ARTICLE ---");

		repo.horizontalSwipeByPercentage(0.9, 0.1, 0.5);

		repo.pause(3000);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename7 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteFNewsAndRescueMe/"
				+ todaysDate + "/" + todaysDate + "-4-NextArticleFollowingSwipe.jpg";
		repo.CaptureScreenshot(Filename7);

		repo.pause(3000);

		OUTPUT("--- SWIPING TO BACK TO PREVIOUS NEWS ARTICLE ---");

		repo.horizontalSwipeByPercentage(0.1, 0.9, 0.5);

		repo.pause(3000);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename9 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteFNewsAndRescueMe/"
				+ todaysDate + "/" + todaysDate + "-5-PreviousArticleFollowingSwipeBack.jpg";
		repo.CaptureScreenshot(Filename9);

		repo.pause(3000);

		repo.Back();

		OUTPUT("--- SCROLLING NEWS FEED ---");

		repo.verticalSwipeByPercentage(0.9, 0.1, 0.5);

		repo.pause(3000);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename11 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteFNewsAndRescueMe/"
				+ todaysDate + "/" + todaysDate + "-6-NewsFeedSwipedDown.jpg";
		repo.CaptureScreenshot(Filename11);

		// Scrolling to a news article and checking

		/*
		 * OUTPUT("--- SCROLLING TO A NEWS ARTICLE AND CHECKING ---");
		 * 
		 * elementList = "uk.co.rac.roadside:id/viewpager"; elementClass =
		 * "android.widget.TextView"; elementText =
		 * "The best driving and racing video games";
		 * 
		 * repo.scrollToElementUsing_Text(elementList, elementClass, elementText);
		 * 
		 * OUTPUT("^^^-- TAKING A SCREENSHOT --^^^");
		 * 
		 * String Filename5 =
		 * "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteFMotoringNews/"
		 * + todaysDate + "-ScrolledArticle.jpg"; repo.CaptureScreenshot(Filename5);
		 * 
		 * if (repo.IsEnabledClickableByXPath(bind.firstNews_ContainerXP) == true) {
		 * OUTPUT("PASS - Scrolled News Article Container is Enabled"); } else {
		 * OUTPUT("FAIL - Scrolled News Article Container is NOT Enabled"); }
		 * 
		 * if (repo.IsEnabledClickableByXPath(bind.firstNews_ContainerXP) == true) {
		 * OUTPUT("PASS - Scrolled News Article Container is Clickable"); } else {
		 * OUTPUT("FAIL - Scrolled News Article Container is NOT Clickable"); }
		 * 
		 * if (repo.IsDisplayedByXPath(bind.firstNews_PictureXP)) {
		 * OUTPUT("PASS - Scrolled News Article Picture is Displayed"); } else {
		 * OUTPUTFAIL("FAIL - Scrolled News Article Picture is NOT Displayed"); }
		 * 
		 * if (repo.IsDisplayedByXPath(bind.firstNews_CornerXP)) {
		 * OUTPUT("PASS - Scrolled News Article Corner Colour is Displayed"); } else {
		 * OUTPUTFAIL("FAIL - Scrolled News Article Corner Colour is NOT Displayed"); }
		 * 
		 * if (repo.IsDisplayedByXPath(bind.firstNews_TypeXP)) {
		 * OUTPUT("PASS - Scrolled News Article Type is Displayed"); } else {
		 * OUTPUTFAIL("FAIL - Scrolled News Article Type is NOT Displayed"); }
		 * 
		 * if (repo.IsDisplayedByXPath(bind.firstNews_DescriptionXP)) {
		 * OUTPUT("PASS - Scrolled News Article Description is Displayed"); } else {
		 * OUTPUTFAIL("FAIL - Scrolled News Article Description is NOT Displayed"); }
		 * 
		 * OUTPUT("--- CLICKING INTO SCROLLED NEWS ITEM ---");
		 * 
		 * repo.TriggerClickByXPath(bind.firstNews_ContainerXP);
		 * 
		 * repo.pause(3000);
		 * 
		 * if (repo.IsEnabledClickableById(firstNewsDetails_Article, "scrollable") ==
		 * true) { OUTPUT("PASS - Scrolled News Article Container is Scrollable"); }
		 * else { OUTPUT("FAIL - Scrolled News Article Container is NOT Scrollable"); }
		 * 
		 * if (repo.IsDisplayedById(bind.firstNewsDetails_Picture)) {
		 * OUTPUT("PASS - Scrolled News Article Picture is Displayed"); } else {
		 * OUTPUTFAIL("FAIL - Scrolled News Article Picture is NOT Displayed"); }
		 * 
		 * if (repo.IsDisplayedById(bind.firstNewsDetails_Corner)) {
		 * OUTPUT("PASS - Scrolled News Article Corner Colour is Displayed"); } else {
		 * OUTPUTFAIL("FAIL - Scrolled News Article Corner Colour is NOT Displayed"); }
		 * 
		 * if (repo.IsDisplayedById(bind.firstNewsDetails_Type)) {
		 * OUTPUT("PASS - Scrolled News Article Type is Displayed"); } else {
		 * OUTPUTFAIL("FAIL - Scrolled News Article Type is NOT Displayed"); }
		 * 
		 * if (repo.IsDisplayedById(bind.firstNewsDetails_Description)) {
		 * OUTPUT("PASS - Scrolled News Article Description is Displayed"); } else {
		 * OUTPUTFAIL("FAIL - Scrolled News Article Description is NOT Displayed"); }
		 * 
		 * if (repo.IsEnabledClickableById(bind.firstNews_ShareButton) == true) {
		 * OUTPUT("PASS - Scrolled News Share Button is Enabled"); } else {
		 * OUTPUT("FAIL - Scrolled News Share Button is NOT Enabled"); }
		 * 
		 * if (repo.IsEnabledClickableById(bind.firstNews_ShareButton) == true) {
		 * OUTPUT("PASS - Scrolled News Share Button is Clickable"); } else {
		 * OUTPUT("FAIL - Scrolled News Share Button is NOT Clickable"); }
		 * 
		 * repo.Back();
		 * 
		 * repo.pause(3000);
		 */

		// Checking for All news Article Types

		/*
		 * OUTPUT("--- ATTEMPTING TO LOCATE NEWS ITEM TYPES ---");
		 * 
		 * elementText = "FEATURE";
		 * 
		 * try {
		 * 
		 * repo.scrollToFeatureUsing_Text(elementList, elementClass, elementText);
		 * 
		 * OUTPUT("LOCATED - Example of a Feature Article");
		 * 
		 * } catch (NoSuchElementException ignored) {
		 * OUTPUTFAIL("*** Unable to locate an example of a Feature Article ***"); }
		 * catch (StaleElementReferenceException ignored) {
		 * OUTPUTFAIL("*** Unable to locate an example of a Feature Article ***"); }
		 * 
		 * elementText = "MOTORING NEWS"; ;
		 * 
		 * try {
		 * 
		 * repo.scrollToMotoringNewsUsing_Text(elementList, elementClass, elementText);
		 * 
		 * OUTPUT("LOCATED - Example of a Motoring News Article");
		 * 
		 * } catch (NoSuchElementException ignored) {
		 * OUTPUTFAIL("*** Unable to locate an example of a Motoring News Article ***");
		 * } catch (StaleElementReferenceException ignored) {
		 * OUTPUTFAIL("*** Unable to locate an example of a Motoring News Article ***");
		 * }
		 * 
		 * elementText = "ELECTRIC CARS";
		 * 
		 * try {
		 * 
		 * repo.scrollToElectricCarsUsing_Text(elementList, elementClass, elementText);
		 * 
		 * OUTPUT("LOCATED - Example of a Electric Cars Article");
		 * 
		 * } catch (NoSuchElementException ignored) {
		 * OUTPUTFAIL("*** Unable to locate an example of a Electric Cars Article ***");
		 * } catch (StaleElementReferenceException ignored) {
		 * OUTPUTFAIL("*** Unable to locate an example of a Electric Cars Article ***");
		 * }
		 * 
		 * elementText = "DRIVERLESS CARS";
		 * 
		 * try {
		 * 
		 * repo.scrollToDriverlessCarsUsing_Text(elementList, elementClass,
		 * elementText);
		 * 
		 * OUTPUT("LOCATED - Example of a Driverless Cars Article");
		 * 
		 * } catch (NoSuchElementException ignored) {
		 * OUTPUTFAIL("*** Unable to locate an example of a Driverless Cars Article ***"
		 * ); } catch (StaleElementReferenceException ignored) {
		 * OUTPUTFAIL("*** Unable to locate an example of a Driverless Cars Article ***"
		 * ); }
		 * 
		 * elementText = "RAC NEWS";
		 * 
		 * try {
		 * 
		 * repo.scrollToDriverlessCarsUsing_Text(elementList, elementClass,
		 * elementText);
		 * 
		 * OUTPUT("LOCATED - Example of a RAC News Article");
		 * 
		 * } catch (NoSuchElementException ignored) {
		 * OUTPUTFAIL("*** Unable to locate an example of a RAC News Article ***"); }
		 * catch (StaleElementReferenceException ignored) {
		 * OUTPUTFAIL("*** Unable to locate an example of a RAC News  Article ***"); }
		 */

		/*
		 * // Checking for all News Article Types and Verifying Text
		 * 
		 * elementList = "uk.co.rac.roadside:id/viewpager"; elementClass =
		 * "android.widget.TextView"; elementText = "FEATURE"; expectedResult =
		 * "FEATURE";
		 * 
		 * repo.scrollToElementUsing_TextAndGet(elementList, elementClass, elementText);
		 * 
		 * if (repo.verifyElementText(elementName, expectedResult) == true) {
		 * OUTPUT("PASS = Feature Text is Correct"); } else {
		 * OUTPUTFAIL("FAIL = Feature Text is NOT Correct"); }
		 * 
		 * elementText = "MOTORING NEWS"; expectedResult = "MOTORING NEWS";
		 * 
		 * repo.scrollToElementUsing_TextAndGet(elementList, elementClass, elementText);
		 * 
		 * if (repo.verifyElementText(elementName, expectedResult) == true) {
		 * OUTPUT("PASS = Motoring News Text is Correct"); } else {
		 * OUTPUTFAIL("FAIL = Motoring News Text is NOT Correct"); } elementText =
		 * "ELECTRIC CARS"; expectedResult = "ELECTRIC CARS";
		 * 
		 * repo.scrollToElementUsing_TextAndGet(elementList, elementClass, elementText);
		 * 
		 * if (repo.verifyElementText(elementName, expectedResult) == true) {
		 * OUTPUT("PASS = Electric Cars Text is Correct"); } else {
		 * OUTPUTFAIL("FAIL = Electric Cars Text is NOT Correct"); }
		 */

		/*
		 * elementText = "DRIVERLESS CARS"; expectedResult = "DRIVERLESS CARS";
		 */

		/*
		 * repo.scrollToElementUsing_TextAndGet(elementList, elementClass, elementText);
		 * 
		 * if (repo.verifyElementText(elementName, expectedResult) == true) {
		 * OUTPUT("PASS = Driverless Cars Text is Correct"); } else {
		 * OUTPUTFAIL("FAIL = Driverless Cars Text is NOT Correct"); }
		 * 
		 * repo.verifyElementText(elementName, expectedResult);
		 * 
		 * elementText = "RAC NEWS"; expectedResult = "RAC NEWS";
		 * 
		 * repo.scrollToElementUsing_TextAndGet(elementList, elementClass, elementText);
		 * 
		 * if (repo.verifyElementText(elementName, expectedResult) == true) {
		 * OUTPUT("PASS = RAC News Text is Correct"); } else {
		 * OUTPUTFAIL("FAIL = RAC News Text is NOT Correct"); }
		 */

		OUTPUT("***** COMPLETED MOTORING NEWS PAGE TESTS *****");
	}

	@After
	public void tearDown() {

		driver.quit();
	}
}
