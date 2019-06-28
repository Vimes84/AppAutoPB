package ProdAppStateless;

import java.net.MalformedURLException;

import java.time.LocalDate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class WelcomePage {

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
	public void appWelcomePageTest() {

		bind = new Repository.ElementRepo();

		OUTPUT("*******************************************************************************************************************************************");

		OUTPUT("***************************************************** EXECUTING TEST SUITE A - WELCOME ****************************************************");

		OUTPUT("*******************************************************************************************************************************************");

		OUTPUT("***** EXECUTING - WELCOME PAGE TESTS *****");

		repo.pause(10000);

		repo.ratePopUpClickById();

// RAC Logo

		OUTPUT("--- Welcome Page Loaded ---");
		OUTPUT("--- Checking RAC Logo is Displayed ---");

		repo.pause(1000);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteAWelcome/"
				+ todaysDate + "/" + todaysDate + "-1-WelcomePage.jpg";
		repo.CaptureScreenshot(Filename);

		OUTPUT("--- Checking Member Login is Displayed ---");

		if (repo.IsDisplayedById(bind.rac_Logo)) {
			OUTPUT("PASS - RAC Logo Is Displayed");
		} else {
			OUTPUTFAIL("FAIL - RAC Logo Is NOT Displayed");
		}

// Welcome Message

		OUTPUT("--- Checking Welcome Message is Correct ---");

		repo.pause(1000);

		expectedResult = "WELCOME TO THE RAC APP";

		if (repo.TextBoxCheckById(bind.title_Message, expectedResult)) {
			OUTPUT("PASS - Title Matches");
		} else {
			OUTPUTFAIL("FAIL - Title Difference");
		}

// Text box 1

		OUTPUT("--- Checking Text Box 1 is Correct ---");

		repo.pause(1000);

		xPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]";
		expectedResult = "Plan a journey, check traffic and get help when you've broken down.";

		if (repo.TextBoxCheckByxPath(xPath, expectedResult)) {
			OUTPUT("PASS - Textbox 1 Matches");
		} else {
			OUTPUTFAIL("FAIL - Textbox 1 Difference");
		}

// Text box 2

		OUTPUT("--- Checking Text Box 2 is Correct ---");

		repo.pause(1000);

		xPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[3]";
		expectedResult = "Store information about your vehicles, set reminders and view your membership details.";

		if (repo.TextBoxCheckByxPath(xPath, expectedResult)) {
			OUTPUT("PASS - Textbox 2 Matches");
		} else {
			OUTPUTFAIL("FAIL - Textbox 2 Difference");
		}

// Join The RAC Button Pre-Check

		OUTPUT("--- Checking Join The RAC Button is Enabled, Clickable and Text Populated ---");

		repo.pause(1000);

		if (repo.IsEnabledClickableById(bind.join_Button) == true) {
			OUTPUT("PASS - Join RAC Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Join RAC Button is NOT Enabled & Clickable");
		}

		expectedResult = "JOIN THE RAC";

		if (repo.TextBoxCheckById(bind.join_ButtonText, expectedResult)) {
			OUTPUT("PASS - Join The RAC Text is Correct");
		} else {
			OUTPUT("PASS - Join The RAC Text is Correct");
		}

// Member Login Button Pre-Check

		OUTPUT("--- Checking Member Login Button is Enabled, Clickable and Text Populated  ---");

		repo.pause(1000);

		if (repo.IsEnabledClickableById(bind.login_Button) == true) {
			OUTPUT("PASS - Member Login Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Member Login Button is NOT Enabled & Clickable");
		}

		expectedResult = "MEMBER LOGIN";

		if (repo.TextBoxCheckById(bind.login_ButtonText, expectedResult)) {
			OUTPUT("PASS - Member Login Text is Correct");
		} else {
			OUTPUT("PASS - Member Login Text is Correct");
		}

// Skip Button Pre-Check		

		OUTPUT("--- Checking Skip Button is Enabled, Clickable and Text Populated ---");

		repo.pause(1000);

		if (repo.IsEnabledClickableById(bind.skip_Button) == true) {
			OUTPUT("PASS - Skip Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Skip Button is NOT Enabled & Clickable");
		}

		expectedResult = "SKIP";

		if (repo.TextBoxCheckById(bind.skip_ButtonText, expectedResult)) {
			OUTPUT("PASS - Skip Text is Correct");
		} else {
			OUTPUT("PASS - Skip Text is Correct");
		}

// T&C Link Pre-Check		

		OUTPUT("--- Checking T&C Link is Enabled, Clickable and Text Populated  ---");

		repo.pause(1000);

		if (repo.IsEnabledClickableById(bind.tandc_Link) == true) {
			OUTPUT("PASS - T&C Link is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - T&C Link is NOT Enabled & Clickable");
		}

		expectedResult = "View the Terms and Conditions";

		if (repo.TextBoxCheckById(bind.tandc_LinkText, expectedResult)) {
			OUTPUT("PASS - T&C Text is Correct");
		} else {
			OUTPUT("PASS - T&C Text is Correct");
		}

		OUTPUT("--- Checking Chevron icon is Displayed ---");

		if (repo.IsDisplayedByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ImageView")) {
			OUTPUT("PASS - T&C Cheveron Icon Is Displayed");
		} else {
			OUTPUTFAIL("FAIL - T&C Cheveron Icon Is NOT Displayed");
		}

// Privacy Policy Link Pre-Check

		OUTPUT("--- Checking Privacy Policy Link is Enabled, Clickable and Text Populated  ---");

		repo.pause(1000);

		if (repo.IsEnabledClickableById(bind.privacy_Link) == true) {
			OUTPUT("PASS - Privacy Policy Link is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Privacy Policy Link is NOT Enabled & Clickable");
		}

		expectedResult = "View the Privacy Policy";

		if (repo.TextBoxCheckById(bind.privacy_LinkText, expectedResult)) {
			OUTPUT("PASS - Privacy Policy Text is Correct");
		} else {
			OUTPUT("PASS - Privacy Policy Text is Correct");
		}

		OUTPUT("--- Checking Chevron icon is Displayed ---");

		if (repo.IsDisplayedByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.ImageView")) {
			OUTPUT("PASS - Privacy Policy Chevron Icon Is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Privacy Policy Chevron Icon Is NOT Displayed");
		}

// Join The RAC Button Check		

		OUTPUT("--- Tapping Join The RAC Button ---");

		repo.TriggerClickById(bind.join_Button);

		OUTPUT("--- Checking URL is Correct ---");

		repo.pause(2000);

		xPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.EditText";
		expectedResult = "https://www.rac.co.uk/breakdown-cover/uk-breakdown";

		if (repo.TextBoxStartsWithByxPath(xPath, expectedResult)) {
			OUTPUT("PASS - URL Matches");
		} else {
			OUTPUTFAIL("FAIL - URL does not Match");
		}

		OUTPUT("--- Navigating back to the Welcome Screen ---");

		repo.Back();

// Member Login Button Check

		OUTPUT("--- Tapping Member Login Button ---");

		repo.TriggerClickById(bind.login_Button);

		OUTPUT("--- Checking Member Login is Displayed ---");

		repo.pause(1000);

		if (repo.IsDisplayedById("uk.co.rac.roadside:id/form_container")) {
			OUTPUT("PASS - Member Login is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Member Login Is NOT Displayed");
		}

		OUTPUT("--- Navigating back to the Welcome Screen ---");

		repo.TriggerClickById(bind.login_BackButton);

//T&C Link Check

		OUTPUT("--- Tapping T&C Link ---");

		repo.pause(2000);

		repo.TriggerClickById(bind.tandc_Link);

		OUTPUT("--- Checking T&Cs are Displayed ---");

		repo.pause(1000);

		xPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView";
		expectedResult = "Terms & Conditions";

		if (repo.TextBoxCheckByxPath(xPath, expectedResult)) {
			OUTPUT("PASS - T&Cs are Displayed");
		} else {
			OUTPUTFAIL("FAIL - T&Cs are NOT Displayed");
		}

		OUTPUT("--- Checking T&C Container is scrollable ---");

		repo.pause(1000);

		String tandc_Container = "uk.co.rac.roadside:id/tandc_scrollview";

		if (repo.IsAvailableById(tandc_Container, "scrollable") == true) {
			OUTPUT("PASS - T&Cs are Scrollable");
		} else {
			OUTPUTFAIL("FAIL - T&Cs are NOT Scrollable");
		}

		OUTPUT("--- Navigating back to the Welcome Screen ---");

		repo.TriggerClickByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton");

		// Privacy Policy Link Check

		OUTPUT("--- Checking Privacy Policy Link ---");

		repo.pause(2000);

		OUTPUT("--- Tapping Privacy Policy Link ---");

		repo.TriggerClickById(bind.privacy_Link);

		repo.pause(2000);

		OUTPUT("--- Checking URL is Correct ---");

		id = "com.android.chrome:id/url_bar";
		expectedResult = "https://www.rac.co.uk/legal-information/privacy-policy";

		if (repo.TextBoxStartsWithById(id, expectedResult)) {
			OUTPUT("PASS - URL Matches");
		} else {
			OUTPUTFAIL("FAIL - URL does not Match");
		}

		OUTPUT("--- Navigating back to the Welcome Screen ---");

		repo.Back();

		OUTPUT("***** COMPLETED - WELCOME PAGE TESTS *****");

	}

	@After
	public void tearDown() {

		driver.quit();
	}
}
