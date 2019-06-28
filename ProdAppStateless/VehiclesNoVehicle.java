package ProdAppStateless;

import java.net.MalformedURLException;

import java.time.LocalDate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class VehiclesNoVehicle {

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
	public void appNoVehMyVehiclesTest() {

		bind = new Repository.ElementRepo();

		OUTPUT("*******************************************************************************************************************************************");

		OUTPUT("***************************************************** EXECUTING TEST SUITE E - VEHICLES ***************************************************");

		OUTPUT("*******************************************************************************************************************************************");

		OUTPUT("***** EXECUTING - NO VEHICLES - MY VEHICLES PAGE TESTS *****");

		repo.LaunchStatelessAllowAll();

		repo.TabSwitch(bind.appmenu_VehiclesXP);

		repo.Onboarding();

// Logging into MyRAC Account with NO Added Vehicles

		OUTPUT("--- Logging into MyRAC Account with NO Added Vehicles ---");

		OUTPUT("--- My Vehicles Page Loaded ---");

		repo.TriggerClickById(bind.login_Button);

		repo.pause(2000);

		keyedInput = ("PREGOLIVETEST@mailinator.com");

		repo.SendKeysById(bind.email_Entry, keyedInput);

		keyedInput = ("Test@123");

		repo.SendKeysById(bind.password_Entry, keyedInput);

		repo.LoginFailCheck();

// Logged in with no vehicles page checks

		OUTPUT("--- Checking Title Text ---");

		repo.pause(10000);

		try {
			repo.TriggerClickById(bind.rateClose_Button);
		} catch (NoSuchElementException ignored) {

		} catch (StaleElementReferenceException ignored) {

		}

		repo.pause(2000);

		OUTPUT("^^^-- TAKING A SCREENSHOT --^^^");

		String Filename = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteEMyVehicles/"
				+ todaysDate + "/" + todaysDate + "-1-MyVehiclesNoVehicle.jpg";
		repo.CaptureScreenshot(Filename);

		repo.pause(1000);

		expectedResult = "MY VEHICLES";

		if (repo.TextBoxCheckById(bind.toolbar_Title, expectedResult)) {
			OUTPUT("PASS - Title bar text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Title bar text is NOT Correct");
		}

		OUTPUT("--- Checking Add Vehicle Button is Enabled and Clickable ---");

		repo.pause(1000);

		if (repo.IsEnabledClickableById(bind.addVehicle_Button) == true) {
			OUTPUT("PASS - Add Vehicle Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Add Vehicle Button is NOT Enabled & Clickable");
		}

		OUTPUT("--- Checking Car image is Displayed ---");

		xPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageView";

		if (repo.IsDisplayedByXPath(xPath)) {
			OUTPUT("PASS - Car Image is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Car Image is NOT Displayed");
		}

		OUTPUT("--- Checking First Text Box ---");

		expectedResult = "You don't have any vehicles added to your account yet.";

		if (repo.TextBoxCheckIgnoreFormatById(bind.noVehicle_TextOne, expectedResult) == true) {
			OUTPUT("PASS - Text Box 1 is Correct");
		} else {
			OUTPUTFAIL("FAIL - Text Box 1 is NOT Correct");
		}

		OUTPUT("--- Checking Second Text Box ---");

		expectedResult = "In this section you can keep a record of your vehicle details and set reminders for key dates.";

		if (repo.TextBoxStartsWithById(bind.noVehicle_TextTwo, expectedResult) == true) {
			OUTPUT("PASS - Text Box 2 is Correct");
		} else {
			OUTPUTFAIL("FAIL - Text Box 2 is NOT Correct");
		}

		OUTPUT("--- Checking Tap the + text ---");

		expectedResult = "Tap the";

		if (repo.TextBoxCheckById(bind.noVehicle_TapStart, expectedResult) == true) {
			OUTPUT("PASS - Text Start is Correct");
		} else {
			OUTPUTFAIL("FAIL - Text Start is NOT Correct");
		}

		if (repo.IsDisplayedByXPath(bind.noVehicle_TapPlusXP)) {
			OUTPUT("PASS - Plus symbol is displayed");
		} else {
			OUTPUTFAIL("FAIL - Plus symbol is NOT displayed");
		}

		expectedResult = "to add your first vehicle";

		if (repo.TextBoxCheckById(bind.noVehicle_TapEnd, expectedResult) == true) {
			OUTPUT("PASS - Text End is Correct");
		} else {
			OUTPUTFAIL("FAIL - Text End is NOT Correct");
		}

		repo.pause(1000);

		OUTPUT("--- Checking Tap the + Container");

		if (repo.IsEnabledClickableById(bind.noVehicle_TapAddCont) == true) {
			OUTPUT("PASS - Tap the + text is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Tap the + text is NOT Enabled & Clickable");
		}

		OUTPUT("--- Checking Tap the View Warning Lights Button");

		if (repo.IsEnabledClickableById(bind.warningLights_Button) == true) {
			OUTPUT("PASS - Warning Lights Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Warning Lights Button is NOT Enabled & Clickable");
		}

		OUTPUT("--- Checking View Warning Lights Text");

		expectedResult = "VIEW WARNING LIGHTS";

		if (repo.TextBoxCheckById(bind.warningLights_ButtonText, expectedResult) == true) {
			OUTPUT("PASS - Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Text is NOT Correct");
		}

// Warning Lights Page Checks Start		 

		OUTPUT("--- Clicking View Warning Lights ---");

		repo.TriggerClickById(bind.warningLights_Button);

		repo.pause(2000);

		OUTPUT("^^^-- TAKING A SCREENSHOT --^^^");

		String Filename2 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteEMyVehicles/"
				+ todaysDate + "/" + todaysDate + "-2-MyVehiclesWarningLightsALL.jpg";
		repo.CaptureScreenshot(Filename2);

		repo.pause(1000);

		expectedResult = "ALL WARNING LIGHTS";

		if (repo.TextBoxCheckById(bind.warningLights_Title, expectedResult)) {
			OUTPUT("PASS - Title Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Title Text is NOT Correct");
		}

		OUTPUT("--- Clicking Filter Drop_down");

		repo.TriggerClickById(bind.warningLights_Dropdown);

		repo.pause(1000);

		OUTPUT("--- Checking Warning Lights Drop Down Options ---");

		if (repo.IsAvailableByXPath(bind.warningLightsDD_AllXP, "clickable") == true) {
			OUTPUT("PASS - All Warning Lights is Clickable");
		} else {
			OUTPUTFAIL("FAIL - All Warning Lights is NOT Clickable");
		}

		if (repo.IsAvailableByXPath(bind.warningLightsDD_GreenXP, "clickable") == true) {
			OUTPUT("PASS - Green Warning Lights is Clickable");
		} else {
			OUTPUTFAIL("FAIL - Green Warning Lights is NOT Clickable");
		}

		if (repo.IsAvailableByXPath(bind.warningLightsDD_AmberXP, "clickable") == true) {
			OUTPUT("PASS - Amber Warning Lights is Clickable");
		} else {
			OUTPUTFAIL("FAIL - Amber Warning Lights is NOT Clickable");
		}

		if (repo.IsAvailableByXPath(bind.warningLightsDD_RedXP, "clickable") == true) {
			OUTPUT("PASS - Red Warning Lights is Clickable");
		} else {
			OUTPUTFAIL("FAIL - Red Warning Lights is NOT Clickable");
		}

		OUTPUT("--- Checking Warning Lights Drop Down Option Text ---");

		expectedResult = "All warning lights";

		if (repo.TextBoxCheckByxPath(bind.warningLightsDD_AllXP, expectedResult)) {
			OUTPUT("PASS - All Warning Lights Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - All Warning Lights Text is NOT Correct");
		}

		expectedResult = "Green warning lights";

		if (repo.TextBoxCheckByxPath(bind.warningLightsDD_GreenXP, expectedResult)) {
			OUTPUT("PASS - Green Warning Lights Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Green Warning Lights Text is NOT Correct");
		}

		expectedResult = "Amber warning lights";

		if (repo.TextBoxCheckByxPath(bind.warningLightsDD_AmberXP, expectedResult)) {
			OUTPUT("PASS - Amber Warning Lights Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Amber Warning Lights Text is NOT Correct");
		}

		expectedResult = "Red warning lights";

		if (repo.TextBoxCheckByxPath(bind.warningLightsDD_RedXP, expectedResult)) {
			OUTPUT("PASS - Red Warning Lights Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Red Warning Lights Text is NOT Correct");
		}

		repo.TriggerClickByXPath(bind.warningLightsDD_AllXP);

		repo.pause(3000);

		repo.Back();

		repo.pause(3000);

		repo.TriggerClickById(bind.warningLights_Button);

		repo.pause(3000);

// ALL Warning Lights SELECTED

		OUTPUT("--- Checking ALL Warning Lights ---");
		OUTPUT("--- Checking Warning Light 1 in ALL---");

		if (repo.IsDisplayedByXPath(bind.warningLight1_ImageXP) == true) {
			OUTPUT("PASS - Warning Light 1 Image is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Warning Light 1 Image is NOT Displayed");
		}

		expectedResult = "Adaptive Cruise Control [green or amber]";

		if (repo.TextBoxCheckIgnoreFormatByXPath(bind.warningLight1_TextXP, expectedResult)) {
			OUTPUT("PASS - Warning Light 1 Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Warning Light 1 Text is NOT Correct");
		}

		repo.TriggerClickByXPath(bind.warningLight1_ContainerXP);

		repo.pause(1000);

		expectedResult = "Indicates that adaptive cruise control is active";

		if (repo.TextBoxCheckIgnoreFormatByXPath(bind.warningLight1_ExpandedTextXP, expectedResult)) {
			OUTPUT("PASS - Warning Light 1 Expanded Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Warning Light 1 Expanded Text is NOT Correct");
		}

		OUTPUT("--- Scrolling to Last Warning Light in ALL and Checking ---");

		elementList = "uk.co.rac.roadside:id/warning_lights_recycler_view";
		elementClass = "android.widget.TextView";
		elementText = "Press Brake Pedal";

		repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

		elementText = "Washer Fluid Level";

		repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

		repo.pause(3000);

		if (repo.IsDisplayedByXPath(bind.warningLightLast_ImageXP) == true) {
			OUTPUT("PASS - Warning Light Last Image is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Warning Light Last Image is NOT Displayed");
		}

		expectedResult = "Washer Fluid Level";

		if (repo.TextBoxCheckByxPath(bind.warningLightLast_TextXP, expectedResult)) {
			OUTPUT("PASS - Warning Light Last Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Warning Light Last Text is NOT Correct");
		}

		/*
		 * repo.TriggerClickByXPath(bind.warningLightLast_ContainerXP);
		 * 
		 * repo.pause(1000);
		 */

		/*
		 * elementText = "Indicates that the screen wash fluid is low or empty.";
		 * 
		 * repo.scrollToElementUsing_Text(elementList, elementClass, elementText);
		 * 
		 * expectedResult = "Indicates that the screen wash fluid is low or empty.";
		 * 
		 * if
		 * (repo.TextBoxCheckIgnoreFormatByXPath(bind.warningLightLast_ExpandedTextXP,
		 * expectedResult)) { OUTPUT
		 * ("PASS - Warning Light Last Expanded Text is Correct"); } else { OUTPUT
		 * ("FAIL - Warning Light Last Expanded Text is NOT Correct"); }
		 */

		repo.pause(3000);

		repo.Back();

		repo.pause(3000);

		repo.TriggerClickById(bind.warningLights_Button);

		repo.pause(3000);

// Green Warning Lights	SELECTED	 

		OUTPUT("--- Checking Green Warning Lights ---");
		OUTPUT("--- Checking Warning Light 1 in Green---");

		repo.TriggerClickById(bind.warningLights_Dropdown);

		repo.TriggerClickByXPath(bind.warningLightsDD_GreenXP);

		repo.pause(3000);

		OUTPUT("^^^-- TAKING A SCREENSHOT --^^^");

		String Filename3 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteEMyVehicles/"
				+ todaysDate + "/" + todaysDate + "-3-MyVehiclesWarningLightsGreen.jpg";
		repo.CaptureScreenshot(Filename3);

		repo.pause(1000);

		if (repo.IsDisplayedByXPath(bind.warningLight1_ImageXP) == true) {
			OUTPUT("PASS - Warning Light 1 Image is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Warning Light 1 Image is NOT Displayed");
		}

		expectedResult = "Adaptive Cruise Control [green or amber]";

		if (repo.TextBoxCheckIgnoreFormatByXPath(bind.warningLight1_TextXP, expectedResult)) {
			OUTPUT("PASS - Warning Light 1 Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Warning Light 1 Text is NOT Correct");
		}

		repo.TriggerClickByXPath(bind.warningLight1_ContainerXP);

		repo.pause(1000);

		expectedResult = "Indicates that adaptive cruise control is active";

		if (repo.TextBoxCheckIgnoreFormatByXPath(bind.warningLight1_ExpandedTextXP, expectedResult)) {
			OUTPUT("PASS - Warning Light 1 Expanded Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Warning Light 1 Expanded Text is NOT Correct");
		}

		OUTPUT("--- Checking Last Warning Light in Green ---");

		if (repo.IsDisplayedByXPath(bind.warningLightLastGreen_ImageXP) == true) {
			OUTPUT("PASS - Warning Light Last Image is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Warning Light Last Image is NOT Displayed");
		}

		expectedResult = "Press Brake Pedal";

		if (repo.TextBoxCheckIgnoreFormatByXPath(bind.warningLightLastGreen_TextXP, expectedResult)) {
			OUTPUT("PASS - Warning Light Last Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Warning Light Last Text is NOT Correct");
		}

		repo.TriggerClickByXPath(bind.warningLightLastGreen_ContainerXP);

		repo.pause(1000);

		expectedResult = "This indicates that the driver needs to press the brake pedal to select gear – typically used with auto transmission models.";

		if (repo.TextBoxCheckIgnoreFormatByXPath(bind.warningLightLastGreen_ExpandedTextXP, expectedResult)) {
			OUTPUT("PASS - Warning Light Last Expanded Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Warning Light Last Expanded Text is NOT Correct");
		}

		repo.pause(3000);

		repo.Back();

		repo.pause(3000);

		repo.TriggerClickById(bind.warningLights_Button);

		repo.pause(3000);

// Amber Warning Lights	SELECTED	 

		OUTPUT("--- Checking Warning Light 1 in Amber---");

		repo.TriggerClickById(bind.warningLights_Dropdown);

		repo.TriggerClickByXPath(bind.warningLightsDD_AmberXP);

		repo.pause(3000);

		OUTPUT("^^^-- TAKING A SCREENSHOT --^^^");

		String Filename4 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteEMyVehicles/"
				+ todaysDate + "/" + todaysDate + "-4-MyVehiclesWarningLightsAmber.jpg";
		repo.CaptureScreenshot(Filename4);

		if (repo.IsDisplayedByXPath(bind.warningLight1_ImageXP) == true) {
			OUTPUT("PASS - Warning Light 1 Image is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Warning Light 1 Image is NOT Displayed");
		}

		expectedResult = "Adaptive Suspension";

		if (repo.TextBoxCheckIgnoreFormatByXPath(bind.warningLight1_TextXP, expectedResult)) {
			OUTPUT("PASS - Warning Light 1 Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Warning Light 1 Text is NOT Correct");
		}

		repo.TriggerClickByXPath(bind.warningLight1_ContainerXP);

		repo.pause(1000);

		expectedResult = "Indicates a fault in the adaptive suspension system";

		if (repo.TextBoxCheckIgnoreFormatByXPath(bind.warningLight1_ExpandedTextXP, expectedResult)) {
			OUTPUT("PASS - Warning Light 1 Expanded Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Warning Light 1 Expanded Text is NOT Correct");
		}

		OUTPUT("--- Scrolling to Last Warning Light in Amber and Checking ---");

		elementText = "Diesel Particulate Filter";

		repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

		elementText = "Washer Fluid Level";

		repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

		repo.pause(3000);

		if (repo.IsDisplayedByXPath(bind.warningLightLast_ImageXP) == true) {
			OUTPUT("PASS - Warning Light Last Image is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Warning Light Last Image is NOT Displayed");
		}

		expectedResult = "Washer Fluid Level";

		if (repo.TextBoxCheckByxPath(bind.warningLightLast_TextXP, expectedResult)) {
			OUTPUT("PASS - Warning Light Last Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Warning Light Last Text is NOT Correct");
		}

		repo.pause(3000);

		repo.Back();

		repo.pause(3000);

		repo.TriggerClickById(bind.warningLights_Button);

		repo.pause(3000);

// Red Warning Lights SELECTED

		OUTPUT("--- Checking Warning Light 1 in Red---");

		repo.TriggerClickById(bind.warningLights_Dropdown);

		repo.TriggerClickByXPath(bind.warningLightsDD_RedXP);

		repo.pause(3000);

		OUTPUT("^^^-- TAKING A SCREENSHOT --^^^");

		String Filename5 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteEMyVehicles/"
				+ todaysDate + "/" + todaysDate + "-5-MyVehiclesWarningLightsRed.jpg";
		repo.CaptureScreenshot(Filename5);

		if (repo.IsDisplayedByXPath(bind.warningLight1_ImageXP) == true) {
			OUTPUT("PASS - Warning Light 1 Image is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Warning Light 1 Image is NOT Displayed");
		}

		expectedResult = "Airbag  Seat Belt System [red]";

		if (repo.TextBoxCheckIgnoreFormatByXPath(bind.warningLight1_TextXP, expectedResult)) {
			OUTPUT("PASS - Warning Light 1 Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Warning Light 1 Text is NOT Correct");
		}

		repo.TriggerClickByXPath(bind.warningLight1_ContainerXP);

		repo.pause(1000);

		expectedResult = "If the light comes on or flashes this indicates a fault in the airbag safety system";

		if (repo.TextBoxCheckIgnoreFormatByXPath(bind.warningLight1_ExpandedTextXP, expectedResult)) {
			OUTPUT("PASS - Warning Light 1 Expanded Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Warning Light 1 Expanded Text is NOT Correct");
		}

		OUTPUT("--- Scrolling to Last Warning Light in Red and Checking ---");

		elementText = "Door Open";

		repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

		elementText = "Stop";

		repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

		repo.pause(3000);

		if (repo.IsDisplayedByXPath(bind.warningLightLast_ImageXP) == true) {
			OUTPUT("PASS - Warning Light Last Image is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Warning Light Last Image is NOT Displayed");
		}

		expectedResult = "Stop";

		if (repo.TextBoxCheckByxPath(bind.warningLightLast_TextXP, expectedResult)) {
			OUTPUT("PASS - Warning Light Last Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Warning Light Last Text is NOT Correct");
		}

		repo.Back();

		OUTPUT("***** COMPLETED - NO VEHICLES - MY VEHICLES PAGE TESTS *****");

	}

	@After
	public void tearDown() {

		driver.quit();
	}
}
